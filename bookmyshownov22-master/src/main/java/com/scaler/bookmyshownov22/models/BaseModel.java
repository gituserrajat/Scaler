package com.scaler.bookmyshownov22.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass // Schema Design
@Getter
@Setter
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "identity")
    private Long id;
}
