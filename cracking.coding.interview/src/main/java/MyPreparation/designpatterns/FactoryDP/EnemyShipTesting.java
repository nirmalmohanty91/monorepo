package MyPreparation.designpatterns.FactoryDP;

import java.util.Objects;
import java.util.Scanner;

public class EnemyShipTesting {

  public static void main(String[] args) {

    EnemyShip theEnemy = null;

    Scanner userInput = new Scanner(System.in);

    String enemyShipOption = "";
    System.out.println("What type of enemy (U/R/B)? ");

    if (userInput.hasNextLine()) {
      enemyShipOption = userInput.nextLine();
      theEnemy = new EnemyShipFactory().makeEnemyShip(enemyShipOption);
    }
    // Getting Object dynamically based on user input without factory pattern
    /**
     * if (enemyShipOption.equalsIgnoreCase("U")) { theEnemy = new UFOEnemyShip(); } else if
     * (enemyShipOption.equalsIgnoreCase("R")) { theEnemy = new RocketEnemyShip(); }
     */
    if (Objects.nonNull(theEnemy)) {
      doStuff(theEnemy);
    } else {
      System.out.println("Please enter R B U");
    }
  }

  public static void doStuff(EnemyShip anEnemyShip) {
    anEnemyShip.followHeroShip();
    anEnemyShip.displyEnemyShip();
    anEnemyShip.enemyShipShoots();
  }
}
