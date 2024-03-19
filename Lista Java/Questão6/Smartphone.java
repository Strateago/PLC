package Questão6;
public class Smartphone extends ProdutoEletronico{
    public Smartphone(String m, int ano, double p, String sis, int qtd){
        super(m, ano, p, sis, qtd);
    }
    public void exibirInformações(){
        System.out.println("Smartphone: " + super.getModel());
        System.out.println("Ano de Lançamento: " + super.getYear());
        System.out.println("Preço: $" + super.getPrice());
        System.out.println("Sistema Operacional: " + super.getOS());
    }
}
