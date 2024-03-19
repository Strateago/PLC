package Questão3;
import java.util.*;

public class LiderEquipe {
    private String nome;
    private ArrayList<MembroEquipe> subordinados;
    public LiderEquipe(String n){
        this.nome = n;
        this.subordinados = new ArrayList<> ();
    }
    public String getNome(){
        return nome;
    }
    public void addSub(MembroEquipe sub){
        this.subordinados.add(sub);
    }
}
