package executavel;
import objetos.Conta;
import objetos.Conta_Esp;
import objetos.Poupança;

import javax.swing.JOptionPane;

public class Cad{
    public static void main(String[] args){
        String n = (JOptionPane.showInputDialog("Conta"));
        double s = (Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial na Conta")));
        Conta c = new Conta(n, s);
        c = new Conta_Esp(n);
        ((Poupança)c).renderJuros(0.01);
        c.creditar(Double.parseDouble(JOptionPane.showInputDialog("Depositar")));
        JOptionPane.showMessageDialog(null, "Conta: " + c.getNumero() + '\n' + "Saldo: " + c.getSaldo());
    }
    public String contas(int num){
        String contas = "";
        for(int a = 0; a < num; a++){
            contas += (função q retorna() + '\n');
        }
    }
}
