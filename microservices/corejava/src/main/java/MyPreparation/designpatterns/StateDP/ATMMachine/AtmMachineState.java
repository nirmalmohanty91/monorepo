package MyPreparation.designpatterns.StateDP.ATMMachine;

public interface AtmMachineState {

  void insertDebitCard();

  void removeDebitCard();

  void enterPinAndWithDrawMoney();
}
