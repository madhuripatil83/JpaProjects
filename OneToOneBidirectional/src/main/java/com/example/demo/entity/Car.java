package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "cars")
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Car {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(name = "horsepower")
    private int horsepower;

    // note that the annotation and field are new
    @OneToOne(
            // indicates that this is the child side of a 
            // relationship and refers to the field in the Driver 
            // class that defines the relationship there
            mappedBy = "car"
    )
    private Driver driver;

}
