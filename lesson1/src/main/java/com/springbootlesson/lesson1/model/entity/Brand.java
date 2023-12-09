package com.springbootlesson.lesson1.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(
        name = "brand_sequence_generator",
        sequenceName = "brand_sq_gen",
        initialValue = 1
)
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "brand_sequence_generator")
    @Column(name = "brand_id")
    private Long id;
    private String name;
}
