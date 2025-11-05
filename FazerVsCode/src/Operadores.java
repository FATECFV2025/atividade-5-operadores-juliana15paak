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

  // --- Controlador Principal ---
  //COMPARAÇÃO e LÓGICO 
  public void resultado (int escolha){
    if (escolha >= 1 && escolha <= 4){ 
      System.out.println("Digite o primeiro termo: ");
      float v1 = in.nextFloat();
      System.out.println("Digite o segundo termo: ");
      float v2 = in.nextFloat();
      
      if (escolha == 1){ // COMPARAÇÃO (==)
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
    // 
    else if (escolha == 5){
      expressao();
    }
    // COMPARAÇÃO (<, >) e LÓGICO (||)
    else if (escolha < 1 || escolha > 5){
      System.out.println("Opção inválida!");
    }
  }

  // ATRIBUIÇÃO
  public void expressao (){
    System.out.println("--- Expressão com Atribuição ---");
    System.out.println("Digite o primeiro número: ");
    float resultado = in.nextFloat(); 

    while (true) {
        System.out.println("Subtotal: " + resultado);
        System.out.print("Digite um operador (+, -, *, /) ou '=' para finalizar: ");
        String o = in.next(); // Lê a operação
        
        if (o.equals("=")) {
            break; // Sai do loop
        }
        System.out.print("Digite o próximo número: ");
        float v = in.nextFloat();

        if (o.equals("+")){
            resultado += v; //ATRIBUIÇÃO 
        }
        else if (o.equals("-")){
            resultado -= v;
        }
        else if (o.equals("*")){
            resultado *= v; 
        }
        else if (o.equals("/")){
            if (v == 0) {
                System.out.println("Erro: Divisão por zero. Operação ignorada.");
            } else {
                resultado /= v; 
            }
        }
        else {
            System.out.println("Operador inválido. Tente novamente.");
        }
    }
    
    System.out.println("--- Resultado Final da Expressão: "+ resultado + " ---");
  }
}