package objetos;

public class Banco {
    private RepositorioContas accounts;
    private double taxa_juros;

    public Banco(RepositorioContas rep){
        this.accounts = rep;
        this.taxa_juros = 0.01;
    }
    public void cadastrarContaAbstrata(ContaAbstrata c){
        accounts.inserir(c);
    }
    public void creditar(String n, double v){
        accounts.procurar(n).creditar(v);
    }
    public void renderJuros(String numero){
        ContaAbstrata c = accounts.procurar(numero);
        if(c instanceof Poupança){
            ((Poupança)c).renderJuros(this.taxa_juros);
        }
        else{
            throw new RuntimeException("Não é poupança");
        }
    }
    public void renderBonus(String numero){
        ContaAbstrata c = accounts.procurar(numero);
        if(c instanceof Conta_Esp){
            ((Conta_Esp)c).renderBonus();
        }
        else{
            throw new RuntimeException("Não é ContaAbstrata Especial");
        }
    }
    public void transferir(String n1, String n2, double valor){ // n1 transfere e n2 recebe
        ContaAbstrata c1, c2;
        c1 = accounts.procurar(n1);
        c2 = accounts.procurar(n2);
        c1.debitar(valor);
        c2.creditar(valor);
    }
}
