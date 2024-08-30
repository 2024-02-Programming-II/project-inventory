package co.edu.uptc.views.personViewV2;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PanelWorkPersonV2 extends JPanel {

    private SpringLayout layout;

    public PanelWorkPersonV2() {
        setPreferredSize(new Dimension(300, 300));
        layout = new SpringLayout();
        setLayout(layout);
        initComponents();
    }

    private void initComponents() {
       

    SpringLayout layout = new SpringLayout();
    setLayout(layout);

    
    JLabel label1 = new JLabel("Nombre: ");
    JTextField textField1 = new JTextField(10);

    JLabel label2 = new JLabel("Apellido: ");
    JTextField textField2 = new JTextField(10);

    JLabel label3 = new JLabel("Edad: ");
    JTextField textField3 = new JTextField(10);

    add(label1);
    add(textField1);
    add(label2);
    add(textField2);
    add(label3);
    add(textField3);


      
        int labelWidth = Math.max(
            Math.max(label1.getPreferredSize().width, label2.getPreferredSize().width),
            label3.getPreferredSize().width
        );

    
        layout.putConstraint(SpringLayout.WEST, label1, 10, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, label1, 10, SpringLayout.NORTH, this);

        layout.putConstraint(SpringLayout.WEST, textField1, labelWidth + 15, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, textField1, 10, SpringLayout.NORTH, this);

        layout.putConstraint(SpringLayout.WEST, label2, 10, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, label2, 10, SpringLayout.SOUTH, label1);

        layout.putConstraint(SpringLayout.WEST, textField2, labelWidth + 15, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, textField2, 10, SpringLayout.SOUTH, textField1);

        layout.putConstraint(SpringLayout.WEST, label3, 10, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, label3, 10, SpringLayout.SOUTH, label2);

        layout.putConstraint(SpringLayout.WEST, textField3, labelWidth + 15, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, textField3, 10, SpringLayout.SOUTH, textField2);

    
    }
}