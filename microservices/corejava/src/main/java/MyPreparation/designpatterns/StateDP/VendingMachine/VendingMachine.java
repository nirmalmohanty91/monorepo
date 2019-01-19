package MyPreparation.designpatterns.StateDP.VendingMachine;

/** Context */
public class VendingMachine implements VendingMachineState {

  VendingMachineState vendingMachineState;

  public VendingMachine() {
    this.vendingMachineState = new NoMoneyState();
  }

  public VendingMachineState setVendingMachineState(VendingMachineState state) {
    this.vendingMachineState = state;
    return state;
  }

  @Override
  public void selectProductAndInsertMoney(String product, double money) {
    vendingMachineState.selectProductAndInsertMoney(product, money);
    if (vendingMachineState instanceof NoMoneyState) {
      HasMoneySate hasMoneySate = new HasMoneySate();
      setVendingMachineState(hasMoneySate);
    }
  }

  @Override
  public void dispenseProduct() {
    vendingMachineState.dispenseProduct();
    if (vendingMachineState instanceof HasMoneySate) {
      NoMoneyState noMoneyState = new NoMoneyState();
      setVendingMachineState(noMoneyState);
    }
  }
}
