/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author arjol
 */
public class Evaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Practica evaluada 1 Armando Layana Camacho
        
        
        //JOptionPane.showMessageDialog(null, "Ingrese el monto de su salario: ");
        JOptionPane.showInputDialog("Ingrese su salario ");

        
      double salario=3000000;
        //multiplicamos el salario por la deduccion del SEM
        double SEM=(salario*0.0925);
        JOptionPane.showMessageDialog(null,"Su monto del SEM es " +SEM);
        

        // multiplicamos el salario por la deduccion del IVM
        double IVM = salario * 0.0508;
        JOptionPane.showMessageDialog(null,"Su monto del IVM es " +IVM);
        
        //Sumamos el SEM y el IVM  para saber la cantidad que la empresa debe de abonar a la CCSS
        double total= SEM+IVM;
           JOptionPane.showMessageDialog(null," La empresa debera abonar a la CCSS el monto de "+total+"por concento de SEM Y IVM " );
       
      // aqui se imprime el el aporte para la asociacion multiplicando el salario deducido con el 2.5%
        
       double CCSS=total*0.025;
       JOptionPane.showMessageDialog(null,"Para la asociacion  la empresa se le asgina un valor de  " +CCSS);
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
