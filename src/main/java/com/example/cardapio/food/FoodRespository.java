package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;
public interface FoodRespository extends JpaRepository<Food, Long> {
}
