package Questão4;
public class Espresso extends Coffee{
    public Espresso(){
        super("Espresso", 30 , 0, 7);
    }
    @Override
    public void prepare(){
        System.out.println("Preparo do " + super.getName());
        System.out.println("Prepare " + super.getCoffee() + " gramas de café moído prensado");
        System.out.println("Aplique um jato de água de " + super.getWater() + " ml a 9 ou mais atm, de 25 a 30 segundos");
        System.out.println("Pronto, seu café está pronto.");
    }
}
