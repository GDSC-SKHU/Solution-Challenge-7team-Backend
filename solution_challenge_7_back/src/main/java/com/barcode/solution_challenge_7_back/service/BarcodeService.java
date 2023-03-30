package com.barcode.solution_challenge_7_back.service;

import com.barcode.solution_challenge_7_back.domain.BarCode;
import com.barcode.solution_challenge_7_back.domain.dto.BarcodeDto;
import com.barcode.solution_challenge_7_back.exception.BarcodeNotFoundException;
import com.barcode.solution_challenge_7_back.repository.BarcodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BarcodeService {
    private final BarcodeRepository barcodeRepository;

    public BarcodeDto getProductInfoByBarcode(String barcodeNumber){
        BarCode barCode = barcodeRepository.findByBarcodeNumber(barcodeNumber);
        if (barCode == null) {
            throw new BarcodeNotFoundException();
        }
        return new BarcodeDto(barCode.getGoods_name(), barCode.getHow(), barCode.getMethod());
    }

}