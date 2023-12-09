package com.springbootlesson.lesson1.utils;

import com.springbootlesson.lesson1.model.dto.BrandDTO;
import com.springbootlesson.lesson1.model.dto.BrandsDTO;
import com.springbootlesson.lesson1.model.entity.Brand;

public class MapperUtil {
    public static Brand toEntity(BrandDTO dto){
        Brand brand = new Brand();
        brand.setName(dto.getName());
        return brand;
    }

}
