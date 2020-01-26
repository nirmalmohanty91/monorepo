package MyPreparation.designpatterns.StateDP.VendingMachine;

public class Client {
  public static void main(String[] args) {

      VendingMachine vendingMachine = new VendingMachine();
      vendingMachine.selectProductAndInsertMoney("Soya Stick",10);
      vendingMachine.selectProductAndInsertMoney("Mountain Dew",20);
      vendingMachine.dispenseProduct();
      vendingMachine.dispenseProduct();
      vendingMachine.selectProductAndInsertMoney("Mountain Dew",20);

  }
}
