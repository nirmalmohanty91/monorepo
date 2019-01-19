package MyPreparation.designpatterns.StateDP.ATMMachine;

public class HasDebitCardState implements AtmMachineState {
  @Override
  public void insertDebitCard() {
    System.out.println("Debit card is already inserted");
  }

  @Override
  public void removeDebitCard() {
    System.out.println("Debit car ejected.");
  }

  @Override
  public void enterPinAndWithDrawMoney() {

    System.out.println("Entered pin and withdrawn money.");
  }
}
