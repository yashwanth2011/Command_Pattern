public class SunblockPackerOffCommand implements Command {
    SunblockPacker sunblockPacker;

    public SunblockPackerOffCommand(SunblockPacker sunblockPacker) {
        this.sunblockPacker = sunblockPacker;
    }
    public void execute() {
        sunblockPacker.off();
    }
}