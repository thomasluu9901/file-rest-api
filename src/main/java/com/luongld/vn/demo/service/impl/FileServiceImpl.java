package com.luongld.vn.demo.service.impl;

import com.luongld.vn.demo.response.UploadFileResponse;
import com.luongld.vn.demo.service.FileService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileServiceImpl implements FileService {
    @Override
    public UploadFileResponse uploadFile(MultipartFile file) {
        return null;
    }
}
