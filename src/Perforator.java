public class Perforator extends Instrument {

    private String name;
    static byte cnt1 = 0;

    @Override
    public void twistAbility() {
        System.out.println("It's" + name + " and it's not broken!!!!");
    }

    @Override
    public void spinAbility() {
        System.out.println(name + " can spin!!!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showCounter() {
        System.out.println("The numbers of perforators is " + cnt);
    }

    Perforator() {
        super.cnt++;
        cnt1++;
    }

    public static int showInfo() {
        return cnt1;
    }
}