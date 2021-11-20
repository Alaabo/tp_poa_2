import javax.swing.*;
import java.awt.*;

public class panneauA extends JFrame {

      public panneauA(){
       JFrame frame = new JFrame();
       JPanel panelA = new JPanel();
       JButton btn1 = new JButton("bouton1");
       JButton btn2 = new JButton("bouton2");
       JButton btn3 = new JButton("bouton3");
       JButton btn4 = new JButton("bouton4");
       JButton btn5 = new JButton("bouton5");
          //

       frame.setSize(300,200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       frame.add(panelA);
       frame.setResizable(false);
            //
       //objects creation

       //panel managemrnt
       panelA.setLayout(new BorderLayout());
       panelA.add(btn1, BorderLayout.CENTER);
       panelA.add(btn2, BorderLayout.EAST);
       panelA.add(btn3, BorderLayout.NORTH);
       panelA.add(btn4, BorderLayout.WEST);
       panelA.add(btn5, BorderLayout.SOUTH);

   }

 public static void main(String[] args) {
  new panneauA();
 }
}
