/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author David
 */
public class AccidentHistory {
    private ArrayList<Accident> accidentHistory;

    public AccidentHistory(ArrayList<Accident> accidentHistory) {
        this.accidentHistory = accidentHistory;
    }

    public ArrayList<Accident> getAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(ArrayList<Accident> accidentHistory) {
        this.accidentHistory = accidentHistory;
    }
    
    
}
