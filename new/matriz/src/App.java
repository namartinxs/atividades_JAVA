public class App {
  public static void main(String[] args) throws Exception {
    // Declaração e inicialização da matriz
    int[][] matrizA = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 3, 9, 18, 10}, 
                        { 5, 8, 7, 5 }};
    int linhas = matrizA.length;
    int colunas = matrizA[0].length;

    System.out.println("Quantidade de linhas: " + linhas);
    System.out.println("Quantidade de colunas: " + colunas);

    // Declaração da matriz (Quantidade de linhas e colunas)
    int[][] matrizB = new int[4][4];
    // Inserção dos valores na matriz
    // 1o for - Percorrer as linhas
    for (int i = 0; i < 4; i++) {
      // 2o for - Percorrer as colunas
      for (int j = 0; j < 4; j++) {
        // Atribuir os valores a cada uma das posições
        matrizB[i][j] = i + j;
      }
    }
    
    // Imprimir a matriz em linha
    // for (int i = 0; i < 4; i++) {
    // for (int j = 0; j < 4; j++)
    // System.err.println("Matriz[" + i + "][" + j + "]: " + matrizB[i][j]);
    // }

    // dp
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if(j == i){
          System.out.print("x");
        }else{
          System.out.printf("%d",matrizB[i][j]);
        }
      }
      System.out.println();
    }

    // ds
    int va = 3;
      for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if(j == va){
          System.out.print("x");
        }else{
          System.out.printf("%d",matrizB[i][j]);
        } 
        
      }
      System.out.println();
      va-=1;
    }

  }
}
