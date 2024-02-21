package objetos;

public class Banco {
    private ContaAbstrata[] accounts;
    private int indice;
    private double taxa_juros;

    public Banco(){
        this.accounts = new ContaAbstrata[100];
        this.indice = 0;
        this.taxa_juros = 0.01;
    }
    public void cadastrarContaAbstrata(ContaAbstrata c){
        accounts[indice] = c;
        this.indice++;
    }
    public void creditar(String n, double v){
        procurarContaAbstrata(n).creditar(v);
    }
    private ContaAbstrata procurarContaAbstrata(String numero) {
        int i = 0;
        boolean achou = false;
        ContaAbstrata resposta = null;
        while ((! achou) && (i < indice)) {
            if (accounts[i].getNumero().equals(numero)) {
                achou = true;
                resposta = accounts[i];
            } 
            else {
                i = i + 1;
            } 
        }
        if (!achou) throw new RuntimeException("Não achou a contaAbstrContaAbstrata");
        return resposta;
    }
    public void renderJuros(String numero){
        ContaAbstrata c = procurarContaAbstrata(numero);
        if(c instanceof Poupança){
            ((Poupança)c).renderJuros(this.taxa_juros);
        }
        else{
            throw new RuntimeException("Não é poupança");
        }
    }
    public void renderBonus(String numero){
        ContaAbstrata c = procurarContaAbstrata(numero);
        if(c instanceof Conta_Esp){
            ((Conta_Esp)c).renderBonus();
        }
        else{
            throw new RuntimeException("Não é ContaAbstrata Especial");
        }
    }
    public void transferir(String n1, String n2, double valor){ // n1 transfere e n2 recebe
        ContaAbstrata c1, c2;
        c1 = procurarContaAbstrata(n1);
        c2 = procurarContaAbstrata(n2);
        c1.debitar(valor);
        c2.creditar(valor);
    }
}
