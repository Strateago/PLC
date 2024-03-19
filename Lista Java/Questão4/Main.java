package Questão4;
import java.util.*;
public class Main {
    public static void main(String[] args){
        CoffeeMachine cafeteira = new CoffeeMachine();
        ArrayList <Coffee> pedidos = new ArrayList <Coffee>();
        pedidos.add(new Latte());
        pedidos.add(new Espresso());
        pedidos.add(new Cappuccino());
        pedidos.add(new Espresso());
        pedidos.add(new Latte());
        for(Coffee i : pedidos){
            System.out.println("\nPreparando novo pedido");
            try {
                cafeteira.makeCoffee(i);
            }
            catch (ExceptionNoResources NR){
                System.out.println("No more resources");
            }
        }
    }
}
