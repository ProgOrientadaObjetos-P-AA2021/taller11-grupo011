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
public class MenudelDia extends Restaurante{

    protected double valorPostre;
    protected double valorBebida;
    
    public MenudelDia(String n,double vT, double sT,double i, String nom,
            double vI, double Vm,double vP,double vB){
        super( n, vT,sT, i,  nom,vI,Vm);
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
