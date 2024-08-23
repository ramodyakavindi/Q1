// Concrete class Coffee
class Coffee extends Beverages {
    @Override
    protected void startMaking() {
        System.out.println("Making coffee...");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding vanilla syrup");
    }
}
