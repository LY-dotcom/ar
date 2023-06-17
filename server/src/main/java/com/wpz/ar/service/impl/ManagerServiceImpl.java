package com.wpz.ar.service.impl;

import com.wpz.ar.domain.Manager;
import com.wpz.ar.domain.ManagerExample;
import com.wpz.ar.mapper.ManagerMapper;
import com.wpz.ar.service.ManagerService;
import com.wpz.ar.util.ARUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/27 17:23
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager login(Manager manager) {
        manager.setPassword(ARUtil.getMD5(manager.getPassword()));
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andUsernameEqualTo(manager.getUsername())
                .andPasswordEqualTo(manager.getPassword());
        List<Manager> list = managerMapper.selectByExample(managerExample);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public Manager getManager(Manager manager) {
        return managerMapper.selectByPrimaryKey(manager.getId());
    }
}
