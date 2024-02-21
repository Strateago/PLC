package objetos;

public class Conta_Esp extends Conta {
    private double bonus;
    public Conta_Esp (String Nconta){
        super(Nconta);
        bonus = 0.0;
    }
    public void creditar(double v){
        super.creditar(v);
        bonus += 0.01*v;
    }
    public void renderBonus(){
        super.creditar(this.bonus);
        bonus = 0;
    }
    public double getBonus(){
        return this.bonus;
    }

}
