package Questão1;
import java.util.*;

public class BoletoBancario implements FormaDePagamento{
    private ArrayList <String> codigos;

    public BoletoBancario(){
        codigos = new ArrayList <String> ();
        codigos.add("63127");
        codigos.add("47359");
        codigos.add("34043");
    }

    @Override
    public boolean autenticar(){
        Scanner input = new Scanner(System.in);
        String cod;
        System.out.print("Digite o código do Boleto: ");
        cod = input.nextLine();
        for(int a = 0; a < codigos.size(); a++){
            if(cod.equals(codigos.get(a))){
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
            System.out.println("Pagamento com boleto bancário no valor de " + valor + " processado com sucesso");
        }
        else{
            throw new ExcessaoNaoAutenticou("Boleto não autenticado");
        }
    }
}
