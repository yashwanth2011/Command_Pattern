public class SunblockMoverOnCommand implements Command {
    SunblockMover sunblockMover;

    public SunblockMoverOnCommand(SunblockMover sunblockMover) {
        this.sunblockMover = sunblockMover;
    }
    public void execute() {
        sunblockMover.off();
    }
}