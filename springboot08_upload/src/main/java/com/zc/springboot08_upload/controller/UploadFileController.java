package com.zc.springboot08_upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/24 17:06
 */
@Controller
//@RestController无法返回upload.ftl页面，会显示upload文字
public class UploadFileController {
    @GetMapping("/upload")
    public String index(){
        return "upload";
    }

    /*
     * 文件上传
     * <p>Title: upload</p>
     * <p>Description: </p>
     * @param file
     * @return
     */
    @PostMapping("/test")
    @ResponseBody
    public Map<String, Object> upload(MultipartFile file){
        Map<String, Object> result = new HashMap<>();
        if (file != null && !file.isEmpty()){
            try {
                file.transferTo(new File("d:/"+file.getOriginalFilename()));
                result.put("code", 0);
                result.put("msg", "success");
            } catch (IOException e) {
                result.put("code", -1);
                result.put("msg", "文件上传出错，请重新上传！");
                e.printStackTrace();
            }
        } else {
            result.put("code", -1);
            result.put("msg", "未获取到有效的文件信息，请重新上传!");
        }
        return result;
    }
}
