/*
 * Sangeetha Pattara
 * 991575884
 * SYST10199 - Web Programming
 */
package gamecard;

/**Coupling is the OO principle that enable to reuse the
 * original Card code and extend it to become an Uno deck .
 * It is the degree of direct knowledge that one element has of another.
 * It is possible since both the classes are in same package
 * 
 * 
 * enumeration is the  feature of the code that will allow 
 * your Card class to be reused or extended in another program.  
 *
 * @author user
 */
public class Card {
    public enum Colours{RED,YELLOW,GREEN,BLUE};
    public enum Ranks{ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVSEN,EIGHT,NINE,
    SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD};
    private final Colours colour;
     private final Ranks rank;
     public Card(Colours c,Ranks r)
     {
         colour = c;
         rank = r;
     }
    public Colours getColours()
    {
        return this.colour;
    }
    public Ranks getRanks()
    {
        return this.rank;
    }
}
