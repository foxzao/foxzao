import javax.swing.JOptionPane;
public class DiaMesAno{
   public static void main (String [] j){
   //declarar vari�veis
   String dia = JOptionPane.showInputDialog("Insira o dia");
   String mes = JOptionPane.showInputDialog("Insira o mes");
   String ano = JOptionPane.showInputDialog("Insira o ano");
      
   //sa�da de dados
   JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
   }
}