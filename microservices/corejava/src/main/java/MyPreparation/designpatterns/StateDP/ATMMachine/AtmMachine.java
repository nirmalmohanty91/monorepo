package MyPreparation.designpatterns.StateDP.ATMMachine;

public class AtmMachine implements AtmMachineState {

  private AtmMachineState atmMachineState;
  // Starting with no debit card state
  public AtmMachine() {
    atmMachineState = new NoDebitCardState();
  }

  public AtmMachineState getAtmMachineState() {
    return atmMachineState;
  }

  public void setAtmMachineState(AtmMachineState atmMachineState) {
    this.atmMachineState = atmMachineState;
  }

  @Override
  public void insertDebitCard() {
    atmMachineState.insertDebitCard();

    /*
     * Debit Card has been inserted so internal state of ATM Machine
     * has been changed to 'hasDebitCardState'
     */

    if (atmMachineState instanceof NoDebitCardState) {

      AtmMachineState hasDebitCardState = new HasDebitCardState();
      setAtmMachineState(hasDebitCardState);
      System.out.println(
          "ATM Machine internal state has been moved to : " + atmMachineState.getClass().getName());
    }
  }

  @Override
  public void removeDebitCard() {
    atmMachineState.removeDebitCard();

    /*
     * Debit Card has been ejected so internal state of ATM Machine
     * has been changed to 'noDebitCardState'
     */
    if (atmMachineState instanceof HasDebitCardState) {

      AtmMachineState noDebitCardState = new NoDebitCardState();
      setAtmMachineState(noDebitCardState);
      System.out.println(
          "ATM Machine internal state has been moved to : " + atmMachineState.getClass().getName());
    }
  }

  @Override
  public void enterPinAndWithDrawMoney() {
    atmMachineState.enterPinAndWithDrawMoney();
  }
}
