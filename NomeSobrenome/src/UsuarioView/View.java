package UsuarioView;

import javax.swing.*;
import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

public class View extends JFrame {
    JTextField textNome, textSobrenome;
    JLabel visor;
    JButton botao;

    public View() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        textNome = new JTextField(12);
        add(textNome);

        JLabel operador = new JLabel("+");
        add(operador);

        textSobrenome = new JTextField(15);
        add(textSobrenome);

        visor = new JLabel(" ");
        add(visor);

        botao = new JButton("Juntar Nome");
        add(botao);

        pack();
        setVisible(true);
    }

    public void setBotaoBehavior(ActionListener botaoBehavior) {
        botao.addActionListener(botaoBehavior);
    }

    public void setVisor(String result) {
        visor.setText(result);
    }

    public String getNome() {
        return textNome.getText();
    }

    public String getSobrenome() { // Criado método para recuperar o sobrenome
        return textSobrenome.getText();
    }
}
