package Questão5;
abstract class Pessoa implements Comparable <Pessoa> {
    private int idade;
    private String nome;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    abstract Ticket getTicketType();
    @Override
    public int compareTo (Pessoa p){
        return p.getAge() - this.idade;
    }
    public String getName(){
        return nome;
    }
    public int getAge(){
        return idade;
    }
    @Override
    public String toString() {
        return nome + ": " + idade + "[" + getTicketType() + "]";
    }
}
