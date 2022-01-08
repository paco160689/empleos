package com.frus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frus.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
