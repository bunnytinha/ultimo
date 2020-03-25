//biblioteca
import javax.swing.JOptionPane;
//declara classe
public class LerVariosInformar
{
   //main
   public static void main (String [] args)
   {
      //declara variaveis
      double numero;
      int quantidade = 0;
      //do while
      do
      {
         //le numeros
         numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:\nDigite 0 para encerrar."));
         if (numero > 100 && numero <200) quantidade++;
      }while (numero != 0);
      //exibe
      JOptionPane.showMessageDialog(null, quantidade);
   }    
}