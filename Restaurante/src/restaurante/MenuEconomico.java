/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author usuario
 */

public class MenuEconomico extends Menu{
    
    protected double descuento;
    
    public MenuEconomico(String nom, double vI,double des){
        super( nom,vI);
        establecerDescuento(des);
    }
    
    @Override
    public void establecerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    @Override
    public void establecerValorMenu(double tipo){
        valorMenu = tipo;
    }
    @Override
    public void establecerValorInicial(double tipo){
        valorInicial = tipo;
    }
    public void establecerDescuento(double tipo){
        descuento = tipo;

    }
    public double obtenerDescuento(){
        return descuento;
    }
}
