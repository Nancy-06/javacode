package Test1228;



/**
 * @author guoyao
 * @create 2019/12/31
 */
import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class Copy1{
    public static void show(){
        JFrame frame=new JFrame("文本框内容复制");
        frame.setLayout(new BorderLayout());
        frame.setSize(400,250);
        frame.setLocation(250,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Destination");
        JTextField text=new JTextField(12);
        JButton button=new JButton("一键复制");
        button.addActionListener(e->{
            label.setText(text.getText());
        });

        JPanel panel=new JPanel();
        panel.add(button);
        panel.add(label);
        panel.add(text);
        frame.add(panel);
    }
}
public class Test5 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Copy1::show);

    }
}
