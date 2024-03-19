package Questão1;
import java.util.*;

public class Main{
    public static void main(String[] args) throws ExcessaoNaoAutenticou, ExcessaoTipoPagamento {
        boolean flag = true;
        while(flag){    
            FormaDePagamento pagar;
            String option;
            double valor; 
            Scanner input = new Scanner(System.in);
            System.out.println("C - Pagar com Cartão de Crédito.");
            System.out.println("B - Pagar com Boleto Bancário.");
            System.out.println("P - Pagar com PayPal.");
            System.out.println("EXIT - Sair");
            option = input.nextLine();
            if(option.equals("C")){
                pagar = new CartaoCredito();
                System.out.print("Digite o valor: ");
                valor = input.nextDouble();
                pagar.processarPagamento(valor);
            }
            else if(option.equals("B")){
                pagar = new BoletoBancario();
                System.out.print("Digite o valor: ");
                valor = input.nextDouble();
                pagar.processarPagamento(valor);
            }
            else if(option.equals("P")){
                pagar = new PayPal();
                System.out.print("Digite o valor: ");
                valor = input.nextDouble();
                pagar.processarPagamento(valor);
            }
            else if(option.equals("EXIT")){
                input.close();
                System.out.println("Bye!!");
                flag = false;
            }
            else{
                input.close();
                throw new ExcessaoTipoPagamento("Não é uma forma de pagamento");
            }
        }
    }
}
