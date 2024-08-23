// LightDimCommand.java
public class LightDimCommand implements Command {
    private Light light;
    private int previousLevel;
    private int newLevel;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.newLevel = level;
    }

    @Override
    public void execute() {
        previousLevel = getCurrentBrightness();
        light.dim(newLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }

    private int getCurrentBrightness() {
        // This method is a simplification. In a real application, this would be more complex.
        return newLevel; // Just for demonstration purposes
    }
}
