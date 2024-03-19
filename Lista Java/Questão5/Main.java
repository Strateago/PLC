package Questão5;
public class Main {
    public static void main(String[] args){
        Queue <Pessoa> pq = new Queue<>(5);
        pq.push(new Adulto("Pedro", 30));
        pq.push(new Criança("João", 10));
        pq.push(new Adulto("Lucas", 25));
        pq.push(new Criança("Leticia", 14));
        pq.push(new Criança("Thiago", 12));
        while(!pq.isEmpty()){
            Pessoa p = pq.pop();
            System.out.println(p);
        }
    }
}
