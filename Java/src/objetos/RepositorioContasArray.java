package objetos;

public class RepositorioContasArray implements RepositorioContas{
    private ContaAbstrata[] c;
    private int indice;
    private int i;
    public RepositorioContasArray(int num){
        this.c = new ContaAbstrata[num];
        this.indice = 0;
    }
    public void inserir(ContaAbstrata c){
        this.c[indice] = c;
        indice++;
    }
    public ContaAbstrata procurar(String s){
        i = 0;
        boolean achou = false;
        ContaAbstrata resposta = null;
        while ((! achou) && (i < indice)) {
            if (c[i].getNumero().equals(s)) {
                achou = true;
                resposta = c[i];
            } 
            else {
                i = i + 1;
            } 
        }
        if (!achou) throw new RuntimeException("Não achou a contaAbstrContaAbstrata");
        return resposta;
    }
    public void remover(String s){
        if(existe(s)){
            indice--;
            for(; i < indice; i++){
                c[i] = c[i+1];
            }
        }
        else{
            throw new RuntimeException("A conta não existe");
        }
    }
    public void atualizar(ContaAbstrata c){
        
    }
    public boolean existe(String s){
        i = 0;
        boolean achou = false;
        while ((! achou) && (i < indice)) {
            if (c[i].getNumero().equals(s)) {
                achou = true;
            } 
            else {
                i = i + 1;
            } 
        }
        return achou;
    }

}
