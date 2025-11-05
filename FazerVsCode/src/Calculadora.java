package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args)throws Exception {
        Scanner in = new Scanner(System.in);
        Operadores op = new Operadores();

        //Menu de opções 
        System.out.println("--- Calculadora ---");
        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        System.out.println("5: Expressão (Operadores de Atribuição)");
        System.out.println("---------------------------------");
        System.out.print("Digite sua escolha: ");
        
        int escolha = in.nextInt();
        
        op.resultado(escolha);
        
        in.close();
    }
}