package co.edu.uptc.views.personViewV2;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class PersonViewV2 extends JDialog{

    public PersonViewV2(){        
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
        PanelWorkPersonV2 panelWorkPerson = new PanelWorkPersonV2();
        add(panelWorkPerson,BorderLayout.CENTER);
    }

    private void addMenuBottom(){
        ContainerMenuBottomV2 containerMenuBottom = new ContainerMenuBottomV2(this);
        add(containerMenuBottom,BorderLayout.SOUTH);
    }
  

}
