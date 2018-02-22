public class Main {

    public static void main(String[] args) {

        Screwdriver s1 = new Screwdriver();
        s1.setName("Bosh");
        s1.spinAbility();

        System.out.println(s1.getName());

        Screwdriver s2 = new Screwdriver();
        s2.setName("DWT");
        s2.twistAbility();

        Perforator p1 = new Perforator();
        p1.setName("Makita");
        p1.spinAbility();

        System.out.println(s1.getParantName() + " is parant class!");
        System.out.println(s2.getName() + " is the object of heair class !!!");
        System.out.println(p1.getName() + " is the object of is heir class !!! ");

        showInfo ();
    }

    public static void showInfo() {
        System.out.println("The total of screwdrivers is " + Screwdriver.cnt1);
        System.out.println("The total of perforetors is " + Perforator.cnt1);
        System.out.println("The total of instruments is " + Instrument.cnt);
    }
}