import javax.swing.JOptionPane;
public class Peso{
   public static void main (String [] j){
   //vari�veis e entrada de dados
   double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso"));
   
   //sa�da de dados
   JOptionPane.showMessageDialog(null, "O peso informado foi" + " " + peso + "kg");
   }
}