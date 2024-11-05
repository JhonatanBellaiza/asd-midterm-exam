package edu.miu.asdmidtermexam;

import edu.miu.asdmidtermexam.model.Garden;
import edu.miu.asdmidtermexam.model.Plant;
import edu.miu.asdmidtermexam.service.GardenService;
import edu.miu.asdmidtermexam.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class AsdMidtermExamApplication {

    private final GardenService gardenService;
    private final PlantService plantService;

    public static void main(String[] args) {
        SpringApplication.run(AsdMidtermExamApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {

            //Load Data

            //Load Gardens

            Garden g1 = new Garden("Vegetable Patch", 50.00);
            Garden g2 = new Garden("Herb Garden", 20.0);

            gardenService.createNewGarde(g1);
            gardenService.createNewGarde(g2);

            //Load Plants

            Plant p1 = new Plant("Tomato", "Vegetable",  LocalDate.of(2024, 3,10));
            Plant p2 = new Plant("Carrot", "Vegetable", LocalDate.of(2024,2,20));
            Plant p3 = new Plant("Basil", "Herb", LocalDate.of(2024,4,5));

            p1.setGarden(g1);
            p2.setGarden(g1);
            p3.setGarden(g2);

            plantService.createNewPlant(p1);
            plantService.createNewPlant(p2);
            plantService.createNewPlant(p3);

            //Update

            g1.setPlants(List.of(p1,p2));
            g2.setPlants(List.of(p3));

            gardenService.updateGarde(g1);
            gardenService.updateGarde(g2);


            //OUTPUT

            System.out.println("*****************************************************************");
            System.out.println();
            System.out.println("Display All Gardens");
            gardenService.getAllGardens().get().forEach(garden -> System.out.println(garden.toString()));
            System.out.println();
            System.out.println("Display All Plants Sorted by Name");
            plantService.getAllSortedByPlantName().get().forEach(plant -> System.out.println(plant.toString()));
            System.out.println();
            System.out.println("Display All plants sorted by Plant Date");
            plantService.getAllSortedByPlantDate().get().forEach(plant -> System.out.println(plant.toString()));
            System.out.println();
            System.out.println("*******************************************************************");

        };
    }
}
