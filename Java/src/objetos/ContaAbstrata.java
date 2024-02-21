package objetos;

public abstract class ContaAbstrata{
    private String numero;
    private double saldo;

    public ContaAbstrata(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public ContaAbstrata (String n){
        this(n, 0);
    }

    public String getNumero(){
        return this.numero;
    }

    protected double getSaldo(){
        return this.saldo;
    }

    public void creditar(double valor){
        this.saldo += valor;
    }

    public abstract void debitar(double v);
}