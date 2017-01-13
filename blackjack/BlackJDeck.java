package blackjack;
import java.util.*;
import templates.*;
import behaviours.*;
public class BlackJDeck extends Deck{

private String suiteName;

  public BlackJDeck(){
   this.numOfSuits = 4;
   this.numInSuit = 13;
   this.faceCards = true;
   this.suits = new HashMap<String, ArrayList>();
   this.setOfSuit = new ArrayList<Dealable>();
   this.suiteName = "";
  }

   public void populateBlackJDeck(){

    for (int suitPointer = 0; suitPointer < numOfSuits; suitPointer++){
      String suitName = setSuitName(suitPointer);
    }

    for (int cardPointer = 0; cardPointer < numInSuit; cardPointer++){
      StandardCard card = new StandardCard(cardPointer+1);
      setOfSuit.add(card);
    }

    suits.put(suitName, setOfSuit);
  }

public String setSuitName(int suitPointer){
  switch(suitPointer){
    case 0: suitName = "Clubs";
    return suitName;
    break;

    case 1: suitName = "Spades";
    return suitName;
    break;

    case 2: suitName = "Diamonds";
    return suitName;
    break;

    case 3: suitName = "Hearts";
    return suitName;
    break;
  }
}
}

