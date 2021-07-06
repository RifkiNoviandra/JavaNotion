/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanotion;

import java.util.Scanner;

/**
 *
 * @author Rifki Noviandra
 */
public class Javanotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limit ;
        Scanner input = new Scanner (System.in);
        System.out.print("Input The Limit : ");
        limit = input.nextInt();
        if(limit >= 0){
            for (int number = 1 ; number <= limit; number++) 
            {
                if((number % 3 == 0) && (number % 5 == 0)){
                    System.out.print("FizzBuzz" + ",");
                }
                else if(number%3 == 0){
                    System.out.print("Fizz" + ",");
                }
                else if(number%5 == 0){
                    System.out.print("Buzz" + ",");
                }
                else{
                    System.out.print(number + ",");
                }
            } System.out.println("END");
        }else{
            System.out.println("Limit Can't Be Less Than 0");
        }
    }
    
}
