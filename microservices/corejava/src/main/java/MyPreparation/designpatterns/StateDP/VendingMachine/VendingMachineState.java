package MyPreparation.designpatterns.StateDP.VendingMachine;

public interface VendingMachineState {

  void selectProductAndInsertMoney(String product, double money);

  void dispenseProduct();
}
