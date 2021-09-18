public class SunblockMixer {
    String kind = "";

    public SunblockMixer(String kind) {
        this.kind = kind;
    }

    public void off() {
        System.out.println(kind + "Sunblock mixer is off");
    }

    public void on() {
        System.out.println(kind + "Sunblock mixer is on");
    }

}