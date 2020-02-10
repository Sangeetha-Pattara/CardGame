
/*
 * Sangeetha Pattara
 * 991575884
 * SYST10199 - Web Programming
 */
package gamecard;

/**this class contains method to generate a deck of card
 *
 * @author user
 */
public class CardHand {
//    int csize = 60;
//    Card [] u= new Card[60];
    Card [] u= new Card[60];
    void generateHand()
    {
        
        int count=0;    
        for(Card.Colours c: Card.Colours.values())
        {
            for(Card.Ranks r : Card.Ranks.values())
            {
                u[count]= new Card(c,r);
                count++;
            }
        }    
    }
        
}
