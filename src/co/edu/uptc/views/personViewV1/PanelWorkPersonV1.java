package co.edu.uptc.views.personViewV1;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelWorkPersonV1 extends JPanel {
     private int posY=40;
    private int paddingX=30;
    private int heightComponent=30;
    private int widthSubTitle = 55;
    private int spaceVerticalBetweenComponents = 3;

    public PanelWorkPersonV1(){
        setPreferredSize(new Dimension(300,300));        
        setLayout(null);
        initComponents();        
    }

    private void initComponents() {
        addTitle();
        addName();
        addLastName();
        addAge();
    }

    
    private void addTitle() {
        JLabel jLabel = new JLabel("ADICIONAR O MODIFICAR PERSONAS");        
        jLabel.setBounds(paddingX,10,300,30);
        add(jLabel);
        
    }
    
    private void addName() {
        JTextField jTextField = new JTextField();        
        addComponent(jTextField,"Nombre");
    }

    private void addLastName() {
        JTextField jTextField = new JTextField();        
        addComponent(jTextField,"Apellido");
    }

    private void addAge() {        
        JTextField jTextField = new JTextField();        
        addComponent(jTextField,"Edad");
    }


    private void addComponent(JTextField jTextField,String title){
        JLabel jLabel = new JLabel(title);        
        jLabel.setBounds(paddingX,posY,widthSubTitle,heightComponent);
        add(jLabel);

        //JTextField jTextField = new JTextField();
        jTextField.setBounds(widthSubTitle+paddingX, posY, 140, heightComponent);
        add(jTextField);
        posY = posY+heightComponent+spaceVerticalBetweenComponents;

    }
}
