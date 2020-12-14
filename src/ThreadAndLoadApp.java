import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ThreadAndLoadApp extends JFrame {
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton btnLoad;
    private JTextArea txtLoad;

    public ThreadAndLoadApp(String title){
        super(title);
        setContentPane(leftPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println(event.getSource());
            }
        });
        btnLoad.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                super.mouseClicked(event);
                /* Load the data.txt file into the JTextArea here */
            }
        });
    }

    public static void main(String[] args) {
        ThreadAndLoadApp page = new ThreadAndLoadApp("Threading and Loading Data");
        page.setVisible(true);
    }
}