package Questão1;
import java.util.*;

public class CartaoCredito implements FormaDePagamento{
    private ArrayList <Cartao> cards;

    public CartaoCredito(){
        cards = new ArrayList <Cartao> ();
        cards.add(new Cartao("1234","567"));
        cards.add(new Cartao("6312","877"));
        cards.add(new Cartao("2349","789"));
    }

    @Override
    public boolean autenticar(){
        Scanner input = new Scanner(System.in);
        String senha, cod;
        System.out.print("Digite a senha do cartão: ");
        senha = input.nextLine();
        System.out.print("Digite o código de segurança do cartão: ");
        cod = input.nextLine();
        for(int a = 0; a < cards.size(); a++){
            if(senha.equals(cards.get(a).RetSenha()) && cod.equals(cards.get(a).RetCod())){
                input.close();
                return true;
            }
        }
        input.close();
        return false;
    }

    @Override
    public void processarPagamento(double valor) throws ExcessaoNaoAutenticou{
        if(autenticar()){
            System.out.println("Pagamento com cartão de crédito no valor de " + valor + " processado com sucesso");
        }
        else{
            throw new ExcessaoNaoAutenticou("Cartão não autenticado");
        }
    }
}

class Cartao{
    private String senha;
    private String cod;
    public Cartao(String s, String c){
        senha = s;
        cod = c;
    }
    public String RetSenha(){
        return senha;
    }
    public String RetCod(){
        return cod;
    }
}
