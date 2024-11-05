package edu.miu.asdmidtermexam.service.impl;

import edu.miu.asdmidtermexam.model.Garden;
import edu.miu.asdmidtermexam.repository.GardenRepository;
import edu.miu.asdmidtermexam.service.GardenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GardenServiceImpl implements GardenService {

    private final GardenRepository gardenRepository;
    @Override
    public Optional<Garden> createNewGarde(Garden garden) {
        return Optional.of(gardenRepository.save(garden));
    }

    @Override
    public Optional<Garden> updateGarde(Garden updatedGarden) {
        return Optional.of(gardenRepository.save(updatedGarden));
    }

    @Override
    public Optional<List<Garden>> getAllGardens() {
        return Optional.of(gardenRepository.findAll());
    }

    @Override
    public void deleteGarden(Garden garden) {
        gardenRepository.delete(garden);
    }
}
