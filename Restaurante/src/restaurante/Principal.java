/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Menu> listaMenus = new ArrayList<>();
    }
    
    MenuNiño menunino1= new MenuNiño("Plato 1",5,1.5,3.5);
    
    MenuNiño menunino2= new MenuNiño("Plato 2",5,3.5,5);
    
    MenuEconomico menuE1= new MenuEconomico("Plato 3",5,10);
    
    MenudelDia menudia=new MenudelDia("Plato 4", 5, 5, 2.5);
    
    MenualaCarta menucarta=new MenualaCarta("Plato 5", 5, 4.5, 1.5, 10);
    
    
    
    listaMenus.add(menunino1);
    listaMenus.add(menunino2);
    listaMenus.add(menuE1);
    listaMenus.add(menudia);
    listaMenus.add(menucarta);
    
    for (int i = 0; i < listaMenus.size(); i++) {
        listaMenus.get(i).establecerValorMenu();
        
            System.out.println(listaMenus.get(i));
            System.out.println();
    }
}
