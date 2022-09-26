
package nicodiaz;
import java.io.IOException;
import javax.swing.*;

public class Nicodiaz {

    
    public static void main(String[] args) throws IOException {
     JOptionPane.showMessageDialog(null,"Hola ProFe");
     int numero;
     int par=0, impar=0;
     int suma=0;
     
   
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
        if(numero%2 ==0){
            System.out.println("el numero"+numero+"es PAR");
            par= par +1;
        }else{
            System.out.println("el numero"+numero+"es IMPAR");
            impar= impar +1;
        }   
        suma= par + impar;
        System.out.println("Los números pares son:"+par+ "\n Los números Impares son:"+ impar+ "\nEl resultado de la suma es:"+suma);

   
    }
}
    

