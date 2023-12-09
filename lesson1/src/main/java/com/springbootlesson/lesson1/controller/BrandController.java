package com.springbootlesson.lesson1.controller;

import com.springbootlesson.lesson1.model.dto.BrandDTO;
import com.springbootlesson.lesson1.model.entity.Brand;
import com.springbootlesson.lesson1.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/brand/v1")
public class BrandController {
    private final BrandService brandService;

    @PostMapping("/save")
    public ResponseEntity<Brand> saveBrand(@RequestBody BrandDTO brandDTO) {
        return new ResponseEntity<>(brandService.saveBrand(brandDTO), HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Brand>> getBrand(){
        return new ResponseEntity<>(brandService.getBrand(),HttpStatus.OK);
    }
}
