package Questão1;
public interface FormaDePagamento {
    boolean autenticar();
    void processarPagamento(double valor) throws ExcessaoNaoAutenticou;
}