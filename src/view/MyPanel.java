package view;


import controller.Controller;
import model.SpeakBehavior;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;

public class MyPanel extends JPanel {
    JTextField t1;
//    JTextField t2;
    JButton b3;
    JButton b4;
//    JButton b1;
//    JButton cat;
//    JButton dog;
//    JButton b2;
//    SpeakBehavior cat;
//    SpeakBehavior dog;
//    SpeakBehavior animals;
    Controller controller;


    public MyPanel(Controller controller){
        this. controller=  controller;
        t1=new JTextField("                             ");
        b3=new JButton("Ellipse");
        b4=new JButton("Rect");

//        b1=new JButton("speak animal");
//        cat=new JButton("setCat");
//        dog=new JButton("setDog");



        add(t1);
        add(b3);
        add(b4);
//        add(b1);
//        add(cat);
//        add(dog);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controller.setEllipse();;
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controller.setRect();;
            }
        });
//        ellipse.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                controller.setEllipse();
//            }
//        });
//        rect.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                controller.setRect();
//            }
//        });


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                controller.mousePressed(e.getPoint());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                controller.mouseDragged(e.getPoint());
                repaint();
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 =(Graphics2D) g;
        controller.draw(g2);
    }

}


//    public MyPanel(SpeakBehavior cat,SpeakBehavior dog){
//        this.cat = cat;
//        this.dog = dog;
//        t1=new JTextField("         ");
//        t2 = new JTextField("        ");
//        b1=new JButton("cat speak");
//        b2=new JButton("dog speak");
//        add(t1);
//        add(t2);
//        add(b1);
//        add(b2);
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                t1.setText(cat.speak());}
//        });
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                t2.setText(dog.speak());}
//        });
//    }
//}
