package co.edu.uptc.views.dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.uptc.views.peopleViewV1.PeopleViewV1;
import co.edu.uptc.views.peopleViewV2.PeopleViewV2;
import co.edu.uptc.views.peopleViewV3.PeopleViewV3;

public class DashBoard extends JFrame {

    public DashBoard(){
        //setExtendedState(MAXIMIZED_BOTH);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        addButtonPeopleV1();
        addButtonPeopleV2();
        addButtonPeopleV3();
    }

    private void addButtonPeopleV1() {
        JButton jButton = new JButton("Personas V1");
        jButton.setBounds(10,10,150,30);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new PeopleViewV1();                
            }            
        });
    }

    
    private void addButtonPeopleV2() {
        JButton jButton = new JButton("Personas V2");
        jButton.setBounds(10,60,150,30);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new PeopleViewV2();                
            }            
        });
    }

    private void addButtonPeopleV3() {
        JButton jButton = new JButton("Personas V3");
        jButton.setBounds(10,100,150,30);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new PeopleViewV3();                
            }            
        });
    }



}