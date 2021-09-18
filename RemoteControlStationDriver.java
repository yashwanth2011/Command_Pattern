public class RemoteControlStationDriver {

    public static void main(String[] args) {
        RemoteControlStation remoteControlStation = new RemoteControlStation();

        SunblockMixer naturalSunblockMixer = new SunblockMixer("Natural Sunblock");
        SunblockPacker naturalSunblockPacker = new SunblockPacker("Natural Sunblock");
        SunblockMover naturalSunblockMover = new SunblockMover("Natural Sunblock");

        SunblockMixerOnCommand naturalSunblockMixeron =
                new SunblockMixerOnCommand(naturalSunblockMixer);
        SunblockMixerOffCommand naturalSunblockMixeroff =
                new SunblockMixerOffCommand(naturalSunblockMixer);
        SunblockPackerOnCommand naturalSunblockPackeron =
                new SunblockPackerOnCommand(naturalSunblockPacker);
        SunblockPackerOffCommand naturalSunblockPackeroff =
                new SunblockPackerOffCommand(naturalSunblockPacker);
        SunblockMoverOnCommand naturalSunblockMoveron =
                new SunblockMoverOnCommand(naturalSunblockMover);
        SunblockMoverOffCommand naturalSunblockMoveroff =
                new SunblockMoverOffCommand(naturalSunblockMover);

        remoteControlStation.setCommand(0, naturalSunblockMixeron, naturalSunblockMixeroff);
        remoteControlStation.setCommand(1, naturalSunblockPackeron, naturalSunblockPackeroff);
        remoteControlStation.setCommand(2, naturalSunblockMoveron, naturalSunblockMoveroff);

        System.out.println(remoteControlStation);

        remoteControlStation.onButtonWasPushed(0);
        remoteControlStation.offButtonWasPushed(0);
        remoteControlStation.onButtonWasPushed(1);
        remoteControlStation.offButtonWasPushed(1);
        remoteControlStation.onButtonWasPushed(2);
        remoteControlStation.offButtonWasPushed(2);
    }
}