package com.zhang.spring.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传
 *
 * @RestController 该注解会将返回值自动封装成json串
 */
@RestController
public class FileUploadController {

    @RequestMapping("/fileupload.do")
    public Map<String,Object> fileupload (MultipartFile filename, HttpServletRequest request) throws Exception{
        Map<String,Object>  map  = new HashMap<>();
        String path = request.getServletContext().getRealPath("/") +  "file" + File.separator;
        File directory = new File(path);
        if (!directory.exists()) directory.mkdirs();

        File file = new File(path + filename.getOriginalFilename());
        filename.transferTo(file);
        map.put("msg","ok");
        return map;



    }
}
