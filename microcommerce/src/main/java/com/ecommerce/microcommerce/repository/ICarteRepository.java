package com.ecommerce.microcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microcommerce.model.Carte;

public interface ICarteRepository extends JpaRepository<Carte, Long> {

}
