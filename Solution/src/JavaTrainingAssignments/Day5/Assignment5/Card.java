package JavaTrainingAssignments.Day5.Assignment5;

interface Card {
    void joiningFees();
    void yearlyMaintainanceFees();
    void withdrawalLimit();
    void cardCreditLimit();
    void rewards();
    void gracePeriod();
    void APR();
    void minimumAge();
    void minimumIncome();
    default void cardAddOn(){}
    default void perks(){}
    default void EMI(){}
    default void noCostEMI(){}
    default void easyEMI(){}
    default void airportLoungeAccessdefault (){}

    default void insuranceCoverage(){}
    default void contactLessPayments(){}
    default void worldWideAccepted(){}
    default void protectionAgainstFraud(){}
    default void security(){}
    default void loanFacility(){}
    default void payLater(){}
    default void fuelWaiver(){}

}
