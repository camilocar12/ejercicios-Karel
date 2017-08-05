package becker;

import becker.robots.*;

public class ejercicio2karel
{
    public static void girarDerecha (Robot karel){
        for (int i = 0; i < 3; i++){
            karel.turnLeft();
        }
    }
    public static void girar180 (Robot karel){
        for (int i = 0; i < 2; i++){
            karel.turnLeft();
        }
    }

   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing w1 = new Thing(prague, 2, 2);
      Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
      Wall p1= new Wall (prague, 1,1, Direction.NORTH);
      Wall p2= new Wall (prague, 1,2, Direction.NORTH);
      Wall p3= new Wall (prague, 1,1, Direction.WEST);
      Wall p4= new Wall (prague, 2,1, Direction.WEST);
      Wall p5= new Wall (prague, 2,1, Direction.SOUTH);
      Wall p6= new Wall (prague, 1,2, Direction.SOUTH);
      Wall p7= new Wall (prague, 1,2, Direction.EAST);
      girarDerecha(karel);
      for (int i=0;i<2;i++){
      karel.move();
      karel.turnLeft();
      }
      karel.move();
      karel.pickThing();
      girar180(karel);
      for (int i=0;i<2;i++){
      karel.move();
      girarDerecha(karel);
      }
      karel.move();
      girarDerecha(karel);
      System.out.println(karel.countThingsInBackpack());
   }
}