/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author ADMIN
 */
public class Constructores {

   public Constructores(){
    
        System.out.println("Método Constructor sin argumentos");
    }
    
    public Constructores(int num1){
    
        System.out.println("Método Constructor con 1 argumento : " + num1);
    }
    
    public Constructores(int num1, int num2){
    
        System.out.println("Método Constructor con 2 argumentos : " + num1 + ", " + num2);
    }
    
    public static void main(String[] args) {
        
        Constructores obj1 = new Constructores();
        
        Constructores obj2 = new Constructores(4);
        
        Constructores obj3 = new Constructores(4,8);
        
    }
    
}
