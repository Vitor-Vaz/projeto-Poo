
package teste;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Teste extends JFrame implements ActionListener {


    JButton jb = new JButton("Botão 1");
    Font fonte = new Font("Serif",Font.PLAIN,20);
    JTextArea caixa = new JTextArea();
    JButton jb2 = new JButton("Botão 2");
    JCheckBox check = new JCheckBox(" Negrito");
    JComboBox<String> combo = new JComboBox<>();
    
    @Override
    public void actionPerformed (ActionEvent e) {
     caixa.setFont(new Font("Serif",fonte.getStyle(),fonte.getSize()+2));
    }
    
public Teste(){
    
    

    
    
    

    
    
     jb.setFont(fonte);
     setLayout(null);
     jb.setBounds(100,100,150,30);
     add(jb);
     jb.addActionListener(this);
     
     
     
     
//============================================================
     add(caixa);
     caixa.setBounds(7,260,480,200);
     caixa.setFont(new Font("Serif",Font.PLAIN,20));

/*============================================================
    
    */
     setTitle("Editor de texto");
     setSize(500, 500);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
     setResizable(false);    
}
    public static void main(String[] args) {
        new Teste();
    }

}
