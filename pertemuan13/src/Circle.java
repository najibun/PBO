/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Circle extends RoundShape {
// constructor
 public Circle(int xCenter, int yCenter, float radius){
 super(xCenter, yCenter, radius);
}
public float area(){
 float areaOfCircle = (float)(Math.PI*Math.pow(radiusOfCircle,2.0));
 return areaOfCircle;
}
}
