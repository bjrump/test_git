import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JButton button;
    private int i = 0;
    
    public test(){
        button = new JButton("click mich!");
        button.addActionListener(new ButtonLauscher());
        
        this.getContentPane().add(button);
    }
    
    class ButtonLauscher implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                i++;
                System.out.println("Button geklickt! " + i);
            }
        }
    }
    
    public static void main(String[] args){
        test bec = new test();
        bec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bec.setSize(200, 200);
        bec.setVisible(true);
    }
}