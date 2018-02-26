public class Perforator extends Instrument {

    private String name;
    static byte cnt1 = 0;

    public Perforator() {

        super.cnt++;
        cnt1++;
    }

    @Override
    public void twistAbility() {
        System.out.println("It's" + name + " and it's not broken!!!!");
    }

    @Override
    public void spinAbility() {
        System.out.println(name + " can spin!!!!!");
    }

    public String getParantName() {
        name = super.getName();
        return name;
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

    public static int showInfo() {
        return cnt1;
    }
}