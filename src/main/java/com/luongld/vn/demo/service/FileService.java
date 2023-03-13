package com.luongld.vn.demo.service;

import com.luongld.vn.demo.response.UploadFileResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileService {
    UploadFileResponse uploadFile(MultipartFile file);
}
