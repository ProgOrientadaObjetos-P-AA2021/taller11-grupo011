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
public class MenuEconomico extends Restaurante{
    
    protected double descuento;
    
    public MenuEconomico(String n,double vT, double sT,double i, String nom,
            double vI, double Vm,double des){
        super( n, vT,sT, i,  nom,vI,Vm);
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
