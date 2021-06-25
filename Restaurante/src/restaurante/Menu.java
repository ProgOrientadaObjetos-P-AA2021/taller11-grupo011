/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author ASUS
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;
    
    public Menu(String nom,double vI){
        nombrePlato=nom;
        valorInicial=vI;

    }
    
    public void establecerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    public abstract void establecerValorMenu();

    public void establecerValorInicial(double tipo){
        valorInicial = tipo;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    public double obtenerValorInicial(){
        return valorInicial;
    }
    public double obtenerValorMenu(){
        return valorMenu;
    }
}
