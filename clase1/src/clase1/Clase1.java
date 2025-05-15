 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*commentario
        */
        //comentario
        
        int variable1;
        String variable2;
        double variable3;
        long variable4=50;
        
        variable1=1;
        variable2="Esto es un string";
        variable3=1.5;
        
        System.out.println("si funciona");
        //JOptionPane.showMessageDialog(null,"tambien funciona");
        JOptionPane.showMessageDialog(null, "  "
                + "Estos son los valores de la variable2 " +variable2 + "/n"+ " Y los de variable1 " +variable1);
        
        
        String nuevaVariable;
        nuevaVariable=JOptionPane.showInputDialog("Valor de la nueva variable");
        JOptionPane.showMessageDialog(null, "El valor de la nueva variable es: "+nuevaVariable);
        
        
        String lectura="";
        lectura=JOptionPane.showInputDialog("Digite su edad");
        int edad=0;
        edad=Integer.parseInt(lectura);
        JOptionPane.showMessageDialog, (null, (edad+5));
        JOptionPane.showMessageDialog, (null, (lectura+5));

                
                
                
               
    }
   }

