package controles;

import entidades.Produto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenteRepositorio {
    // Metodos serão acessado usando padrao SINGLETON
    private static GerenteRepositorio instancia;
    // Contador de Produtos
    private long contadorProdutos = 1;
    // Guarda os dados de Produtos
    private ArrayList<Produto> listaProdutos;
    
   // Retorna a instancia do Gerente Repositorio
   public static GerenteRepositorio getInstance(){
       if (instancia == null){
           instancia = new GerenteRepositorio();
   }
       return instancia;
   }
   
       private GerenteRepositorio(){
        listaProdutos = new ArrayList<Produto>();
        carregarProdutosParaTestes();
    }
    /**
     * Usado para obter o contador atual
     * @return o numero atual do contador
     */
       public long getContadorProdutos(){
           return contadorProdutos;
       }
   
   public void inserirProduto(Produto produto){
       listaProdutos.add(produto);
       System.out.println(produto);
       contadorProdutos++; // Atualizar o contador de produtos
   }
   
      public void removerProduto(Produto produto){
       listaProdutos.remove(produto);
       System.out.println(produto);
   }
   
   public ArrayList<Produto> obterListaProdutos(){
       return listaProdutos;       
   }
   
       private void carregarProdutosParaTestes() {
        
        for (int i = 0; i < 20; i++) {
            Produto produto = new Produto(
                    new Long(contadorProdutos), // codigo 
                    "Jogo "+(i+1),  // nome do produto
                    "...", // especificacoes
                    500.0f, // preco venda
                    300.0f, // preco custo
                    false); // habilitado
            
            
            contadorProdutos++;
            listaProdutos.add(produto);
        }
        
        
    }
  /**
     * Altera o produto.
     * 
     * @param o produto a ser alterado 
     */ 
   public void modificarProduto (Produto produto){
       if (listaProdutos.contains(produto)){
            int index = listaProdutos.indexOf(produto);
            listaProdutos.set(index, produto);
   }
   }
    
}
