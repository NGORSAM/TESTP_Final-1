package com.exemple.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.entities.Produit;
import com.exemple.demo.entities.repositories.ProduitRepository;

@RestController
@RequestMapping("produit")
public class ProduitController {
	@Autowired
	ProduitRepository produitRepository;

@GetMapping
public List<Produit>getListProduit() 
{
	return(List<Produit>) produitRepository.findAll();
}
@PostMapping
public Produit createProduct(@Valid @RequestBody Produit produit) {
	return produitRepository.save(produit);
}
 
}
