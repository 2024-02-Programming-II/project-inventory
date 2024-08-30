package co.edu.uptc.views.peopleView;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class PeopleView extends JDialog {

    public PeopleView (){
        
        setSize(500,400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.red);
        setLayout(new BorderLayout());
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        addPanelButtons();
        
    }

    private void addPanelButtons() {
        ContainerButton containerButton = new ContainerButton();
        this.add(containerButton,BorderLayout.WEST);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GREEN);
        this.add(panel1,BorderLayout.CENTER);


    }

    
}
