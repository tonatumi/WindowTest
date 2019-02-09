import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowTest extends JFrame implements ActionListener{
    JLabel label;
    public static void main (String[] args) {
        WindowTest wnd = new WindowTest("WindouTest");

        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }

    WindowTest (String title){
        setTitle("WindowTest");
        setBounds(100, 100, 400, 300);
        JPanel panel = new JPanel();
        label = new JLabel("なんもない");
        JButton button1 = new JButton("High");
        button1.addActionListener(this);
        button1.setActionCommand("High");
        JButton button2 = new JButton("Low");
        button2.setActionCommand("Low");
        button2.addActionListener(this);
        JButton button3 = new JButton("リセット");
        button3.setActionCommand("reset");
        button3.addActionListener(this);


        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        add(panel, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("High")){
            label.setText("予想：High");
        }
        else if(cmd.equals(("Low"))){
            label.setText("予想：Low");
        }
        else{
            label.setText("なんもない");
        }
    }
}
