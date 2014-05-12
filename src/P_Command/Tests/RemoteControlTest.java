package P_Command.Tests;


import P_Command.Comands.*;
import P_Command.Devices.*;
import P_Command.Remotes.*;


public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        CellingFan cellingFan = new CellingFan("living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        Command[] partyOn = {livingRoomLightOn, cellingFanHighCommand};
        Command[] partyOFF = {livingRoomLightOff, cellingFanOffCommand};

        MacroCommand macroOn = new MacroCommand(partyOn);
        MacroCommand macroOff = new MacroCommand(partyOFF);

        remoteControl.setOnCommand(0, macroOn, macroOff);
        System.out.println(remoteControl);
        System.out.println("---macroOn---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---macroOFF---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("---macroUndo---");
        remoteControl.undoButtonWasPushed();


    }
}
