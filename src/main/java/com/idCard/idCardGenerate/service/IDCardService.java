package com.idCard.idCardGenerate.service;

import com.idCard.idCardGenerate.model.IDCard;
import com.idCard.idCardGenerate.repository.IDCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDCardService {

    @Autowired
    private IDCardRepository repository;

    public IDCard saveIDCard(IDCard idCard) {
        return repository.save(idCard);
    }
}
