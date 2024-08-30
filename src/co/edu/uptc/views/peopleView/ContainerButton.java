package co.edu.uptc.views.peopleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ContainerButton extends JPanel{
    private int spaceBetweenComponets=70;
    
   public ContainerButton(){
    setLayout(null);
    
       initComponents();
    setPreferredSize(new Dimension(140,100));
    // setLocation(1,1);
    // setSize(120,400);
    setBackground(Color.blue);
   }

private void initComponents(){
    addButtonAddPerson();
    addButtonModifyPerson();
}

private void addButtonAddPerson() {
    JButton jButton = new JButton("Adicionar");
    //jButton.setAlignmentX(Component.LEFT_ALIGNMENT);
    jButton.setBounds(10,10+spaceBetweenComponets,100,30);
    this.add(jButton);
}

private void addButtonModifyPerson() {
    JButton jButton = new JButton("Mod");
    jButton.setBounds(10,50+spaceBetweenComponets,100,30);
    //jButton.setAlignmentX(Component.LEFT_ALIGNMENT);
    this.add(jButton);
}


}
