package co.edu.uptc.views.peopleViewV1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class PeopleViewV1 extends JDialog {

    public PeopleViewV1 (){
        setTitle("Version 1");
        
        setSize(500,400);
        setLocationRelativeTo(null);      
        setLayout(new BorderLayout());
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        addPanelButtons();
        addWorkArea();
        
    }

    private void addPanelButtons() {
        ContainerButtonV1 containerButton = new ContainerButtonV1();
        this.add(containerButton,BorderLayout.WEST);
    }

    private void addWorkArea(){
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GREEN);
        this.add(panel1,BorderLayout.CENTER);
    }

    
}
