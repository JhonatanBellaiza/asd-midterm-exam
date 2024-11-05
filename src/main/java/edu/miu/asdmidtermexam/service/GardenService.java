package edu.miu.asdmidtermexam.service;

import edu.miu.asdmidtermexam.model.Garden;

import java.util.List;
import java.util.Optional;

public interface GardenService {

    Optional<Garden> createNewGarde(Garden garden);
    Optional<Garden> updateGarde(Garden garden);
    Optional<List<Garden>> getAllGardens();
    void deleteGarden(Garden garden);
}
