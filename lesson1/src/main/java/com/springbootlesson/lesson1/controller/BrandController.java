package com.springbootlesson.lesson1.controller;

import com.springbootlesson.lesson1.model.dto.BrandDTO;
import com.springbootlesson.lesson1.model.entity.Brand;
import com.springbootlesson.lesson1.service.BrandService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
  public ResponseEntity<List<Brand>> getBrand() {
    return new ResponseEntity<>(brandService.getBrand(), HttpStatus.OK);
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<BrandDTO> getBrandById(@PathVariable Long id) {
    return new ResponseEntity<>(brandService.getById(id), HttpStatus.OK);
  }
}
