import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMovieFrame extends JFrame implements ActionListener
{
   JButton nb = new JButton("North Country");
   JLabel northLabel = new JLabel("2005, Charlize Theron");

   JButton sb = new JButton("South Park");
   JLabel southLabel = new JLabel("1997, Trey Parker");

   JButton eb = new JButton("East of Eden");
   JLabel eastLabel = new JLabel("1955, James Dean");

   JButton wb = new JButton("Westworld");
   JLabel westLabel = new JLabel("1973, James Brolin");

   JButton cb = new JButton("Journey to the Center of the Earth");
   JLabel centerLabel = new JLabel("1959, Pat Boone");

   Container con = null;

   public JMovieFrame()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb, BorderLayout.NORTH);
      con.add(sb, BorderLayout.SOUTH);
      con.add(eb, BorderLayout.EAST);
      con.add(wb, BorderLayout.WEST);
      con.add(cb, BorderLayout.CENTER);

      eb.addActionListener(this);
      cb.addActionListener(this);
      wb.addActionListener(this);
      nb.addActionListener(this);
      sb.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == nb)
      {
         remove(nb);
         add(northLabel, BorderLayout.NORTH);
      }
      else if(source == sb)
      {
         remove(sb);
         add(southLabel, BorderLayout.SOUTH);
      }
      else if(source == eb)
      {
         remove(eb);
         add(eastLabel, BorderLayout.EAST);
      }
      else if(source == wb)
      {
         remove(wb);
         add(westLabel, BorderLayout.WEST);
      }
      else
      {
         remove(cb);
         add(centerLabel, BorderLayout.CENTER);
      }
      invalidate();
      validate();
   }

   public static void main(String[] args)
   {
      JMovieFrame f = new JMovieFrame();
      f.setSize(750, 500);
      f.setVisible(true);
   }
}
