/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author otavioeijimitsuzaki
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        int n, s = 0, c = 0, qtdPar = 0, qtdImpar = 0, aCem = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            c++;
            
            if (n > 100) {
                aCem++;
            } 
            if (n % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }
    
        } while (n != 0); 
                
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" 
                                      + "<br>Total dos valores: " + c  
                                      + "<br>Somatória final: " + s 
                                      + "<br>Média dos valores: " + s / c 
                                      + "<br>Quantidade par: " + qtdPar 
                                      + "<br>Quantidade ímpar: " + qtdImpar 
                                      + "<br>Acima de 100: " +aCem + "</html>");
        
     }
}
