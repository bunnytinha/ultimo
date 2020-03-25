//biblioteca
import javax.swing.JOptionPane;
import java.lang.*;
//declara classe
public class ImprimeMedia
{
   //main
   public static void main (String [] args)
   {
      //declara variaveis
      double numero;
      double soma = 0;
      double media = 0;
      int divisor = 0;
      //
      do
      {
         numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor positivo: \nPara encerrar, digite um valor negativo."));
         soma = soma + numero;
         divisor++;
      }while (numero > 0);
      soma = soma - numero;
      divisor--;
      media = soma / divisor;
      JOptionPane.showMessageDialog(null, media);
   }
}