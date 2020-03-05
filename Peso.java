import javax.swing.JOptionPane;
public class Peso{
   public static void main (String [] j){
   //variáveis e entrada de dados
   double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso"));
   
   //saída de dados
   JOptionPane.showMessageDialog(null, "O peso informado foi" + " " + peso + "kg");
   }
}