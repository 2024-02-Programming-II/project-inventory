package co.edu.uptc.views.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.uptc.views.peopleView.PeopleView;

public class DashBoard extends JFrame {

    public DashBoard(){
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);
        setVisible(true);
        initComponents();
    }

    private void initComponents(){
        addButtonPeople();
    }

    private void addButtonPeople() {
        JButton jButton = new JButton("Personas");
        jButton.setBounds(10,10,100,30);
        add(jButton);
        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PeopleView peopleView = new PeopleView();
                
            }
            
        });

    }

}