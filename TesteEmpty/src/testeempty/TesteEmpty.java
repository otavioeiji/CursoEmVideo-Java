/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeempty;

/**
 *
 * @author otavioeijimitsuzaki
 */
public class TesteEmpty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "João";
        imprimeNome ("Empty");
        
        if (!nome.isEmpty()) {
            System.out.println("Tudo bem " + nome + "?");
        } else {
            System.out.println("O nome é " + nome + ".");
        }
    }

    private static void imprimeNome(String empty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
