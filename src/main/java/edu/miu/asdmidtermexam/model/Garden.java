package edu.miu.asdmidtermexam.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "gardens")
public class Garden {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "garden_id")
    private Integer gardenId;

    private String name;
    private double size;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "garden")
    private List<Plant> plants;

    public Garden(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Garden =" + gardenId +
                ", Name ='" + name + '\'' +
                ", Size =" + size +
                '}';
    }
}
