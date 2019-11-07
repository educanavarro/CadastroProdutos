package entidades;

public class Produto {
    
    // atributos
    private Long codigo;
    private String nome;
    private String especificacoes;
    private float precoVenda;
    private float precoCusto;
    private boolean habilitadoVendas;
    // construtor padrão
    public Produto(Long codigo, String nome, String especificacoes, float precoVendas, float precoCusto, boolean habilitadoVendas) {
        this.codigo = codigo;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.precoVenda = precoVendas;
        this.precoCusto = precoCusto;
        this.habilitadoVendas = habilitadoVendas;
    }
    // metodos
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVendas) {
        this.precoVenda = precoVendas;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public boolean isHabilitadoVendas() {
        return habilitadoVendas;
    }

    
    public void setHabilitadoVendas(boolean habilitadoVendas) {
        this.habilitadoVendas = habilitadoVendas;
    }
    
   @Override
    public String toString(){
        String valores = "codigo=" +codigo+
                         ", nome=" +nome+
                         ", preco custo=" +precoCusto+
                         ", preco venda=" +precoVenda+
                         ", habilitado vendas=" +habilitadoVendas;
        return valores;           
    }
   
}
