package com.example.demo.dao;

import com.example.demo.entity.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CurrencyDAO extends JpaRepository<CurrencyEntity, UUID> {

    List<CurrencyEntity> findAllByCurrencyDate(String currencyDate);

}
