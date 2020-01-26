package MyPreparation.designpatterns.StateDP.ATMMachine;

public class Client {

  public static void main(String[] args) {
    /*
     * Initially ATM Machine in 'noDebitCardState'
     */
    AtmMachine atmMachine = new AtmMachine();

    System.out.println(
        "ATM Machine Current state : " + atmMachine.getAtmMachineState().getClass().getName());

    System.out.println();
    atmMachine.enterPinAndWithDrawMoney();
    atmMachine.removeDebitCard();
    atmMachine.insertDebitCard();

    System.out.println("\n*******************************************************");

    /*
     * Debit Card has been inserted so internal state of ATM Machine
     * has been changed to 'hasDebitCardState'
     */
    System.out.println(
        "\nATM Machine Current state : " + atmMachine.getAtmMachineState().getClass().getName());
    System.out.println();

    atmMachine.enterPinAndWithDrawMoney();
    atmMachine.insertDebitCard();
    atmMachine.removeDebitCard();
    System.out.println("\n*******************************************************");

    /*
     * Debit Card has been ejected so internal state of ATM Machine
     * has been changed to 'noDebitCardState'
     */

    System.out.println(
        "\nATM Machine Current state : " + atmMachine.getAtmMachineState().getClass().getName());
  }
}
