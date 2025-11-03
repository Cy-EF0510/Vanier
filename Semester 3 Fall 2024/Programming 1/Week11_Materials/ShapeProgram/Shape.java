//import java.util.*;

class Shape { //This is now a parent(super)class
    protected String color; //only acessible to child classes
   
    void setColor(String newColor) { // Method to change the color of the shape.
    color = newColor; // change value of instance variable
    redraw(); // redraw shape, which will appear in new color
    }
   
    void redraw() { // method for drawing the shape
    // what commands should go here?
    System.out.println("I dont know what shape i will be but i am " + color);
    }
     // more instance variables and methods
   } // end of class Shape
   