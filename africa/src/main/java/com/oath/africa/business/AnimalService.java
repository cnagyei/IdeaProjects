package com.oath.africa.business;

import com.oath.africa.persistence.AnimalRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;
    private final AnimalMapper animalMapper;

    public AnimalService(AnimalRepository animalRepository, AnimalMapper animalMapper) {
        this.animalRepository = animalRepository;
        this.animalMapper = animalMapper;
    }

    public void saveAnimal(AnimalDTO animalDTO) {
        Animal animalEntity = animalMapper.toEntity(animalDTO);
        animalRepository.save(animalEntity);
    }

    public AnimalDTO getAnimalById(int id) {
        return animalMapper.toDTO(animalRepository.findById(id)); // Convert animal result to DTO
    }

    public List<AnimalDTO> getAllAnimals() {
        return animalRepository.findAll().stream()
                .map((animal) -> animalMapper.toDTO(Optional.of(animal)))
                .collect(Collectors.toList());
    }

    public void updateAnimalById(int id, AnimalDTO animalDTO) {
        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Animal with id " + id + " not found!"));
        animal.setName(animalDTO.getName());
        animal.setAge(animalDTO.getAge());
        animal.setHabitat(animalDTO.getHabitat());
        animalRepository.save(animal);
    }

    public void patchAnimalById(int id, AnimalDTO animalDTO) {
        Animal animal = animalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Animal with id " + id + " not found!"));

        // Update name
        if (animalDTO.getName() != null && !animalDTO.getName().trim().isEmpty()) {
            animal.setName(animalDTO.getName());
        }

        // Update age
        if (animalDTO.getAge() != null) {
            animal.setAge(animalDTO.getAge());
        }

        // Update habitat
        if (animalDTO.getHabitat() != null && !animalDTO.getHabitat().trim().isEmpty()) {
            animal.setHabitat(animalDTO.getHabitat());
        }

        animalRepository.save(animal);
    }
}
