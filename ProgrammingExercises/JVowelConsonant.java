import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVowelConsonant extends JFrame implements ActionListener
{
   Container con = null;
   final int RANDOM_NUM = 8;

   JButton[] b = new JButton[RANDOM_NUM];
   final String[] LETTERS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
   String[] vowels = {"A", "E", "I", "O", "U"};

   JPanel panel1 = new JPanel();
   JPanel panel2 = new JPanel();
   JPanel panel3 = new JPanel();

   JLabel labelMain = new JLabel("");
   boolean alreadyUsed;

   int x;
   int randomLetter;
   int[] ran = {-1, -1, -1, -1, -1, -1, -1, -1};

   public JVowelConsonant()
   {
      for(x = 0; x < RANDOM_NUM; ++x)
      {
         randomLetter = (int)(Math.random() * LETTERS.length);
         ran[x] = randomLetter;
      }
      setLayout(new GridLayout(2, 2));
      panel1.setLayout(new GridLayout(2, 2));
      panel2.setLayout(new GridLayout(2, 2));
      for(x = 0; x < RANDOM_NUM; ++x)
      {
         b[x] = new JButton(LETTERS[ran[x]]);
      }
      for(x = 0; x < 4; ++x)
      {
         panel1.add(b[x]);
      }
      for(; x < RANDOM_NUM; ++x)
      {
         panel2.add(b[x]);
      }
      panel3.add(labelMain);
      add(panel1);
      add(panel2);
      add(panel3);
      for(x = 0; x < RANDOM_NUM; ++x)
      {
         b[x].addActionListener(this);
      }
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      for(x = 0; x < RANDOM_NUM; ++x)
      {
         if (source == b[x])
         {
            if(b[x].getText() == "A" || b[x].getText() == "E" || b[x].getText() == "I" || b[x].getText() == "O" || b[x].getText() == "U")
            {
               labelMain.setText(b[x].getText() + " is a vowel");
            }
            else
            {
               labelMain.setText(b[x].getText() + " is a consonant");
            }
            randomLetter = (int)(Math.random() * LETTERS.length);
            b[x].setText(LETTERS[randomLetter]);
            x = RANDOM_NUM;
         }
      }
   }

   public static void main(String[] args)
   {
      JVowelConsonant f = new JVowelConsonant();
      f.setSize(750, 500);
      f.setVisible(true);
   }
}
