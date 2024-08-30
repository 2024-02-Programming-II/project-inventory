package co.edu.uptc.views.peopleViewV2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.views.personViewV1.PersonViewV1;
import co.edu.uptc.views.personViewV2.PersonViewV2;

public class ContainerButtonV2 extends JPanel{
    private int spaceVerticalBetweenComponents = 1;
    private int spaceHorizontalVertLeft = 25;

    public ContainerButtonV2() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));     
        setPreferredSize(new Dimension(140, 100));
        setBackground(Color.red);
        initComponents();
    }

    private void initComponents() {
        add(Box.createVerticalStrut(spaceVerticalBetweenComponents));        
        addButtonAddPerson();        
        addButtonModifyPerson();
        addButtonDeletePerson();
    }
    
    private void addButtonAddPerson() {

        JButton jButton = new JButton("Adicionar");  
        addComponent(jButton);
         jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PersonViewV2 personView = new PersonViewV2();
            }
            
        });
    }

    private void addButtonModifyPerson() {
        JButton jButton = new JButton("Modificar");  
        addComponent(jButton);
    }

    private void addButtonDeletePerson() {
        JButton jButton = new JButton("Delete");  
        addComponent(jButton);
    }




    // Teniendo en cuenta que en cada metodo se hace lo mismo, se generaliza el algoritmo 
    private void addComponent(JButton inputjButton) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setOpaque(false); 
        panel.setAlignmentX(LEFT_ALIGNMENT); 
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); 
        
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0))); 
        JButton jButton = inputjButton;
        jButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, jButton.getPreferredSize().height));
        jButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(jButton);       
        panel.add(Box.createRigidArea(new Dimension(spaceHorizontalVertLeft, 0)));  
        this.add(panel);
        add(Box.createVerticalStrut(spaceVerticalBetweenComponents));
    }
}


