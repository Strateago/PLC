package Questão1;
import java.util.*;

public class PayPal implements FormaDePagamento{
    private ArrayList <Conta> contas;

    public PayPal(){
        contas = new ArrayList <Conta> ();
        contas.add(new Conta("Strateago","28457"));
        contas.add(new Conta("Caiorochac","78945"));
        contas.add(new Conta("GildoLanches","12655"));
    }

    @Override
    public boolean autenticar(){
        Scanner input = new Scanner(System.in);
        String login, senha;
        System.out.print("Digite o login: ");
        login = input.nextLine();
        System.out.print("Digite a senha: ");
        senha = input.nextLine();
        for(int a = 0; a < contas.size(); a++){
            if(login.equals(contas.get(a).RetLogin()) && senha.equals(contas.get(a).RetSenha())){
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
            System.out.println("Pagamento com PayPal no valor de " + valor + " processado com sucesso");
        }
        else{
            throw new ExcessaoNaoAutenticou("Conta não autenticada");
        }
    }
}

class Conta{
    private String login;
    private String senha;
    public Conta(String l, String s){
        login = l;
        senha = s;
    }
    public String RetLogin(){
        return login;
    }
    public String RetSenha(){
        return senha;
    }
}
