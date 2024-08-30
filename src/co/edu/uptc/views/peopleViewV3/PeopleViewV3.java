package co.edu.uptc.views.peopleViewV3;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class PeopleViewV3 extends JDialog {

    public PeopleViewV3 (){
        setTitle("Version 2");
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
        ContainerButtonV3 containerButton = new ContainerButtonV3();
        this.add(containerButton,BorderLayout.WEST);
       
    }

    private void addWorkArea(){
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GREEN);
        this.add(panel1,BorderLayout.CENTER);
    }

    
}
