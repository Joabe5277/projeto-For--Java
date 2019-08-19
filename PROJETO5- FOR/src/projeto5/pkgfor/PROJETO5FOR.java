/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto5.pkgfor;

/**
 *
 * @author aluno
 */
public class PROJETO5FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FOR (inicializacao; condicao; incremento)
        for(int i = 0;i < 10; i++){
            System.out.println("Valor de i:"+i);
        }
        //escopo de variavel
        //Erro System.out.println("Valor de i;"+ i);
        
        int i;
        for (i = 0; i <10; i++){
            System.out.println("Valor de i:"+i);
        }
        System.out.println("valor de i:"+i);
    }
    
}
