package com.barcode.solution_challenge_7_back.exception;

public class BarcodeNotFoundException extends RuntimeException{
    public BarcodeNotFoundException(){
        super("상품 정보를 찾을 수 없습니다.");
    }
}
