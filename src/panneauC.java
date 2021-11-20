import javax.swing.*;
import java.awt.*;

public class panneauC extends JFrame {
    public panneauC(){
        JFrame frame3 = new JFrame();
        JPanel panelc = new JPanel();
        JPanel panelc_1 = new JPanel();
        JPanel panelc_2 = new JPanel();
        JPanel panelc_3 = new JPanel();
        JButton btn1 = new JButton("bouton1");
        JButton btn2 = new JButton("bouton2");
        JButton btn3 = new JButton("bouton3");
        JButton btn4 = new JButton("bouton4");
        JButton btn5 = new JButton("bouton5");
        JButton btn6 = new JButton("bouton6");
        frame3.setSize(300,200);
        frame3.setLocationRelativeTo(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.add(panelc);
        frame3.setResizable(false);
        frame3.setVisible(true);
        panelc.setLayout(new GridLayout(3,1,1,5));
        panelc_1.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panelc_2.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panelc_3.setLayout(new FlowLayout(FlowLayout.CENTER,1,1));
        panelc.add(panelc_1);
        panelc.add(panelc_2);
        panelc.add(panelc_3);
        panelc_1.add(btn1);
        panelc_2.add(btn2);
        panelc_2.add(btn3);
        panelc_3.add(btn4);
        panelc_3.add(btn5);
        panelc_3.add(btn6);





    }

    public static void main(String[] args) {
        new panneauC();
    }
}
