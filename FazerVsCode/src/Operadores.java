import java.util.Scanner;

public class Operadores {
  Scanner in = new Scanner(System.in);
  public float adicao (float v1, float v2) {
    return v1 + v2;
  }
  public float subtracao (float v1, float v2) {
    return v1 - v2;
  }
  public float multiplicacao (float v1, float v2) {
    return v1 * v2;
  }
  public float divisao (float v1, float v2) {
    return v1 / v2;
  }

  //Operadores de Atribuição
  //A conta será realizada na ordem que o usuário digitou
  public void expressao (){
    System.out.print("Digite um número, uma operação (+, -, *, /) e outro número, dando Enter entre cada um. Continue digitando sua expressão, para parar, digite '=': ");
    float resultado = in.nextFloat();
    while (true) {
        String o = in.next();
        if (o.equals("=")) {
            break; // Sai do loop
        }
        float v = in.nextFloat();

        // Verificação de operadores
        if (o.equals("+")){
            resultado += v; // Operador de atribuição (adição)
        }
        else if (o.equals("-")){
            resultado -= v; // Operador de atribuição (subtração)
        }
        else if (o.equals("*")){
            resultado *= v; // Operador de atribuição (multiplicação)
        }
        else if (o.equals("/")){
            if (v == 0) {
                System.out.println("Erro: Divisão por zero. Operação ignorada.");
            } else {
                resultado /= v; // Operador de atribuição (divisão)
            }
        }
        else {
            System.out.println("Operador inválido. Tente novamente.");
        }
    }
    
    System.out.println("Resultado da expressão: "+ resultado);
  }
}
