/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author Estuardo
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Doctor cola = new Doctor();
        int op;
        String num;
        
        do{
            System.out.println("\t MENU\n");
            System.out.println("\t1 Agregar a Cola");
            System.out.println("\t2 Borrar Elemento de Cola");
            System.out.println("\t3 Mostrar");
            System.out.println("\t4 Salir\n");
            System.out.println("\t Elija una Opcion:");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Ingrese un Nombre:\n");
                    num = leer.next();
                    cola.insertarCola(num);
                    break;
                    
                case 2:
                    System.out.println("Se Borrara el Elemento de la Cola\n");
                    cola.sacarCola();
                    break;
                    
                case 3:
                    System.out.println("\t Cola:\n");
                    cola.mostarCola();
                    break;
                    
                case 4:
                    System.out.println("FIN\n");
                    break;
                    
           
                   }
        }while(op!=4);
        
    }
    }
    

