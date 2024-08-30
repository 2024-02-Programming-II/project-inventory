package co.edu.uptc.views.personViewV2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ContainerMenuBottomV2 extends JPanel{
  private JDialog jDialog;

    public ContainerMenuBottomV2(JDialog jDialog){
        this.jDialog = jDialog;
      
        setBackground(Color.red);
        setPreferredSize(new Dimension(100,50));        
        initComponents();
    }

    private void initComponents(){
          addButtonSave();
          addButtonCancel();
    }
    

    private ContainerMenuBottomV2 getInstance(){
        return this;
    }



    private void addButtonSave() {
         JButton jButton = new JButton("Save");
         add(jButton);
         jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                          
                JOptionPane.showMessageDialog(getInstance(),  "Pendiente por implementar",  "Información",  JOptionPane.INFORMATION_MESSAGE);
            }
            
         });
         
    }

    private void addButtonCancel() {
        JButton jButton = new JButton("Cancelar");
        add(jButton);
        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                          
                jDialog.setVisible(false);
            }
            
         });

      
    }
    
}
