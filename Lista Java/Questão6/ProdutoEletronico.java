package Questão6;
abstract class ProdutoEletronico {
    private String modelo;
    private int anoLançamento;
    private double preço;
    private String sistemaOperacional;
    private int qtdDisponivel;

    public ProdutoEletronico(String m, int ano, double p, String sis, int qtd){
        this.anoLançamento = ano;
        this.modelo = m;
        this.preço = p;
        this.qtdDisponivel = qtd;
        this.sistemaOperacional = sis;
    }
    abstract void exibirInformações();
    public void vender(){
        this.qtdDisponivel -= 1;
    }
    public int quantidade(){
        return this.qtdDisponivel;
    }
    public String getModel(){
        return this.modelo;
    }
    public int getYear(){
        return this.anoLançamento;
    }
    public double getPrice(){
        return this.preço;
    }
    public String getOS(){
        return this.sistemaOperacional;
    }
}
