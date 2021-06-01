package com.exemple.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id
	private int id;
	int quantite;
	private String titre;
	private float prixu , prixv;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}
	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the prixu
	 */
	public float getPrixu() {
		return prixu;
	}
	/**
	 * @param prixu the prixu to set
	 */
	public void setPrixu(float prixu) {
		this.prixu = prixu;
	}
	/**
	 * @return the prixv
	 */
	public float getPrixv() {
		return prixv;
	}
	/**
	 * @param prixv the prixv to set
	 */
	public void setPrixv(float prixv) {
		this.prixv = prixv;
	}
	public Produit(int id, int quantite, String titre, float prixu, float prixv) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.titre = titre;
		this.prixu = prixu;
		this.prixv = prixv;
	}
	
	
	public Produit() {
		super();
	}
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", quantite=" + quantite + ", titre=" + titre + ", prixu=" + prixu + ", prixv="
				+ prixv + "]";
	}
 
	
	

}
