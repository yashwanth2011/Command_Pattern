public class SunblockMover {
    String kind = "";

    public SunblockMover(String kind) {
        this.kind = kind;
    }

    public void off() {
        System.out.println(kind + "Sunblock mover is off");
    }

    public void on() {
        System.out.println(kind + "Sunblock mover is on");
    }

}