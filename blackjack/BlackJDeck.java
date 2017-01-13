package blackjack;
import java.util.*;
import Deck;
import StandardCard;

public class BlackJDeck extends Deck{

  public BlackJDeck(){
   this.numOfSuits = 4;
   this.numInSuit = 13;
   this.faceCards = True;
   this.suits = new HashMap<String, setOfSuit>();
   this.setOfSuit = new ArrayList<StandardCard>();
  }

   public void populateBlackJDeck(){

    for (int suitPointer = 0; suitPointer < numOfSuits; suitPointer++){
      suitname = setSuitName(suitPointer);
    }

    for (int cardPointer = 0; cardPointer < numInSuit; cardPointer++){
      card = new StandardCard(cardPointer+1);
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

