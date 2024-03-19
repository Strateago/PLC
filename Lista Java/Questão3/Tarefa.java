package Questão3;
public class Tarefa <T> {
    private String descrição;
    private T responsavel;
    public Tarefa(String type, T resp){
        this.descrição = type;
        this.responsavel = resp;
    }
    public String getDesc(){
        return descrição;
    }
    public T getResp(){
        return responsavel;
    }
}
