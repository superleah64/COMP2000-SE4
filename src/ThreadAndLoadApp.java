import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ThreadAndLoadApp extends JFrame {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JButton btnLoad;
    private JTextArea txtLoad;

    public ThreadAndLoadApp(String title){
        super(title);
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        pack();
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

            }
        });
        btnLoad.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                super.mouseClicked(event);
                /* Load the data.txt file into the JTextArea here */
                /* FileReader read =new FileReader("data.txt"); */
                try {
                    File file = new File("data.txt");
                    Scanner scanner = new Scanner(file);
                    String text = "";
                    while (scanner.hasNextLine()) {
                        text += scanner.nextLine();
                    }
                    scanner.close();
                    txtLoad.setText(text);
                }
                catch (FileNotFoundException i) {
                    txtLoad.setText("Error loading file.");
                }
            }
        });
    }

    public static void main(String[] args) {
        ThreadAndLoadApp page = new ThreadAndLoadApp("Threading and Loading Data");
        page.setVisible(true);
    }
}