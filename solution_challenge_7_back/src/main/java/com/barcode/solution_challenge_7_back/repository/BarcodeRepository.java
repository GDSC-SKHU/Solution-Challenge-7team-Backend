package com.barcode.solution_challenge_7_back.repository;

import com.barcode.solution_challenge_7_back.domain.BarCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarcodeRepository extends JpaRepository<BarCode, Integer> {
    BarCode findByBarcodeNumber(String barcodeNumber);


}