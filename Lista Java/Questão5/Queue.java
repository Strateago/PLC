package Questão5;

import java.util.ArrayList;
import java.util.Collections;

public class Queue <T extends Pessoa> {
    private ArrayList<T> pessoas;
    public Queue (int n){
        pessoas = new ArrayList<>(n);
    }
    public Queue(){
        pessoas = new ArrayList<>(10);
    }
    public void push(T pessoa){
        this.pessoas.add(pessoa);
        Collections.sort(pessoas);
    }
    public T pop(){
        T aux;
        aux = pessoas.get(0);
        pessoas.remove(0);
        return aux;
    }
    public boolean isEmpty(){
        if(pessoas.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void mostraFila(){
        for(T i: pessoas){
            System.out.println(i.getName() + ' ' + i.getAge());
        }
    }
}
