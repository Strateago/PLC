package Questão6;
public class Tablet extends ProdutoEletronico{
    public Tablet(String m, int ano, double p, String sis, int qtd){
        super(m, ano, p, sis, qtd);
    }
    public void exibirInformações(){
        System.out.println("Tablet: " + super.getModel());
        System.out.println("Ano de Lançamento: " + super.getYear());
        System.out.println("Preço: $" + super.getPrice());
        System.out.println("Sistema Operacional: " + super.getOS());
    }
}
