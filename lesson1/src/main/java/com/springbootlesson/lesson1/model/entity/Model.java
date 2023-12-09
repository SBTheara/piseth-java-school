package com.springbootlesson.lesson1.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "models")
@SequenceGenerator(
        name = "models_sequence_generator",
        sequenceName = "models_seq_gen",
        allocationSize = 1
)
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "models_sequence_generator")
    private Long id;
    private String name;
    @ManyToOne
    private Brand brand;
}
