package com.springbootlesson.lesson1.service;

import com.springbootlesson.lesson1.model.entity.Model;
import com.springbootlesson.lesson1.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;
    @Transactional(rollbackFor = Exception.class)
    public Model saveModel(Model model){
        return modelRepository.save(model);
    }
}
