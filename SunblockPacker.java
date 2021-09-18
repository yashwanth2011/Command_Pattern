public class SunblockPacker {
    String kind = "";

    public SunblockPacker(String kind) {
        this.kind = kind;
    }

    public void off() {
        System.out.println(kind + "Sunblock Packer is off");
    }

    public void on() {
        System.out.println(kind + "Sunblock Packer is on");
    }

}