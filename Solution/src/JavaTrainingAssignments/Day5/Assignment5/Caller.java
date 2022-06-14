package JavaTrainingAssignments.Day5.Assignment5;

public class Caller {

    public Caller(Card card){

        System.out.println("-------------------------------------------------------------");
        System.out.println("---------  | "+card.getClass().getSimpleName() +" | --------");
        card.joiningFees();
        card.yearlyMaintainanceFees();
        card.withdrawalLimit();
        card.cardCreditLimit();
        card.rewards();
        card.gracePeriod();
        card.APR();
        card.minimumAge();
        card.minimumIncome() ;

        if(card instanceof GoldCard){
            GoldCard goldCard=(GoldCard) card;
            goldCard.EMI();
            goldCard.noCostEMI();
            goldCard.easyEMI();
            goldCard.protectionAgainstFraud();
            goldCard.security();
            goldCard.loanFacility();
            goldCard.payLater();
            goldCard.fuelWaiver();
            goldCard.cardAddOn();
        }

        else if(card instanceof DiamondCard){
            DiamondCard diamondCard=(DiamondCard) card;
            diamondCard.EMI();
            diamondCard.noCostEMI();
            diamondCard.easyEMI();
            diamondCard.protectionAgainstFraud();
            diamondCard.security();
            diamondCard.loanFacility();
            diamondCard.payLater();
            diamondCard.fuelWaiver();
            diamondCard.cardAddOn();
            diamondCard.airportLoungeAccessdefault ();
            diamondCard.insuranceCoverage();
        }

        System.out.println("*************************************************************");

    }
}
