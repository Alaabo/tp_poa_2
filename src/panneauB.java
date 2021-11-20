import javax.swing.*;
import java.awt.*;

public class panneauB extends JFrame {
     public panneauB(){
         JFrame frame2 = new JFrame();
         JPanel panelB = new JPanel();
         JButton btn1 = new JButton("bouton1");
         JButton btn2 = new JButton("bouton2");
         JButton btn3 = new JButton("bouton3");
         JButton btn4 = new JButton("bouton4");
         JButton btn5 = new JButton("bouton5");
         //
         frame2.setSize(300,200);
         frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame2.setLocationRelativeTo(null);
         frame2.setVisible(true);
         frame2.add(panelB);
         frame2.setResizable(false);
         //
         //-----------------------------------------
         //
         panelB.setLayout(new FlowLayout( ));
         panelB.add(btn1);
         panelB.add(btn2);
         panelB.add(btn3);
         panelB.add(btn4);
         panelB.add(btn5);




         //
     }

    public static void main(String[] args) {
        new panneauB();
    }


}
