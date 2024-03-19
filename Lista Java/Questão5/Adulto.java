package Questão5;
public class Adulto extends Pessoa{
    public Adulto(String n, int i){
        super(n, i);
    }
    @Override
    public Ticket getTicketType(){
        return Ticket.ADULTO;
    }
}
