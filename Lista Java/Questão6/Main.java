package Questão6;
public class Main {
    public static void main(String[] args){
        ProdutoEletronico Iphone15 = new Smartphone("Iphone 15", 2023, 15000, "IOS", 1);
        ProdutoEletronico Iphone16 = new Smartphone("Iphone 16", 2024, 19999.99, "IOS", 15);
        ProdutoEletronico lenovoIdea = new Notebook("Lenovo Ideapad 15", 2022, 2499.99, "Windows 11", 2, false);
        ProdutoEletronico samsungTab = new Tablet("Samsung Galaxy Tab S7", 2021, 699.99, "Android", 1);
        ProdutoEletronico dellXPS = new Notebook("Dell XPS 13", 2021, 1299.99, "Windows 10", 3, true);
        ProdutoEletronico macBook = new Notebook("MacBook 15 Infinity", 2023, 2699.99, "macOS 20", 10, true);
        Loja loja = new Loja();
        loja.addEstoque(Iphone15);
        loja.addEstoque(Iphone16);
        loja.addEstoque(lenovoIdea);
        loja.addEstoque(samsungTab);
        loja.addEstoque(macBook);
        loja.addEstoque(dellXPS);
        loja.venderProduto(Iphone15);
        loja.venderProduto(Iphone15);
        loja.venderProduto(Iphone16);
        loja.venderProduto(lenovoIdea);
        loja.venderProduto(samsungTab);
        loja.venderProduto(lenovoIdea);
        loja.venderProduto(dellXPS);
        loja.venderProduto(lenovoIdea);
        loja.venderProduto(macBook);
        loja.venderProduto(samsungTab);
    }
}
