package Questão4;
abstract class Coffee {
    private String name;
    private double waterRequired;
    private double milkRequired;
    private double coffeeRequired;
    public Coffee(String name, double water, double milk, double coffee){
        this.name = name;
        this.waterRequired = water;
        this.milkRequired = milk;
        this.coffeeRequired = coffee;
    }
    abstract void prepare();
    public double getWater(){
        return waterRequired;
    }
    public double getCoffee(){
        return coffeeRequired;
    }
    public double getMilk(){
        return milkRequired;
    }
    public String getName(){
        return name;
    }
}
