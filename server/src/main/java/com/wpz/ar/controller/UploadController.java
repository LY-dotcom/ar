package com.wpz.ar.controller;

import com.wpz.ar.util.ARConstant;
import com.wpz.ar.util.R;
import lombok.val;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/27 11:29
 */
@RestController
@RequestMapping("/api/file")
public class UploadController {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
    @PostMapping("/upload")
    public R fileupload(MultipartFile file, HttpServletRequest req) {
        Map<String, Object> result = new HashMap<>();
        String format = sdf.format(new Date());
        String realPath = ARConstant.DIR_PATH + sdf.format(new Date());
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(realPath, newName));
            String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/api/static/" + format + newName;
            result.put("name", oldName);
            result.put("url", url);
        } catch (IOException e) {
            return R.fail(e.getMessage());
        }
        return R.ok(result);
    }
}
