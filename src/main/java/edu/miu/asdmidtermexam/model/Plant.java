package edu.miu.asdmidtermexam.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "plants")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "plant_id")
    private Integer plantId;

    private String name;
    private String type;
    private LocalDate plantDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "garden_id")
    private Garden garden;

    public Plant(String name, String type, LocalDate plantDate) {
        this.name = name;
        this.type = type;
        this.plantDate = plantDate;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "Plant =" + plantId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", plantDate=" + plantDate +
                ", gardenId=" + garden.getGardenId() +
                '}';
    }
}
