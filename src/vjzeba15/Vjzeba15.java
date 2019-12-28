package vjzeba15;

import java.util.Arrays;
import java.util.Scanner;

public class Vjzeba15 {

    public static void main(String[] args) {
        
      try(Scanner sc = new Scanner(System.in)){
          Size s = Size.MEDIUM;
              System.out.println("size = " + s);
              System.out.println("Unesi velicinu : (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
              String input = sc.next().toUpperCase();
              s = Enum.valueOf(Size.class, input);
              System.out.println("size = " + s);
              if(s == Size.SMALL)
                  System.out.println("Izabrana je najmanja velicina");
              System.out.println("Redni broj konstante: " + s.ordinal());
              int res;
              if((res = s.compareTo(Size.MEDIUM)) == 0)
                  System.out.println("velicina je jednaka " + s);
              else 
                  if((res<0))
                      System.out.println("velicina je manja od " + Size.MEDIUM);
              else
                      System.out.println("velicina je veca od " +  Size.MEDIUM);
              
              Size[] array = Size.values();
              System.out.println("Sve Eunum-Konstante za tip Size: ");
              System.out.println(Arrays.toString(array));
     }
    }

}
