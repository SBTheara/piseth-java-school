package com.springbootlesson.lesson1.model.dto;

import jakarta.persistence.ManyToOne;

public class ModelDTO {
    private String name;
    @ManyToOne
    private BrandDTO brandDTO;
}
