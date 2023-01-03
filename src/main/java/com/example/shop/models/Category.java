package com.example.shop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Entity
@Table(name="category")
public class Category {
    @Id
    @Column(name="id", nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column
    String description;

}
