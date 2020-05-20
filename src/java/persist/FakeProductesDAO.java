/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.util.ArrayList;
import java.util.List;
import model.Allergogen;
import model.Producte;

public final class FakeProductesDAO {
    
    List<Producte> productes;
    
    public FakeProductesDAO() {
        if(productes==null) {
            productes = new ArrayList<>();
            afegeixProductesProva();
        }
    }
    
    private void afegeixProductesProva() {
        
        productes.add(new Producte("p1","Amanida enciam","Lliure d'al.lergogens"));
        
        List<Allergogen> allergogensProducte2 = new ArrayList<>();
        allergogensProducte2.add(new Allergogen("a1","Peix","blue"));
        allergogensProducte2.add(new Allergogen("a2","Marisc","red"));
        productes.add(
            new Producte("p2","Amanida de tonyina i marisc","Bonissima",allergogensProducte2));
        
        List<Allergogen> allergogensProducte3 = new ArrayList<>();
        allergogensProducte3.add(new Allergogen("a3","Lactosa","yellow"));
        productes.add(
            new Producte("p3","Amanida amb formatge de cabra","",allergogensProducte3));
        
        List<Allergogen> allergogensProducte4 = new ArrayList<>();
        allergogensProducte4.add(new Allergogen("a4","Ous","orange"));
        productes.add(
            new Producte("p4","Truita de patata","Bonissima",allergogensProducte4));
      
        List<Allergogen> allergogensProducte5 = new ArrayList<>();
        allergogensProducte5.add(new Allergogen("a5","Gluten","orange"));
        allergogensProducte5.add(new Allergogen("a6","Api","green"));
        allergogensProducte5.add(new Allergogen("a3","Lactosa","yellow"));
        productes.add(
            new Producte("p5","Puré de verdures del temps","Amb patata, api, pastanaga, una mica de llet...",allergogensProducte5));
        
        productes.add(
            new Producte("p6","Puré de verdures del temps sense al.lergogens","Lliure de components al.lergogens."
                    + " Hem eliminat gluten, api i lactosa de la recepta original"));
        
        List<Allergogen> allergogensProducte7 = new ArrayList<>();
        allergogensProducte7.add(new Allergogen("a7","Fructosa","green"));
        productes.add(
            new Producte("p7","Arròs de verdures","Bonissima, verdures de km0",allergogensProducte7));
    }
    
    
    public List<Producte> llistaProductes() {
        return productes;
    }
    
    public Producte cercaProcutePerId(String idProcucte) {
        return null;
    }
}
