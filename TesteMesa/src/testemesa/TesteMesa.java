/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemesa;

/**
 *
 * @author otavioeijimitsuzaki
 */
public class TesteMesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 1;
        
        do {
            if (c % 5 != 0) System.out.println(c);
            else break;
            c += 1;
        } while (c <= 10);
    }
    
}
