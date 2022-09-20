package POO;

import javax.swing.JOptionPane;


public class Ejemplo1 {
  //Atributo caracteristicas
  int suma=0;
  

  //metodos 
    public void capturar(){
        int n1,n2, n3, n4,n5;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1")); 
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 3"));
        n4=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 4"));
        n5=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 5"));
        suma=n1+n2+n3+n4+n5;
        promedio(suma);
    }
    
    public void promedio(int sumatoria){
    int prom;
    prom=sumatoria/5;
    System.out.println("El promedio es; "+prom);
    int cont=contar(prom);
    System.out.println("La cantidad de valores es; "+cont);
    }
    
    public int contar(int promedio){
    int cant=3;
    return cant;
    }
}
