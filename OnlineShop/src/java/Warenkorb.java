/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class Warenkorb {

    private final Collection<Artikel> cart = new ArrayList<Artikel>();
    
    
    /**
     * Creates a new instance of Warenkorb
     */
    public Warenkorb() {
        cart.add(new Artikel("Brötchen", 0.25, 25));
        cart.add(new Artikel("Kuchen", 1.20, 7));
        cart.add(new Artikel("Brezeln", 0.70, 12));
    }

    public Collection<Artikel> getCart(){
        return this.cart;
    }
 
    
}
