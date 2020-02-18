/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Estuardo
 */
public class Doctor {
    
    int tamano;
    String nombre;
    nodoCola inicio, fin;
    
//*-*-*-*-*-*-*-*-*-*-METODOS PARA COLA-*-*-*-*-*-*-*-*-*-*
    //CONSTRUCTOR
    public Doctor(){
        inicio = fin = null;
}
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void insertarCola(String elemento){
        nodoCola nuevo = new nodoCola(elemento);
        if(estaVacia()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        
        fin = nuevo;
        tamano++;
    }
    
    
    public String sacarCola(){
        String auxiliar = inicio.elemento;
        inicio = inicio.siguiente;
        tamano--;
        return auxiliar;
    }
    
    public void mostarCola(){
        nodoCola aux = inicio;
        System.out.println();
        while(aux != null){
            System.out.println("["+aux.elemento+"]");//elemento en cola
            aux = aux.siguiente;
        }
    }
    
    public String inicioCola(){
        return inicio.elemento;
    }
    
    public int tamanoCola(){
        return tamano;
    }
    
}
