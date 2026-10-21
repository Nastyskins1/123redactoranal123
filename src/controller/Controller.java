package controller;
import model.Cat;
import model.Dog;
import model.SpeakBehavior;
import view.MyFrame;
import view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import java.awt.geom.RectangularShape;

public class Controller {
    Point2D []points;
    Cat cat;
    Dog dog;
    SpeakBehavior animal;
    MyPanel myPanel;
    MyFrame myFrame;
    RectangularShape currentShape;
    Rectangle2D rectangle2D;
    Ellipse2D ellipse2D;


    public Controller(){
        rectangle2D = new Rectangle2D.Double();
        ellipse2D = new Ellipse2D.Double();
        points=new Point2D[2];
        cat=new Cat("Софа");
        dog = new Dog("Буся");
        myPanel=new MyPanel(this);
        myFrame=new MyFrame(myPanel);
        animal = dog;
        currentShape=rectangle2D;
    }
    public String speak(){
        return animal.speak();
    }
    public void setCat(){
        animal=cat;
    }
    public void setDog(){
        animal=dog;
    }

    public void mousePressed(Point point) {
        points[0]=point;
    }
    public void mouseDragged(Point point){
        points[1] = point;
    }
    public void draw(Graphics2D g2){
        if(points[0]!=null)
        {
            currentShape.setFrameFromDiagonal(points[0],points[1]);
            g2.draw(currentShape);
        }

    }


    public void setEllipse() {
        currentShape = ellipse2D;
    }

    public void setRect() {
        currentShape = rectangle2D;
    }
}
