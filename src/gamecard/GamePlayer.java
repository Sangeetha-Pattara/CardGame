/*
 * Sangeetha Pattara
 * 991575884
 * SYST10199 - Web Programming
 */
package gamecard;

/**
 *
 * @author user
 */
public class GamePlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardHand ch= new CardHand();
        ch.generateHand();
        for(Card c1: ch.u)
        {
            System.out.println(c1.getColours()+" "+ c1.getRanks());
        }
    }
    
}
