/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author otavioeijimitsuzaki
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v0 =3;
	System.out.println("v0="+v0);
	int v1 = v0++; //atribui o valor de v0 a v1 e APÓS atribuir o valor, incrementa 1 a v0.
	System.out.printf("v0=%d v1=%d%n", v0, v1); 
	int v2 = ++v1;//incrementa 1 em v1 e APÓS incrementar, atribui o valor de v1 a v2.  
	System.out.printf("v2=%d v1=%d%n", v2, v1);
	v1 += v0;//v1 = v1 + v0
	System.out.printf("v1=%d v0=%d%n", v1, v0);
	v2 += --v1;//v2 = v2 + (v1 - 1)
	System.out.printf("v2=%d v1=%d%n", v2, v1);
      
    }
    
}
