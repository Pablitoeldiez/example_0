package com.example.shop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Entity
@Table(name="product")

public class Product {
    @Id
    @Column(name = "id", nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;

    String description;

    float price;

    boolean isActive = true;
}
