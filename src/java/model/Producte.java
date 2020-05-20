package model;

import java.util.List;

public class Producte {
    // PRIMARY KEY 
    String idProducte;
    String nom;
    String desc;
    // 1 product can have N allergens 
    List<Allergogen> allergogens;

    public Producte(String idProducte, String nom, String desc) {
        this.idProducte = idProducte;
        this.nom = nom;
        this.desc = desc;
    }

    public Producte(String idProducte, String nom, String desc, List<Allergogen> allergogens) {
        this.idProducte = idProducte;
        this.nom = nom;
        this.desc = desc;
        this.allergogens = allergogens;
    }

    public String getIdProducte() {
        return idProducte;
    }

    public void setIdProducte(String idProducte) {
        this.idProducte = idProducte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Allergogen> getAllergogens() {
        return allergogens;
    }

    public void setAllergogens(List<Allergogen> allergogens) {
        this.allergogens = allergogens;
    }
    
    
}
