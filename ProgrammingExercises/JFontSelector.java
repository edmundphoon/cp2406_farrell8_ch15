import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFontSelector extends JFrame implements ActionListener
{
   final int SMALL = 12;
   final int BIG = 24;
   int size = SMALL;
   boolean isSmaller = true;

   JButton arial = new JButton("Arial");
   JButton timesNewsRoman = new JButton("Times New Roman");
   JButton calibri = new JButton("Calibri");
   JButton verdana = new JButton("Verdana");
   JButton trebuchet = new JButton("Trebuchet MS");

   JButton sizeAdjust = new JButton("Adjust Size [Small/Big]");

   Panel fontPanel = new Panel();

   Font arialFont = new Font("Arial", Font.PLAIN, size);
   Font timesFont = new Font("TimesRoman", Font.PLAIN, size);
   Font calibriFont = new Font("Calibri", Font.PLAIN, size);
   Font verdanaFont = new Font("Verdana", Font.PLAIN, size);
   Font trebuchetFont = new Font("TrebuchetMS", Font.PLAIN, size);
   Font myFont = arialFont;

   JLabel label = new JLabel("Your font");

   public JFontSelector()
   {
      setTitle("JFontFrame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setLayout(new FlowLayout());
      add(arial);
      add(timesNewsRoman);
      add(calibri);
      add(verdana);
      add(trebuchet);
      add(sizeAdjust);
      add(label);
      label.setFont(arialFont);
      add(fontPanel);
      arial.addActionListener(this);
      timesNewsRoman.addActionListener(this);
      calibri.addActionListener(this);
      verdana.addActionListener(this);
      trebuchet.addActionListener(this);
      sizeAdjust.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == timesNewsRoman)
      {
         myFont = timesFont;
      }
      else if(source == calibri)
      {
         myFont = calibriFont;
      }
      else if(source == verdana)
      {
         myFont = verdanaFont;
      }
      else if(source == trebuchet)
      {
         myFont = trebuchetFont;
      }
      else if(source == arial)
      {
         myFont = arialFont;
      }
      else if(source == sizeAdjust)
      {
         if(isSmaller)
         {
            myFont = myFont.deriveFont(Font.PLAIN, BIG);
            isSmaller = false;
         }
         else
         {
            myFont = myFont.deriveFont(Font.PLAIN, SMALL);
            isSmaller = true;
         }
      }
      label.setFont(myFont);
   }

   public static void main(String[] args)
   {
      JFontSelector f = new JFontSelector();
      f.setSize(750, 500);
      f.setVisible(true);
   }
}
