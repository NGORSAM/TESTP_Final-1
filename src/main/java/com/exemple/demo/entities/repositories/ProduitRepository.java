package com.exemple.demo.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exemple.demo.entities.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
