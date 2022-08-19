import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class clsPermutaciones {

    public static void main (String[] args)
    { 
        String  letras = ""; 
        letras = JOptionPane.showInputDialog(null,"Introduce tus caracteres a permutar");
        findPermutations(letras);
    }
    
            public static void findPermutations(String caracteres)
            {
               
                if (caracteres.length() == 0) {
                    return;
                }
         
                List<String> permutaciones = new ArrayList<>();
         
                permutaciones.add(String.valueOf(caracteres.charAt(0)));
         
                for (int i = 1; i < caracteres .length(); i++)
                {
                   
                    for (int j = permutaciones.size() - 1; j >= 0 ; j--)
                    {
                    
                        String s = permutaciones.remove(j);
         
         
                        for (int k = 0; k <= s.length(); k++)
                        {
                            permutaciones.add(s.substring(0, k) + caracteres.charAt(i) + s.substring(k));
                        }
                    }
                }
         
                JOptionPane.showMessageDialog(null,permutaciones);
            }
}
