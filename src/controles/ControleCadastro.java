package controles;
import entidades.Produto;

public class ControleCadastro {
   
    
    public boolean cadastrarProduto (Produto produto){
        boolean resultado = false;
        if (produto!=null && produto.getNome().length() > 0
         && produto.getEspecificacoes().length() > 0 && produto.getPrecoCusto()!= 0.00f
         && produto.getPrecoVenda() !=0.00f){
            
            // Seta codigo valido
            produto.setCodigo(GerenteRepositorio.getInstance().getContadorProdutos());
            
            // Insere no modelo de dados
            GerenteRepositorio.getInstance().inserirProduto(produto);
            
            System.out.println(produto.toString());
            
            resultado = true;
        }
        return resultado;
    }
    
    public boolean atualizarProduto (Produto produto){
        boolean resultado = false;
        if (produto != null && produto.getNome().length() > 0
                && produto.getEspecificacoes().length() > 0 && produto.getPrecoCusto() != 0.0f
                && produto.getPrecoVenda() != 0.0f){
            
            GerenteRepositorio.getInstance().modificarProduto(produto);
            System.out.println("Atualizado -> " + produto.toString());
            resultado = true;
        }
        return resultado;
    }
    
}