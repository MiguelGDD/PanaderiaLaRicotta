/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author angel
 */
public class NodoAll {
    
    public int IDProducto;
    public NodoAll sig;
    
    public NodoAll(){
    
    sig=null;
    }
    
    public NodoAll(NodoAll dato){
    IDProducto= dato.IDProducto;
    sig=null;
    }
}
