package com.luongld.vn.demo.controller;


import com.luongld.vn.demo.response.UploadFileResponse;
import com.luongld.vn.demo.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("${spring.base.url}")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;
    @GetMapping("download")
    public String downloadFile(@RequestParam(value = "path",required = false)String path){
     return "dowload file!!!";
    }
    @PostMapping("upload")
    public UploadFileResponse uploadFile(@RequestPart ("file") MultipartFile file) throws IOException {
        UploadFileResponse response = new UploadFileResponse();
        fileService.uploadFile(file);
        return response;
    }
}
