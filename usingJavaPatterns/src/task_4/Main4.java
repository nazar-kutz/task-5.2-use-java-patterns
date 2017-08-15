package task_4;

import task_4.entity.Airplain;
import task_4.entity.State;
import task_4.entity.weapons.Cannon;
import task_4.entity.weapons.MachineGun;
import task_4.entity.weapons.Rocket;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        Airplain fokkerDR1Triplane = new Airplain("Fokker DR1 Triplane");
        fokkerDR1Triplane.setAirplainWeaponAndAmmunition(new MachineGun(), 750);
        fokkerDR1Triplane.action();

        Airplain il2 = new Airplain("ИЛ-2");
        il2.setAirplainWeaponAndAmmunition(new Cannon(), 250);
        il2.action();

        Airplain f22Raptor = new Airplain("F-22 Raptor");
        f22Raptor.setAirplainWeaponAndAmmunition(new Rocket(), 20);
        f22Raptor.action();

        Thread.sleep(7000);

        System.out.println();
        System.out.println("***літаки злітають***");
        System.out.println();

        fokkerDR1Triplane.setAirplaneState(State.IN_AIR);
        il2.setAirplaneState(State.IN_AIR);
        f22Raptor.setAirplaneState(State.IN_AIR);

        Thread.sleep(2000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Round " + (i+1));
            Thread.sleep(1000);
            System.out.println();

            fokkerDR1Triplane.action();
            Thread.sleep(2300);
            System.out.println();

            il2.action();
            Thread.sleep(2300);
            System.out.println();

            f22Raptor.action();
            Thread.sleep(2300);
            System.out.println();
        }

    }
}
