package Questão4;
public class Latte extends Coffee{
    public Latte(){
        super("Latte", 30, 160, 7);
    }
    @Override
    public void prepare(){
        System.out.println("Preparo do " + super.getName());
        System.out.println("Prepare " + super.getCoffee() + " gramas de café moído prensado");
        System.out.println("Aplique um jato de água de " + super.getWater() + "ml a 9 ou mais atm, de 25 a 30 segundos");
        System.out.println("Após o preparo de 30ml de café expresso, vaporizamos " + super.getMilk() + "ml de leite");
        System.out.println("Agora adicionamos o leite ao café preparado, e seu café está pronto.");
    }
}
