package controles;
import entidades.Produto;

public class ControleCadastro {
    
    // singleton
    
    public boolean cadastrarProduto (Produto produto){
        boolean resultado = false;
        if (produto!=null && produto.getNome().length() > 0
         && produto.getEspecificacoes().length() > 0 && produto.getPrecoCusto()!= 0.00f
         && produto.getPrecoVendas() !=0.00f){
            // pronto para cadastrar no sistema
            resultado = true;
        }
        return resultado;
    }
    
}