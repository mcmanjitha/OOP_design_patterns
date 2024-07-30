import commands.Command;
import commands.LightOffCommand;
import commands.LightOnCommand;
import receivers.Light;

public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        // Client setting the receiver
        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");

        // Concrete command
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommands(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommands(1, kitchenLightOn, kitchenLightOff);

        remoteControl.onButtonWasPushed(0);
    }
}

