package com.springbootlesson.lesson1.service;

import com.springbootlesson.lesson1.model.dto.BrandDTO;
import com.springbootlesson.lesson1.model.entity.Brand;
import com.springbootlesson.lesson1.repository.BrandRepository;
import com.springbootlesson.lesson1.utils.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository brandRepository;
    public Brand saveBrand(BrandDTO brandDTO){
        return brandRepository.save(MapperUtil.toEntity(brandDTO));
    }

    public List<Brand> getBrand() {
        return brandRepository.findAll();
    }
}
