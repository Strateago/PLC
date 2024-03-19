package Questão6;
import java.util.*;
public class Loja {
    private ArrayList <ProdutoEletronico> estoque;
    public Loja(){
        estoque = new ArrayList<>();
    }
    public void addEstoque(ProdutoEletronico produto){
        estoque.add(produto);
    }
    public void venderProduto(ProdutoEletronico produto){
        if(produto.quantidade() > 0){
            produto.exibirInformações();
            produto.vender();
        }
        else{
            System.out.println("Não há mais estoque de " + produto.getModel());
        }
        System.out.println("----------------------------------------");
    }
}
