public class SunblockMixerOffCommand implements Command {
    SunblockMixer sunblockMixer;

    public SunblockMixerOffCommand(SunblockMixer sunblockMixer) {
        this.sunblockMixer = sunblockMixer;
    }
    public void execute() {
        sunblockMixer.off();
    }
}