/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author otavioeijimitsuzaki
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Otávio";
        String nome2 = "Gustavo";
        String nome3 = new String("Otávio");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";//equals compara o conteúdo de um objeto
        System.out.println(res);
    }
    
}
