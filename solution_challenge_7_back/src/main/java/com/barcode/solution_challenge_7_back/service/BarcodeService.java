package com.barcode.solution_challenge_7_back.service;

import com.barcode.solution_challenge_7_back.domain.BarCode;
import com.barcode.solution_challenge_7_back.domain.dto.BarcodeDto;
import com.barcode.solution_challenge_7_back.repository.BarcodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BarcodeService {
    private final BarcodeRepository barcodeRepository;

//    public BarcodeDto getBarcodeInfo(String barcodeNumber) {
//        Optional<BarCode> barcode = barcodeRepository.findByBarcodeNumber(barcodeNumber);
//        return new BarcodeDto(barcode.get().getGoods_name(),barcode.get().getHow(), barcode.get().getMethod());
//    }

    public BarcodeDto getProductInfoByBarcode(String barcodeNumber){
        BarCode barCode = barcodeRepository.findByBarcodeNumber(barcodeNumber);
        return new BarcodeDto(barCode.getGoods_name(), barCode.getHow(), barCode.getMethod());
    }

}