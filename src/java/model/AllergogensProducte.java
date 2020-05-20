package model;

/**
 * Un Allergogen és present en molts Productes; i alhora un producte té molts allergogens.
 * Aquesta taula és producte de la relació mxn de les anteriors entitats.
 */
public class AllergogensProducte {
    // PRIMARY KEY 
    String idAllergogen;
    // PRIMARY KEY 
    String idProducte;
}
