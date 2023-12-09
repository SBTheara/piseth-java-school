package com.springbootlesson.lesson1.controller;

import com.springbootlesson.lesson1.model.entity.Model;
import com.springbootlesson.lesson1.repository.ModelRepository;
import com.springbootlesson.lesson1.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/model/v1")
public class ModelController {
    private final ModelService modelService;
    @PostMapping("/save")
    public ResponseEntity<Model> saveModel(@RequestBody Model model){
        return new ResponseEntity<>(modelService.saveModel(model), HttpStatus.CREATED);
    }
}
