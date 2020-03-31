/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.pattern.java;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class SwingObserverExample {
    
    private JFrame frame;
    
    public void go(){
        frame = new JFrame("Demonstracija observera koristenja u javi swing paketuu! ");
        JButton button = new JButton("should i do it?");
        button.setSize(100, 50);
        Font font = new Font("Ubuntu", Font.PLAIN, 18);
        button.setFont(font);
        AngelListener angelListener = new AngelListener();
        DevilListener devilListener = new DevilListener();
        button.addActionListener(devilListener);
        button.addActionListener(angelListener);
        frame.getContentPane().add(button);
        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("nemoj to raditi pokajaces se! ");
        }
    }
        
     class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Uradi to!  ");
        }
        
    
    }
}
    
