package co.edu.uptc.views.peopleViewV3;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ContainerButtonV3 extends JPanel{
    private int posX = 10;
    private int posY = 10;
    private int widthPanel = 140;
    private int heightComponent = 30;
    private int spaceVerticalBetweenComponents = 1;
    private int spaceHorizontalVertLeft = 25;

    public ContainerButtonV3() {
        setLayout(null);     
        setPreferredSize(new Dimension(widthPanel, 100));
        setBackground(Color.yellow);
        initComponents();
    }

    private void initComponents() {        
        addButtonAddPerson();        
        addButtonModifyPerson();
        addButtonDeletePerson();
    }
    
    private void addButtonAddPerson() {
        JButton jButton = new JButton("Adicionar");
        addComponent(jButton);
    }

    private void addButtonModifyPerson() {
        JButton jButton = new JButton("Modificar");
        addComponent(jButton);
    }

    private void addButtonDeletePerson() {
        JButton jButton = new JButton("Delete");
        addComponent(jButton);
    }


    
    private void addComponent(JButton inputjButton) {
        inputjButton.setSize(widthPanel-(spaceHorizontalVertLeft*2), heightComponent);
        inputjButton.setLocation(spaceHorizontalVertLeft, posY);
        posY = posY+heightComponent+spaceVerticalBetweenComponents;
        add(inputjButton);
    }
}


