package Visuais.JavaSwing;

import javax.swing.*;

public class GUI_Intro_JavaSwing {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Insira seu nome");
        JOptionPane.showMessageDialog(null, "Olá "+name);
        // Deixa add o nome, e envia uma mensagem "Olá INPUT nome inserido (STRING version)


        int age = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade")); // transforma o código Str em Int como requerido
        JOptionPane.showMessageDialog(null, "Sua idade é de " +age+ " anos");
        // Int Version


        double height = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));
        JOptionPane.showMessageDialog(null, "Sua altura é de "+height+"m");
        // 'Float' do Python- Números não arredondados

    }
}
