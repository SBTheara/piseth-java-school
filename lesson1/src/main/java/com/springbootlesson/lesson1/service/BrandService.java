package com.springbootlesson.lesson1.service;

import com.springbootlesson.lesson1.exception.ApiException;
import com.springbootlesson.lesson1.model.dto.BrandDTO;
import com.springbootlesson.lesson1.model.entity.Brand;
import com.springbootlesson.lesson1.repository.BrandRepository;
import com.springbootlesson.lesson1.utils.MapperUtil;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {
  private final BrandRepository brandRepository;

  public Brand saveBrand(BrandDTO brandDTO) {
    return brandRepository.save(MapperUtil.toEntity(brandDTO));
  }

  public List<Brand> getBrand() {
    return brandRepository.findAll();
  }

  public BrandDTO getById(Long id) {
    return MapperUtil.toDTO(
        brandRepository
            .findById(id)
            .orElseThrow(
                () -> new ApiException(HttpStatus.NOT_FOUND, "Not found for this product")));
  }
}
