/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Cuenta {
    
    protected String nomCliente;
    protected ArrayList<Menu> menu = new ArrayList<>();
    protected double iva;
    protected double valorTotal;
    protected double subTotal;
   
    
    public Cuenta(String n, ArrayList<Menu> lista,double i) {
        nomCliente = n;
        menu = lista;
        iva=i;    
    }
    
    public void establecerNombreCliente(String tipo){
        nomCliente = tipo;
    }
    
    public void establecerMenus(ArrayList<Menu> lista) {
        menu = lista;
    }
    
    public void establecerIva(double tipo){
        iva = tipo;
    }
    public void establecerValorTotal(){
        valorTotal = subTotal+(subTotal*iva);
    }
    public void establecerSubTotal(){
<<<<<<< HEAD
        for(int i = 0; i < obtenerMenu().size();i++){
            subTotal=subTotal+obtenerMenu().get(i).valorMenu;
        }
    }

=======
        for (int i = 0; i < menu.size(); i++) {         
            subTotal = menu.get(i).obtenerValorMenu()+iva;     
        }     
    }
    public void establecerMenu(ArrayList<Menu> lista) {
        menu = lista;
    }
    
    
>>>>>>> 92540bd4f46be2253fbe8334a369fe7cb557cb97
    public String obtenerNombreCliente(){
        return nomCliente;
    }
    
    public double obtenerIva(){
        return iva;
    }
    public double obtenerValorTotal(){
        return valorTotal;
    }
    public double obtenerSubTotal(){
        return subTotal;
    }
    public ArrayList<Menu> obtenerMenu() {
        return menu;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cuenta a pagar: \n"
                + "Nombre: %s\n"
                + "Menú:\n\n", obtenerNombreCliente());

        for (int i = 0; i < obtenerMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }
<<<<<<< HEAD
    
        cadena = String.format("\n%sSubtotal de cuenta: %.2f\n"
                + "Iva: %.2f\n"
                + "Total de cuenta: %.2f\n",
                cadena,
                obtenerSubTotal(),obtenerIva(),obtenerValorTotal());
=======
        cadena = String.format("\n%sValor Total a cancelar: %.2f\n"
                + "SubTotal: %.2f\n"
                + "Iva: %2.f\n",
                cadena,
                obtenerValorTotal(),obtenerSubTotal(),obtenerIva());
>>>>>>> 92540bd4f46be2253fbe8334a369fe7cb557cb97
        return cadena;
    }
  
}
