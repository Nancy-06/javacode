package java_homework;

import com.sun.javafx.logging.JFRInputEvent;
import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;

/**
 * @author guoyao
 * @create 2020/2/12
 */
public class Calculator {
    public  static void createCalculator(){
        JFrame f=new JFrame("计算器");
        f.setLayout(null);
        f.setSize(400,520);
        f.setResizable(false);

        JTextField field1=new JTextField("0");
       field1.setBounds(0,0,400,100);
       field1.setHorizontalAlignment(JTextField.RIGHT);
        JPanel panel=new JPanel();
        panel.setSize(400,380);
        panel.setLocation(0,100);
        panel.setLayout(new GridLayout(6,4));
        String [] strs1={"%","sqrt","x²","1/x","CE","C","Del","÷","7","8","9",
        "×","4","5","6","-","1","2","3","+","+/-","0",".","="};
        JButton button[]=new JButton[strs1.length];
        for(int i=0;i<strs1.length;i++){
           button[i]=new JButton(strs1[i]);
            panel.add(button[i]);
        }
        Container c=f.getContentPane();
        c.setLayout(null);
        c.add(panel);
        c.add(field1);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        createCalculator();
    }

}
