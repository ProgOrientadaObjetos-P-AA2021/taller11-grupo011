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
    
    public MenuEconomico(String nom, double vI, double Vm,double des){
        super( nom,vI,Vm);
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
    @Override
    public String toString() {
        String cadena = String.format("Menú Económico: \n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor Menú: %.2f\n"
                + "Descuento: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial(),
                obtenerValorMenu(),
                obtenerDescuento()); 
        return cadena;
    }
}
