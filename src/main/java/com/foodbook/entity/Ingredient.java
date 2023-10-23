package com.foodbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {

    private String id;

    private String name;

    private String calories;

    private String protein;

    private String fat;

    private String carbohydrates;
}