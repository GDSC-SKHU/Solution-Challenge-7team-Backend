package com.example.barcode.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name="BarCode")
public class BarCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // 인덱스

    @Column(name = "barcode_number")
    private int number; // 바코드 번호

    @Column(nullable = false, length = 20)
    private String goods_name; // 상품 이름

    @Column(nullable = false, length = 200)
    private String how; // 분리수거 총 방법

    @OneToOne
    @JoinColumn(name = "id")
    private Recycle recycle;

}
