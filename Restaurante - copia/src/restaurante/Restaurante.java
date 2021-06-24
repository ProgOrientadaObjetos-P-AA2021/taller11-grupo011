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
public abstract class Restaurante {

    protected String nombreCliente;
    protected double valorCancelarTotal;
    protected double subTotal;
    protected double iva;
    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;
    
    public Restaurante(String n,double vT, double sT,double i, String nom,
            double vI, double Vm){
        
    }
    
    public void establecerNombreCliente(String tipo){
        nombreCliente = tipo;
    }
    public void establecerValorCancelarTotal(double tipo){
        valorCancelarTotal = tipo;
    }
    public void establecerSubTotal(double tipo){
        subTotal = tipo;
    }
    public void establecerIva(double tipo){
        iva = tipo;
    }
    public void establecerNombrePlato(String tipo){
        nombrePlato = tipo;
    }
    public void establecerValorMenu(double tipo){
        valorMenu = tipo;
    }
    public void establecerValorInicial(double tipo){
        valorInicial = tipo;
    }
    
    public String obtenerNombreCliente(){
         return nombreCliente;
    }
    public double obtenerValorCancelarTotal(){
        return valorCancelarTotal;
    }
    public double obtenerSubTotal(){
        return subTotal;
    }
    public double obtenerIva(){
        return iva;
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
