/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** CardTrick.java
 *Author: Sukhpreet Kaur
 * Date: 29 Jan, 2023 
 */
import java.util.Scanner;
public class CardTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] hand = new int[7];
        for(int i =0; i< 7;i++){
            hand[i]= (int) (Math.random()*13 +1);

        }
        boolean cardFound = false;
        System.out.println("enter a int from 1 to 13 for your card number");
        int userDigit = input.nextInt();
        for (int i=0; i< hand.length;i++){
            if(hand[i]==userDigit){
              
                cardFound=true;
            }
        }
       
    }
    
    // I'm done
    public void printinfo(){
        
          System.out.print("The card number that you entered is found in the hand that holds seven random cards \n" + 
             "the developer of this code is Sukhpreet Kaur - a Sheridan student studying in semester 2 of computer programming diploma ");
          
    }
}
