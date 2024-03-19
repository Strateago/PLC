package Questão4;
public class Cappuccino extends Coffee{
    public Cappuccino(){
        super("Cappuccino", 30, 160, 7);
    }
    @Override
    public void prepare(){
        System.out.println("Preparo do " + super.getName());
        System.out.println("Prepare " + super.getCoffee() + " gramas de café moído prensado");
        System.out.println("Aplique um jato de água de " + super.getWater() + " ml a 9 ou mais atm, de 25 a 30 segundos");
        System.out.println("Após feito o expresso, adicione partes iguais de leite e creme de leite");
        System.out.println("Vaporize " + super.getMilk() + "ml de leite e separe metade de creme e metade de leite");
        System.out.println("Adicione o leite no café, e por fim adicione o creme");
        System.out.println("Pronto, seu café está pronto.");
    }
}
