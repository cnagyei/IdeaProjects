package com.oath.africa.business;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AnimalMapper {
    private final ModelMapper modelMapper;

    public  AnimalMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    AnimalDTO toDTO(Optional<Animal> animal) {
        return modelMapper.map(animal, AnimalDTO.class);
    }

    Animal  toEntity(AnimalDTO animalDTO) {
        return modelMapper.map(animalDTO, Animal.class);
    }
}
