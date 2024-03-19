package Questão6;
public class Notebook extends ProdutoEletronico{
    private boolean isTouchScreen;
    public Notebook(String m, int ano, double p, String sis, int qtd, boolean touch){
        super(m, ano, p, sis, qtd);
        this.isTouchScreen = touch;
    }
    public void exibirInformações(){
        String touch;
        System.out.println("Notebook: " + super.getModel());
        System.out.println("Ano de Lançamento: " + super.getYear());
        System.out.println("Preço: $" + super.getPrice());
        System.out.println("Sistema Operacional: " + super.getOS());
        if(this.isTouchScreen){
            touch = "Sim";
        }
        else{
            touch = "Não";
        }
        System.out.println("Touch Screen: " + touch);
    }
}
