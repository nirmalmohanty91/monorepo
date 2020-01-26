package MyPreparation.designpatterns.FactoryDP;

public class EnemyShipFactory {

  public EnemyShip makeEnemyShip(String type) {

    if (type.equalsIgnoreCase("U")) {
      return new UFOEnemyShip();
    } else if (type.equalsIgnoreCase("R")) {
      return new RocketEnemyShip();
    } else if (type.equalsIgnoreCase("B")) {
      return new BigUFOEnemyShip();
    } else {
      return null;
    }
  }
}
