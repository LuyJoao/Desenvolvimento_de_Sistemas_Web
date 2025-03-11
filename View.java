import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class View extends JFrame{
    JTextField textNum1, textNum2;
    JLabel visor;
    JButton botao;

    public View(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        JTextField textNome = new JTextField(12);
        add(textNome);

        JLabel operador = new JLabel("+");
        add(operador);

        JTextField textSobrenome = new JTextField(15);
        add(textSobrenome);

        visor = new JLabel("Nome Completo:");
        add(visor);

        botao = new JButton("Juntar Nome");
        add(botao);

        pack();
        
        setVisible(true);
    }

    public void setBotaoBehavior(Action botaoBehavior){
        botao.addActionListener(botaoBehavior);
    }

    public void setVisor(String result){
        visor.setText(result);
    }
}
