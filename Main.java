public class Main {
    public static void main(String[] args) {
        // Create light instances
        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        // Create command instances
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command kitchenLightDim50 = new LightDimCommand(kitchenLight, 50);
        Command kitchenLightDim100 = new LightDimCommand(kitchenLight, 100);

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightDim36 = new LightDimCommand(livingRoomLight, 30);
        Command livingRoomLightDim100 = new LightDimCommand(livingRoomLight, 100);

        // Create a remote control
        RemoteControl remote = new RemoteControl(4);

        // Set commands
        remote.setCommand(0, kitchenLightOn);
        remote.setCommand(1, kitchenLightOff);
        remote.setCommand(2, kitchenLightDim50);
        remote.setCommand(3, kitchenLightDim100);

        // Test kitchen light commands
        remote.pressButton(0); // ON
        remote.pressButton(1); // OFF
        remote.pressButton(0); // ON
        remote.pressButton(2); // DIM 50
        remote.pressUndo();    // Undo DIM 50
        remote.pressButton(3); // DIM 100

        // Set commands for living room
        remote.setCommand(0, livingRoomLightOn);
        remote.setCommand(1, livingRoomLightOff);
        remote.setCommand(2, livingRoomLightDim36);
        remote.setCommand(3, livingRoomLightDim100);

        // Test living room light commands
        remote.pressButton(0); // ON
        remote.pressButton(1); // OFF
        remote.pressButton(0); // ON
        remote.pressButton(2); // DIM 36
        remote.pressUndo();    // Undo DIM 36
        remote.pressButton(3); // DIM 100
    }
}
