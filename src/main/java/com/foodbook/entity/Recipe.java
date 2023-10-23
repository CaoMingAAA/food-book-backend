package com.foodbook.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Recipe{
    private String id;

    private String name;

    private String durations;

    // 成分物质
    private List<Ingredient> ingredients;

    private List<String> steps;

    private List<KitchenTool> kitchenTool;

    // 总体营养成分 计算得来
    private Map<String, Double> nutritionInfo;

    private String author;

}