package MyPreparation.designpatterns.StateDP.VendingMachine;

public class NoMoneyState implements VendingMachineState {

  public NoMoneyState() {
    System.out.println("Hello there. I am ready to process new request now!!");
  }

  @Override
  public void selectProductAndInsertMoney(String product, double money) {
    System.out.println(
        "Received Rs." + money + " for " + product + ".Processing your request now...");
  }

  @Override
  public void dispenseProduct() {
    System.out.println("Please insert money and then proceed...");
  }
}
