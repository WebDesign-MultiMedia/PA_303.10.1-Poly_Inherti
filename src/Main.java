//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Program at the "interface" defined in the superclass.
// Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster(); // upcast
        Monster m2 = new WaterMonster(); // upcast
        Monster m3 = new StoneMonster(); // upcast
// Invoke the actual implementation
        System.out.println(m1.attack()); // Run FireMonster's attack()
        System.out.println(m2.attack()); // Run WaterMonster's attack()
        System.out.println(m3.attack()); // Run StoneMonster's attack()
// m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster(); // upcast
        System.out.println(m1.attack()); // Run StoneMonster's attack()
// We have a problem here!!!
        Monster m4 = new Monster();
        System.out.println(m4.attack()); // garbage!!!
    }

    }
