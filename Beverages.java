// Abstract class Beverages
abstract class Beverages {
    private boolean wantsExtras = false;

    // Method to set the boolean field wantsExtras
    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

    // Template method ensuring the correct order of method calls
    public final void finalTemplateMethod() {
        startMaking();
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    // Method to start making the beverage (can be overridden by subclasses)
    protected abstract void startMaking();

    // Method to boil water (can be overridden by subclasses)
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    // Abstract method to brew the beverage (to be implemented by subclasses)
    protected abstract void brew();

    // Method to pour beverage into a cup (can be overridden by subclasses)
    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract method to add condiments (to be implemented by subclasses)
    protected abstract void addCondiments();

    // Abstract method to add extras (to be implemented by subclasses)
    protected abstract void addExtras();
}
