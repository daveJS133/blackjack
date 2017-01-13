package templates;

import java.util.*;
import blackjack.BlackJDeck;
import behaviours.*;

public class StandardCard implements Dealable{
  private int value;

   public StandardCard(int value){
    this.value = value;
  }
}