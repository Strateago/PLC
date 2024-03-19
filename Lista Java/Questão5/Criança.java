package Questão5;
public class Criança extends Pessoa {
    public Criança(String n, int i){
        super(n, i);
    }
    @Override
    public Ticket getTicketType(){
        return Ticket.CRIANÇA;
    }
}
