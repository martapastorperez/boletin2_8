
package boletin2_8;

import javax.swing.JOptionPane;


public class Boletin2_8 {

    
    public static void main(String[] args) {
      float graos, kelvin,fahrenheit;
       graos= Float.parseFloat(JOptionPane.showInputDialog("graos"));
      
       kelvin=graos-273;
       fahrenheit=(graos*1.8f)/32;//f=para pasar el double a float
       JOptionPane.showMessageDialog(null,"kelvin="+kelvin+"Fahrenheit="+fahrenheit);
          
        
        
    }
    
}
