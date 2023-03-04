package com.luongld.vn.demo.service;

import com.luongld.vn.demo.response.UploadFileResponse;
import org.springframework.stereotype.Service;

@Service
public interface FileService {
    UploadFileResponse uploadFile();
}
