/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
class Latihan{  
  static int data=1976;  
  static class Inner{  
   void msg(){System.out.println("Cumleng Boys "+data);}  
  }  
  public static void main(String args[]){  
  Latihan.Inner obj=new Latihan.Inner();  
  obj.msg();  
  }  
} 