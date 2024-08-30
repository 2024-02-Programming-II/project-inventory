package co.edu.uptc.views.peopleViewV1;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ContainerButtonV1 extends JPanel {
    private int spaceVerticalBetweenComponents = 1;
    private int spaceHorizontalVertLeft = 25;

    public ContainerButtonV1() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));     
        setPreferredSize(new Dimension(140, 100));
        setBackground(Color.blue);
        initComponents();
    }

    private void initComponents() {
        add(Box.createVerticalStrut(spaceVerticalBetweenComponents));        
        addButtonAddPerson();        
        addButtonModifyPerson();
        addButtonDeletePerson();
    }
    
    private void addButtonAddPerson() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setOpaque(false); 
        panel.setAlignmentX(LEFT_ALIGNMENT);  
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); 
        
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0))); 
        JButton jButton = new JButton("Adicionar");       
        jButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, jButton.getPreferredSize().height)); 
        jButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        panel.add(jButton);        
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0))); 
        this.add(panel);
        add(Box.createVerticalStrut(spaceVerticalBetweenComponents));
    }

    private void addButtonModifyPerson() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setOpaque(false); 
        panel.setAlignmentX(LEFT_ALIGNMENT); 
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); 
        
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0))); 
        JButton jButton = new JButton("Modificar");      
        jButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, jButton.getPreferredSize().height));
        jButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(jButton);       
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0)));  
        this.add(panel);
        add(Box.createVerticalStrut(spaceVerticalBetweenComponents));
    }

    private void addButtonDeletePerson() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setOpaque(false); 
        panel.setAlignmentX(LEFT_ALIGNMENT); 
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); 
        
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0))); 
        JButton jButton = new JButton("Borrar");      
        jButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, jButton.getPreferredSize().height));
        jButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(jButton);       
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0)));  
        this.add(panel);
        add(Box.createVerticalStrut(spaceVerticalBetweenComponents));
    }
}