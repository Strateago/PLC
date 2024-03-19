package Questão3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MembroEquipe memb1 = new MembroEquipe("João");
        MembroEquipe memb2 = new MembroEquipe("Daniel");
        LiderEquipe lider = new LiderEquipe("Thiago");
        lider.addSub(memb1);
        lider.addSub(memb2);

        Tarefa <MembroEquipe> t1 = new Tarefa<MembroEquipe>("Desenvolver Código", memb1);
        Tarefa <MembroEquipe> t2 = new Tarefa<MembroEquipe>("Consertar Bugs", memb2);
        Tarefa <LiderEquipe> tL = new Tarefa<LiderEquipe>("Revisar Projeto", lider);

        ArrayList <Tarefa<MembroEquipe>> tarefas = new ArrayList<>();
        tarefas.add(t1);
        tarefas.add(t2);
        ArrayList <Tarefa<LiderEquipe>> tarefasL = new ArrayList<>();
        tarefasL.add(tL);

        double cargaJ, cargaD, cargaL;
        cargaJ = CalcularCargaDeTrabalho(tarefas, memb1);
        cargaD = CalcularCargaDeTrabalho(tarefas, memb2);
        cargaL = CalcularCargaDeTrabalho(tarefasL, lider);

        System.out.println("Carga de Trabalho de João: " + cargaJ + " tarefas(s).");
        System.out.println("Carga de Trabalho de Daniel: " + cargaD + " tarefa(s).");
        System.out.println("Carga de Trabalho do Líder Thiago: " + cargaL + " tarefa(s).");
    }
    private static <T> double CalcularCargaDeTrabalho(ArrayList <Tarefa <T>>tarefas, T pessoa){
        double carga = 0;
        for(Tarefa <T> t : tarefas){
            if(t.getResp() == pessoa){
                carga++;
            }
        }
        return carga;
    }
}
