package com.example.cardapio.food;

public class FoodResponseDTO {

    public FoodResponseDTO(Food food){

        this(food.getId(), food.getTitle(),food.getImage(),food.getPrice());
    }

    public FoodResponseDTO(Long id, String title, String image, Integer price) {

    }
}
