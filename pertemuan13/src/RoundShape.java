/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public abstract class RoundShape
{ // coordinates of center represented by an inner class
 protected class Center
 { int x,y; }
protected Center C = new Center();
protected float radiusOfCircle;
// constructor
public RoundShape(int xCenter, int yCenter, float radius)
{
C.x=xCenter;
C.y=yCenter;
radiusOfCircle = radius;
}
// abstract method
abstract public float area();
}

