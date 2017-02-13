package ai.game;

import java.util.Hashtable;

public class StateSnapshot {

    StateSnapshot _possibleStates[];
    
    public StateSnapshot (int numPossibleStates) {
    	if (numPossibleStates > 0) {
	    	_possibleStates = new StateSnapshot[numPossibleStates];
	    	for (int i = 0; i < numPossibleStates; ++i) {
	    		_possibleStates[i] = new StateSnapshot (numPossibleStates - 1);
	    	}
    	}
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        
        return hash;
    }
	
}
