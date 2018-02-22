public class Instrument implements InstrumentsPossibilities {

    protected static byte cnt = 0;
     static String name = "Instrument";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void twistAbility() {
        System.out.println("I can twist!!!");
    }

    public void spinAbility() {
        System.out.println("I can spin!!!");
    }
}

