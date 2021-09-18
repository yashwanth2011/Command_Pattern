public class SunblockMoverOffCommand implements Command {
    SunblockMover sunblockMover;

    public SunblockMoverOffCommand(SunblockMover sunblockMover) {
        this.sunblockMover = sunblockMover;
    }
    public void execute() {
        sunblockMover.off();
    }
}