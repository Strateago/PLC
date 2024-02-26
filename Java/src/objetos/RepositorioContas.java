package objetos;

public interface RepositorioContas {
    void inserir(ContaAbstrata c);
    ContaAbstrata procurar(String s);
    void remover(String s);
    void atualizar(ContaAbstrata c);
    boolean existe(String s);
}
