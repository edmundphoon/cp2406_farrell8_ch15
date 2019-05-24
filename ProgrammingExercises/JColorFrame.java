import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class JColorFrame extends JFrame implements ActionListener
{
   Button colorButton = new Button("Change");
   JPanel panel1 = new JPanel();
   JPanel panel2 = new JPanel();
   JPanel panel3 = new JPanel();
   JPanel panel4 = new JPanel();
   JPanel panel5 = new JPanel();
   int count = 0;

   public JColorFrame()
   {
      super("JColorFrame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Container con = this.getContentPane();
      con.setLayout(new BorderLayout());
      panel5.add(colorButton);
      con.add(panel1, BorderLayout.NORTH);
      con.add(panel2, BorderLayout.SOUTH);
      con.add(panel3, BorderLayout.EAST);
      con.add(panel4, BorderLayout.WEST);
      con.add(panel5, BorderLayout.CENTER);
      colorButton.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if(count % 5 == 0)
         panel1.setBackground(Color.RED);
      else if(count % 5 == 1)
         panel2.setBackground(Color.PINK);
      else if(count % 5 == 2)
         panel3.setBackground(Color.ORANGE);
      else if(count % 5 == 3)
         panel4.setBackground(Color.YELLOW);
      else {
         panel1.setBackground(Color.WHITE);
         panel2.setBackground(Color.WHITE);
         panel3.setBackground(Color.WHITE);
         panel4.setBackground(Color.WHITE);
      }
      ++count;
   }

   public static void main(String[] args)
   {
      JColorFrame f = new JColorFrame();
      f.setSize(750, 500);
      f.setVisible(true);
   }
}
