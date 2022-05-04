/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/* Dies ist eine Test-Änderung

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class Artikel {
    String name = "Brötchen, normal";
    /**
     * Creates a new instance of Artikel
     */
    public Artikel() {
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
}
