package com.example.padaria.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.padaria.models.PadariaModel;

public interface PadariaRepository extends  JpaRepository<PadariaModel, Long> {
}
