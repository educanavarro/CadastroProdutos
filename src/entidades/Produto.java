package entidades;

public class Produto {
    
    // atributos
    private Long codigo;
    private String nome;
    private String especificacoes;
    private float precoVendas;
    private float precoCusto;
    private boolean habilitadoVendas;
    // construtor
    public Produto(Long codigo, String nome, String especificacoes, float precoVendas, float precoCusto, boolean habilitadoVendas) {
        this.codigo = codigo;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.precoVendas = precoVendas;
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

    public float getPrecoVendas() {
        return precoVendas;
    }

    public void setPrecoVendas(float precoVendas) {
        this.precoVendas = precoVendas;
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
   
   
}
