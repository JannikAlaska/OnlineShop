/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class Warenkorb {

    ArrayList cart = new ArrayList<String>();
    
    
    /**
     * Creates a new instance of Warenkorb
     */
    public Warenkorb() {
            createCart();
    }

    public String createCart (){
        cart.add("Brötchen");
        cart.add("Kuchen");
        cart.add("Brezel");
        
        return cart.toString();
    }

    
    public void addArticle (String newArticle){
        cart.add(newArticle);
    }
    
    public String getCart (){
        String cartString = cart.toString();
        return cartString;
    }
    
    
}
