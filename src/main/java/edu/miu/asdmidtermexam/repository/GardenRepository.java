package edu.miu.asdmidtermexam.repository;

import edu.miu.asdmidtermexam.model.Garden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GardenRepository extends JpaRepository<Garden, Integer> {
}
