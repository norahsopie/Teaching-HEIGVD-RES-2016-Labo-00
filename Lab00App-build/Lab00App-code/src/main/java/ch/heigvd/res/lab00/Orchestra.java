package ch.heigvd.res.lab00;

import com.sun.corba.se.spi.ior.MakeImmutable;
import java.util.LinkedList;

public class Orchestra {

   private int numberOfInstruments = 0;
   private LinkedList<IInstrument> ensembleDesInstruments = new LinkedList<IInstrument>();

   public int getNumberOfInstruments() {
      return numberOfInstruments;
   }

   public void addInstrument(IInstrument instrument) {
      ensembleDesInstruments.add(instrument);
      numberOfInstruments++;
   }

   public LinkedList<String> makeMusic() {
      LinkedList<String> sounds = new LinkedList<String>();
      for (IInstrument e : ensembleDesInstruments) {
         sounds.add(e.play());
      }
      return sounds;
   }

}
