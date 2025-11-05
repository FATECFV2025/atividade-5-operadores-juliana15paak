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

  // Escolha
  public void resultado (int escolha){
    if (escolha >= 1 && escolha <= 4){
      System.out.println("Digite o primeiro termo: ");
      float v1 = in.nextFloat();
      System.out.println("Digite o segundo termo: ");
      float v2 = in.nextFloat();

      if (escolha == 1){
        System.out.println("Adição: "+adicao(v1, v2));
      }
      if (escolha == 2){
        System.out.println("Subtração: "+subtracao(v1, v2));
      }
      if (escolha == 3){
        System.out.println("Multiplicação: "+multiplicacao(v1, v2));
      }
      if (escolha == 4){
        System.out.println("Divisão: "+divisao(v1, v2));
      }
    }
    else if (escolha == 5){
      expressao();
    }
    else if (escolha == 6){
      demonstrarComparacao();
    }
    else if (escolha == 7){
      demonstrarLogicos();
    }
    else if (escolha < 1 || escolha > 7){
      System.out.println("Opção inválida!");
    }
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

  //Operadores de Comparação
  public void demonstrarComparacao() {
    System.out.println("--- Operadores de Comparação ---");
    System.out.print("Digite o primeiro número: ");
    float v1 = in.nextFloat();
    System.out.print("Digite o segundo número: ");
    float v2 = in.nextFloat();

    // Mostra o resultado (true ou false) de cada comparação
    System.out.println(v1 + " == " + v2 + " (Igual a): " + (v1 == v2));
    System.out.println(v1 + " != " + v2 + " (Diferente de): " + (v1 != v2));
    System.out.println(v1 + " > " + v2 + "  (Maior que): " + (v1 > v2));
    System.out.println(v1 + " < " + v2 + "  (Menor que): " + (v1 < v2));
    System.out.println(v1 + " >= " + v2 + " (Maior ou igual): " + (v1 >= v2));
    System.out.println(v1 + " <= " + v2 + " (Menor ou igual): " + (v1 <= v2));
  }
}
