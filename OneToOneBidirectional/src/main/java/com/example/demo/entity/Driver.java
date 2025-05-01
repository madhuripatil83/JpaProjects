package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity
@Table(name = "drivers")
public class Driver {   //owner side

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, updatable = false)
    private String name;

    @OneToOne(
            // a car will only be retrieved from the database when 
            // it is explicitly accessed
            fetch = FetchType.LAZY,
            // you must specify a Car before you save the Driver
            optional = false,
            // all save/persist operations will be propagated 
            // through to the Car
            cascade = CascadeType.PERSIST
    )
   // @JoinColumn
    private Car car;
}
