package com;

import java.util.ArrayList;

public class Spel {
    private Gebruiker gebruiker;

    public ArrayList<CreditPakket> ophalenCreditPakketten(){
       return gebruiker.ophalenCreditPakketten();
    }

    public CreditPakket bevestigPakketKeuze(int nummerCreditPakket){
        return gebruiker.bevestigPakketKeuze(nummerCreditPakket);
    }

    public void betaalCredits(CreditPakket gekozenCreditPakket){
        gebruiker.betaalCredits(gekozenCreditPakket);
    }

    public void opstartenSpel() {
    }
}
