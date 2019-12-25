package com.zc.springboot08_upload.controller;

import com.zc.springboot08_upload.utils.ResponseResult;
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

    /**
     * 文件上传，保存到自定义文件夹
     *
     * @param file MultipartFile
     * @return
     */
    @PostMapping("/test")
    @ResponseBody
    public ResponseResult upload(MultipartFile file){
        ResponseResult result=ResponseResult.get();
        if (file != null && !file.isEmpty()){
            try {
                file.transferTo(new File("d:/"+file.getOriginalFilename()));

                result.success("文件上传成功");
            } catch (IOException e) {
                result.error("文件上传失败");
                e.printStackTrace();
            }
        } else {
            result.error("未获取到有效的文件信息，请重新上传！");
        }
        return result;
    }
}
