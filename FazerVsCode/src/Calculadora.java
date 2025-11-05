import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args)throws Exception {
        Scanner in = new Scanner(System.in);

        Operadores op = new Operadores();

        //Entrada de dados pelo usuário
        System.out.println("Digite dois números: ");
        float v1 = in.nextFloat();
        float v2 = in.nextFloat();

        System.out.println("Adição: "+op.adicao(v1, v2));
        System.out.println("Subtração: "+op.subtracao(v1, v2));
        System.out.println("Multiplicação: "+op.multiplicacao(v1, v2));
        System.out.println("Divisão: "+op.divisao(v1, v2));
    }
}
