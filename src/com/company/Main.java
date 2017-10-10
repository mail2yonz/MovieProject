package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter a movie Title:");

        String input= keyboard.nextLine (  );

       System.out.println(input);

        int count=0;

          while(!input.equalsIgnoreCase ( "quit" ))
          {
              System.out.println("Enter another movie");

              input=keyboard.nextLine (  );

              System.out.println(input);

              count++;

          }
              System.out.println("The movies are :"+count);


          }
         //System.out.println("The movie is: "+input);
       /* while(count<0)//!input.equalsIgnoreCase ( "quit" ))
        {
            if(input.equalsIgnoreCase ( "quit" ))
            {
                System.exit(0);
            }else {
                System.out.println ( "The movie is :" + input );

            }
            System.out.println("Enter another movie:");
            keyboard.next (  );
            count++;
        }

       System.out.println("Number of movies is: "+count);*/
    }

