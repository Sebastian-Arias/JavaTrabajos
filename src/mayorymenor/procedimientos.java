/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mayorymenor;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB_ELECTRONICA
 */
public class procedimientos {
    
        public void capturar(){
        double n1,n2, n3;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 1")); 
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 2"));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Digite el numero 3"));
        buscarMayor(n1,n2,n3);
    }
        
    public void buscarMayor(double num1, double num2,double num3){
//    int prom;
//    prom=sumatoria/5;
//    System.out.println("El promedio es; "+prom);
//    int cont=contar(prom);
//    System.out.println("La cantidad de valores es; "+cont);
System.out.println("El mayor es; "+num2);
    }
        
}
