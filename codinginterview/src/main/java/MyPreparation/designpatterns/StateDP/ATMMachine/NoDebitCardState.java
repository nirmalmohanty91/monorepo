package MyPreparation.designpatterns.StateDP.ATMMachine;

public class NoDebitCardState implements AtmMachineState {
    @Override
    public void insertDebitCard() {
    System.out.println("Debit card inserted...");
    }

    @Override
    public void removeDebitCard() {
    System.out.println("No debit card found. Can not eject card...");
    }

    @Override
    public void enterPinAndWithDrawMoney() {
    System.out.println("Can't withdraw money. Because no card found.");
    }
}
