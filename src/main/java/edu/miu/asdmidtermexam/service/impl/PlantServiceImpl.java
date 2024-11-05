package edu.miu.asdmidtermexam.service.impl;

import edu.miu.asdmidtermexam.model.Plant;
import edu.miu.asdmidtermexam.repository.PlantRepository;
import edu.miu.asdmidtermexam.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlantServiceImpl implements PlantService {

    private final PlantRepository plantRepository;
    @Override
    public Optional<Plant> createNewPlant(Plant plant) {
        return Optional.of(plantRepository.save(plant));
    }

    @Override
    public Optional<Plant> updatePlant(Plant updatedPlant) {
        return Optional.of(plantRepository.save(updatedPlant));
    }

    @Override
    public Optional<List<Plant>> getAllPlants() {
        return Optional.of(plantRepository.findAll());
    }

    @Override
    public void deletePlant(Plant plant) {
        plantRepository.delete(plant);
    }

    @Override
    public Optional<List<Plant>> getAllSortedByPlantName() {
        Comparator<Plant> comparatorPlantName = Comparator.comparing(Plant::getName);
        List<Plant> plantList = plantRepository.findAll();
        return Optional.of(plantList.stream()
                .sorted(comparatorPlantName)
                .collect(Collectors.toList()));
    }

    @Override
    public Optional<List<Plant>> getAllSortedByPlantDate() {
        Comparator<Plant> comparatorPlantDate  = Comparator.comparing(Plant::getPlantDate);
        List<Plant> plantList = plantRepository.findAll();
        return Optional.of(plantList.stream()
                .sorted(comparatorPlantDate)
                .collect(Collectors.toList()));
    }
}
