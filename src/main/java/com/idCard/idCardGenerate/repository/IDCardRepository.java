package com.idCard.idCardGenerate.repository;

import com.idCard.idCardGenerate.model.IDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IDCardRepository extends JpaRepository<IDCard, Long> {
}
