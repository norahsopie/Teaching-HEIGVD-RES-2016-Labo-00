package ch.heigvd.res.lab00;

import com.sun.corba.se.spi.ior.MakeImmutable;
import java.util.LinkedList;

public class Orchestra {

   private int numberOfInstruments = 0;
   private LinkedList<IInstrument> setOfInstruments = new LinkedList<IInstrument>();

   public int getNumberOfInstruments() {
      return numberOfInstruments;
   }

   public void addInstrument(IInstrument instrument) {
      setOfInstruments.add(instrument);
      numberOfInstruments = setOfInstruments.size();
   }

   public LinkedList<String> makeMusic() {
      LinkedList<String> sounds = new LinkedList<String>();
      for (IInstrument e : setOfInstruments) {
         sounds.add(e.play());
      }
      return sounds;
   }

}
