package task_4.entity.weapons;

/**
 * Created by Nazar on 11.08.2017.
 */
public class MachineGun implements Weapon {
    @Override
    public int getBulletsForOneShot() {
        return (int)(1 + Math.floor(Math.random()*14));
    }

    @Override
    public void fire() {
        System.out.print("стріляє з кулемету! ");
    }
}
