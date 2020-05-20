package model;

public class Allergogen {
    // PRIMARY KEY 
    String idAllergogen;
    String nom;
    /**
      * Color, in English or in hexadecimal format.
    */
    String color;

    public Allergogen(String idAllergogen, String nom, String color) {
        this.idAllergogen = idAllergogen;
        this.nom = nom;
        this.color = color;
    }

    public String getIdAllergogen() {
        return idAllergogen;
    }

    public void setIdAllergogen(String idAllergogen) {
        this.idAllergogen = idAllergogen;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
