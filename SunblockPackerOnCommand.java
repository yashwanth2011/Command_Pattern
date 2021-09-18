public class SunblockPackerOnCommand implements Command {
    SunblockPacker sunblockPacker;

    public SunblockPackerOnCommand(SunblockPacker sunblockPacker) {
        this.sunblockPacker = sunblockPacker;
    }
    public void execute() {
        sunblockPacker.on();
    }
}