package com.sagres.devismaker.Model;

import java.io.Serializable;

public class Produit implements Serializable {

    private String nom;
    private int prix;

    /**
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the age
     */
    public int getPrix() {
        return prix;
    }

    /**
     * @param prix the age to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "MyJson [name=" + nom + ", age=" + prix + "]";
    }

}