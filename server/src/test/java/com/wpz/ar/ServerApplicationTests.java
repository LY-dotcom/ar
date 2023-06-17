package com.wpz.ar;

import com.wpz.ar.domain.Company;
import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationType;
import com.wpz.ar.mapper.CompanyMapper;
import com.wpz.ar.mapper.StationMapper;
import com.wpz.ar.mapper.StationTypeMapper;
import com.wpz.ar.util.ARUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@SpringBootTest
class ServerApplicationTests {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private StationMapper stationMapper;

    @Autowired
    StationTypeMapper stationTypeMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testAddStudents() throws Exception {
        String md5 = ARUtil.getMD5("Ww233435.");
        System.out.println(md5);

        String md52 = ARUtil.getMD5("Ww233435.");
        System.out.println(md52);



    }
}
