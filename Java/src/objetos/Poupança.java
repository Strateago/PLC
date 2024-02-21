package objetos;

public class Poupança extends Conta{
    public Poupança (String n){
        super(n);
    }

    public void renderJuros(double taxa){
        double j = this.getSaldo() * taxa;
        this.creditar(j);
    }
}
