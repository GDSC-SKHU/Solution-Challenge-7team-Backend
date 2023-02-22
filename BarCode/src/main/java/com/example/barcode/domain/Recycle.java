package com.example.barcode.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name="recycle") // 분리수거 방법
public class Recycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // 인덱스

    @Column(length = 50)
    private String method; // 방법
}