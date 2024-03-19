package Questão4;
public class CoffeeMachine {
    private double milk;
    private double water;
    private double coffee;
    public CoffeeMachine(){
        this.milk = 5000;
        this.water = 10000;
        this.coffee = 10000;
    }
    public void makeCoffee(Coffee coffee) throws ExceptionNoResources{
        boolean okM = false, okW = false, okC = false;
        if(coffee.getMilk() < this.milk){
            this.milk -= coffee.getMilk();
            okM = true;
        }
        if(coffee.getWater() < this.water){
            this.water -= coffee.getWater();
            okW = true;
        }
        if(coffee.getCoffee() < this.coffee){
            this.coffee -= coffee.getCoffee();
            okC = true;
        }
        if(okC && okW && okM){
            coffee.prepare();
        }
        else{
            throw new ExceptionNoResources();
        }
    }
}
