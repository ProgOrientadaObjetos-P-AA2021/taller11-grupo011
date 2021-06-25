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
public class MenudelDia extends Menu{

    protected double valorPostre;
    protected double valorBebida;
    
    public MenudelDia(String nom,double vI,double vP,double vB){
        super(nom,vI);
        establecerValorPostre(vP);
        establecerValBebidas(vB);
    }
    
    @Override
    public void establecerNombrePlato(String n){
        nombrePlato= n;
    }
    
    public void establecerValorMenu(double n){
        valorMenu=n;
    }
    
    @Override
    public void establecerValorInicial(double n){
        valorInicial=n;
    }
    
    public void establecerValorPostre(double n){
        valorPostre=n;
    }
    
    public void establecerValBebidas(double n){
        valorBebida=n;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    public double obtenerValBebidas(){
        return valorBebida;
    }
}
