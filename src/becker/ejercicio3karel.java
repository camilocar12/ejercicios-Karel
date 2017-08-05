package becker;

import becker.robots.*;

public class ejercicio3karel
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
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,5);
      Thing t1 = new Thing(prague, 1, 1);
      Thing t2 = new Thing(prague, 1, 2);
      Thing t3 = new Thing(prague, 1, 3);
      Thing t4 = new Thing(prague, 1, 4);
      Thing t5 = new Thing(prague, 1, 5);
      Thing t6 = new Thing(prague, 2, 5);
      Thing t7 = new Thing(prague, 3, 5);
      Thing t8 = new Thing(prague, 4, 5);
      Thing t9 = new Thing(prague, 5, 5);
      Thing t10 = new Thing(prague, 6, 5);
      Thing t11 = new Thing(prague, 6, 4);
      Thing t12 = new Thing(prague, 6, 3);
      Thing t13 = new Thing(prague, 6, 2);
      Thing t14 = new Thing(prague, 6, 1);
      Thing t15 = new Thing(prague, 5, 1);
      Thing t16 = new Thing(prague, 4, 1);
      Thing t17 = new Thing(prague, 3, 1);
      Thing t18 = new Thing(prague, 2, 1);
      Thing t19 = new Thing(prague, 2, 2);
      Thing t20 = new Thing(prague, 2, 3);
      Thing t21 = new Thing(prague, 2, 4);
      Thing t22 = new Thing(prague, 3, 4);
      Thing t23 = new Thing(prague, 4, 4);
      Thing t24 = new Thing(prague, 5, 4);
      Thing t25 = new Thing(prague, 5, 3);
      Thing t26 = new Thing(prague, 5, 2);
      Thing t27 = new Thing(prague, 4, 2);
      Thing t28 = new Thing(prague, 3, 2);
      Thing t29 = new Thing(prague, 3, 3);
      Thing t30 = new Thing(prague, 4, 3);
     
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