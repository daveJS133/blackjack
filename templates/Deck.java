package templates;

import java.util.*;
import behaviours.*;




public abstract class Deck{
  protected int numOfSuits;
  protected int numInSuit;
  protected HashMap<String, ArrayList> suits;
  protected ArrayList<Dealable> setOfSuit;
  protected boolean faceCards;

}