package edu.miu.asdmidtermexam.service;

import edu.miu.asdmidtermexam.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantService {

    Optional<Plant> createNewPlant(Plant plant);
    Optional<Plant> updatePlant(Plant updatedPlant);
    Optional<List<Plant>> getAllPlants();
    void deletePlant(Plant plant);
    Optional<List<Plant>> getAllSortedByPlantName();
    Optional<List<Plant>> getAllSortedByPlantDate();
}
