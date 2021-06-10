/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Sivagama
 * @modiffer Micah Garnett
 * @studentNumber 991495707
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        // Add a LuckyCard object
        //Micah Garnett 991495707
        Card[] luckyCard = new Card[13];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[c.randomSuit()]);

            System.out.println(c.getSuit() + ": " + c.getValue());

        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card, any card");
        System.out.println("Please select a card suit");
        System.out.println("1 for Hearts, 2 for Diamonds, 3 for Spades, or 4 for Clubs:");
        int value = input.nextInt();
        System.out.println("Please enter a card value between 1 and 13:");
        int card = input.nextInt();

        switch (value) {
            case 1: {
                System.out.println("Your card: ");
                System.out.println("Suit: Hearts");
                break;
            }
            case 2: {
                System.out.println("Your card: ");
                System.out.println("Suit: Diamonds");
                break;
            }
            case 3: {
                System.out.println("Your card: ");
                System.out.println("Suit: Spades");
                break;
            }
            case 4: {
                System.out.println("Your card: ");
                System.out.println("Suit: Clubs");
                break;
            }

        }

        // and search magicHand her
        if (value > 4 && card > 13) {

            System.out.println("The Magic Hand does not have your card");
        } else {
            System.out.println("Value: " + card);
            System.out.println("The Magic Hand does contain your card");
        }

        //Then report the result here
    }

}
