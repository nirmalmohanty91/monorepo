package MyPreparation.designpatterns.FactoryDP;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class EnemyShip {

  private String name;
  private double amountOfDamage;

  public void followHeroShip() {
    System.out.println(getName() + " following the hero");
  }

  public void displyEnemyShip(){
    System.out.println(getName()+" is on the screen");
  }

  public void enemyShipShoots() {
    System.out.println(getName() + " attacks and does " + getAmountOfDamage());
  }
}
