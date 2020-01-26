package MyPreparation.designpatterns.StateDP.VendingMachine;

public class HasMoneySate implements VendingMachineState {

  @Override
  public void selectProductAndInsertMoney(String product, double money) {
    System.out.println("Processing another request. Can't respond now. Sorry!!");
  }

  @Override
  public void dispenseProduct() {
    System.out.println("Collect the item from dispense box. Please visit again!!");
  }
}
