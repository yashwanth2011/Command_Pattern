public class SunblockMixerOnCommand implements Command {
    SunblockMixer sunblockMixer;

    public SunblockMixerOnCommand(SunblockMixer sunblockMixer) {
        this.sunblockMixer = sunblockMixer;
    }
    public void execute() {
        sunblockMixer.on();
    }
}