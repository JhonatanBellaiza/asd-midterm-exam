package edu.miu.asdmidtermexam.repository;

import edu.miu.asdmidtermexam.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlantRepository extends JpaRepository<Plant, Integer> {

}
