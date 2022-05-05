/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class Test {
    private String name = "Test-Bean";
    /**
     * Creates a new instance of Test
     */
    public Test() {
    }
    
    public String getName(){
        return this.name;
    }
    
}
