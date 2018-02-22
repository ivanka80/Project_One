public class Screwdriver extends Instrument {

    private String name;
    static byte cnt1 = 0;


    @Override
    public void twistAbility() {
        System.out.println("It's " + name + " and it broken!!!!");
    }

    @Override
    public void spinAbility() {
        System.out.println("It's new " + name + " and it's  OK!!!!");
    }

    public String getParantName() {
        name = super.name;
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Screwdriver() {
        super.cnt++;
        cnt1++;
    }

    public static int showInfo() {
        return cnt1;
    }

}