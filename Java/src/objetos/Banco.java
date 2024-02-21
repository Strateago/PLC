package objetos;

public class Banco {
    private Conta[] contas;
    private int indice;
    private double taxa_juros;

    public Banco(){
        this.contas = new Conta[100];
        this.indice = 0;
        this.taxa_juros = 0.01;
    }
    public void cadastrarConta(Conta c){
        contas[indice] = c;
        this.indice++;
    }
    public void creditar(String n, double v){
        procurarConta(n).creditar(v);
    }
    private Conta procurarConta(String numero) {
        int i = 0;
        boolean achou = false;
        Conta resposta = null;
        while ((! achou) && (i < indice)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
                resposta = contas[i];
            } 
            else {
                i = i + 1;
            } 
        }
        if (!achou) throw new RuntimeException("Não achou a conta");
        return resposta;
    }
    public void renderJuros(String numero){
        Conta c = procurarConta(numero);
        if(c instanceof Poupança){
            ((Poupança)c).renderJuros(this.taxa_juros);
        }
        else{
            throw new RuntimeException("Não é poupança");
        }
    }
    public void renderBonus(String numero){
        Conta c = procurarConta(numero);
        if(c instanceof Conta_Esp){
            ((Conta_Esp)c).renderBonus();
        }
        else{
            throw new RuntimeException("Não é Conta Especial");
        }
    }
    public void transferir(String n1, String n2, double valor){ // n1 transfere e n2 recebe
        Conta c1, c2;
        c1 = procurarConta(n1);
        c2 = procurarConta(n2);
        c1.debitar(valor);
        c2.creditar(valor);
    }
}
