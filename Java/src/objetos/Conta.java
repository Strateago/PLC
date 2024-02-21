package objetos;

public class Conta{
    private String numero;
    private double saldo;

    public Conta (String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta (String n){
        this(n, 0);
    }

    public String getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void creditar(double valor){
        this.saldo += valor;
    }

    public void debitar(double valor){
        this.saldo -= valor;
    }
}