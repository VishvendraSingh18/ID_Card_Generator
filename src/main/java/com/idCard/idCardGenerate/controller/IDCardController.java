package com.idCard.idCardGenerate.controller;

import com.idCard.idCardGenerate.model.IDCard;
import com.idCard.idCardGenerate.service.IDCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping("/api/idcards")
@CrossOrigin
public class IDCardController {

    @Autowired
    private IDCardService idCardService;

    @PostMapping("/upload")
    public IDCard uploadIDCard(@RequestBody IDCard request) {

        return idCardService.saveIDCard(request);
    }
}
