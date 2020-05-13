import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener
{
   private JLabel texto = new JLabel("Texto");
   private JTextField ftexto = new JTextField("");
   private JButton mostrar = new JButton("Mostar");
   private JButton limpar = new JButton("Limpar");
   private JButton sair = new JButton("Sair");
   
   public Tela()
   {
      super("Texto");
      
      JPanel painel = new JPanel(new GridLayout(2,2));
      JPanel painel1 = new JPanel(new FlowLayout());
      JPanel painel2 = new JPanel(new GridLayout(1,1));
      JPanel painel3 = new JPanel(new FlowLayout());
      painel.add(texto);
      painel.add(ftexto);
      painel.add(mostrar);
      painel.add(limpar);
      painel1.add(painel);
      painel2.add(sair);
      painel3.add(painel2);
      
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painel1, BorderLayout.CENTER);
      caixa.add(painel3, BorderLayout.SOUTH);
      
      mostrar.addActionListener(this);
      limpar.addActionListener(this);
      sair.addActionListener(this);
      
      setSize(300,150);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);      
      
   }
   
   public void actionPerformed(ActionEvent a)
   {
      String textinho = ftexto.getText();
   
      if(a.getSource() == mostrar)
      {
         JOptionPane.showMessageDialog(null,textinho);
      }
      else if(a.getSource() == limpar)
      {
        ftexto.setText("");
      }
      else if(a.getSource() == sair)
      {
         dispose();
      }
   }
}