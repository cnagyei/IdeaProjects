package com.oath.africa.presentation;

import com.oath.africa.business.AnimalDTO;
import com.oath.africa.business.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public List<AnimalDTO> getAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/animals/{id}")
    public  AnimalDTO getAnimalById(@PathVariable Integer id) {
        return animalService.getAnimalById(id);
    }

    @PostMapping("/animals")
    public String saveAnimal(@RequestBody AnimalDTO animalDTO) {
        animalService.saveAnimal(animalDTO);
        return String.format("%s saved successfully!", animalDTO.getName());
    }

    @PutMapping("/animals/{id}")
    public String replaceAnimal(@PathVariable Integer id, @RequestBody AnimalDTO animalDTO) {
        animalService.updateAnimalById(id, animalDTO);
        return String.format("Animal with id %d replaced successfully!", id);
    }

    @PatchMapping("/animals/{id}")
    public String patchAnimal(@PathVariable Integer id, @RequestBody AnimalDTO animalDTO) {
        animalService.patchAnimalById(id, animalDTO);
        return String.format("Animal with id %d updated successfully!", id);
    }
}
