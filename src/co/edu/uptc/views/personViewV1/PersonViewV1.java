package co.edu.uptc.views.personViewV1;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class PersonViewV1 extends JDialog{

    public PersonViewV1(){        
        setSize(300,300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        addPanelWork();
        addMenuBottom();
    }
    
    private void addPanelWork(){
        PanelWorkPersonV1 panelWorkPerson = new PanelWorkPersonV1();
        add(panelWorkPerson,BorderLayout.CENTER);
    }

    private void addMenuBottom(){
        ContainerMenuBottomV1 containerMenuBottom = new ContainerMenuBottomV1(this);
        add(containerMenuBottom,BorderLayout.SOUTH);
    }
  

}
