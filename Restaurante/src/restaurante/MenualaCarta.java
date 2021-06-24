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
public class MenualaCarta extends Menu{

    protected double valorGuarnicion;
    protected double valorBebida;
    protected double valorAdicion;
    
    public MenualaCarta(String nom,double vI, double Vm,double vg,
            double vB,double vA){
        super(nom,vI,Vm);
    }
    
    @Override
    public void establecerNombrePlato(String n){
        nombrePlato= n;
    }
    
    @Override
    public void establecerValorMenu(double n){
        valorMenu=n;
    }
    
    @Override
    public void establecerValorInicial(double n){
        valorInicial=n;
    }
    
    public void establecerValorGuarnicion(double n){
        valorGuarnicion=n;
    }
    
    public void establecerValBebidas(double n){
        valorBebida=n;
    }
    
    public void establecerValorAdicion(double n){
        valorAdicion=n;
    }
    
    public double obtenerValorGuarnicion(){
        return valorGuarnicion;
    }
    public double obtenerValBebidas(){
        return valorBebida;
    }
    
    public double obtenerValorAdicion(){
        return valorAdicion;
    }
}
