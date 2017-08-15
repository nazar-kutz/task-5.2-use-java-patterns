package task_4.entity;

import task_4.entity.weapons.MachineGun;
import task_4.entity.weapons.Weapon;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Airplain {
    private String airplainName = "Unknown";
    private State airplaneState = State.ON_GROUND;
    private Weapon airplaneWeapon;
    private int ammunition = 0;

    public Airplain(String airplainName) {
        this.airplainName = airplainName;
    }

    public void action() {
        switch (airplaneState) {
            case ON_GROUND:
                System.out.println(airplainName + " не може стріляти: знаходиться на землі!");
                break;
            case IN_AIR:
                if (airplaneWeapon != null) {
                    if (ammunition >= airplaneWeapon.getBulletsForOneShot()) {
                        System.out.print(airplainName + " ");
                        airplaneWeapon.fire();
                        ammunition -= airplaneWeapon.getBulletsForOneShot();
                        System.out.println("Боєзапас: " + ammunition);
                    } else {
                        System.out.println(airplainName + " не може стріляти: не достатньо боєприпасів!");
                    }

                } else {
                    throw new RuntimeException(airplainName + " не може стріляти: НЕ обладнаний зброєю!");
                }
        }
    }
    public void setAirplaneState(State airplaneState) {
        this.airplaneState = airplaneState;
    }

    public void setAirplaneWeapon(Weapon airplaneWeapon) {
        this.airplaneWeapon = airplaneWeapon;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public void setAirplainWeaponAndAmmunition(Weapon weapon, int ammunition){
        this.airplaneWeapon = weapon;
        this.ammunition = ammunition;
    }

    public String getAirplainName() {
        return airplainName;
    }

    public State getAirplaneState() {
        return airplaneState;
    }

    public Weapon getAirplaneWeapon() {
        return airplaneWeapon;
    }

    public int getAmmunition() {
        return ammunition;
    }
}
