/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicioEstoque;

public class App {
    public static void main(String[] args) {
       Estoque est = new Estoque();
       est.adicionarProdutos("Bola",1  );
       est.adicionarProdutos("Ps5", 6);
       est.consultarQuantidade("Bola");
       est.produtoMaisEstocado();
    }
}
