/**
 **/
package com.jgaap.eventDrivers;

import com.jgaap.generics.Document;
import com.jgaap.generics.EventSet;

/**
 * Extract character trigrams as features.
 *
 */
public class CharacterTriGramEventDriver extends NGramEventDriver {
   
    @Override
    public String displayName(){
    	return "Character TriGrams";
    }
    
    @Override
    public String tooltipText(){
    	return "Groups of Three Successive Characters";
    }
    
    @Override
    public boolean showInGUI(){
    	return false;
    }

    private NGramEventDriver theDriver;

    @Override
    public EventSet createEventSet(Document ds) {
        theDriver = new NGramEventDriver();
        theDriver.setParameter("N", "3");
        theDriver.setParameter("underlyingEvents", "CharacterEventDriver");
        theDriver.setParameter("opendelim", "null");
        theDriver.setParameter("closedelim", "null");
        theDriver.setParameter("separator", "null");
        return theDriver.createEventSet(ds);
    }
}
