// Concrete class Tea
class Tea extends Beverages {
    @Override
    protected void startMaking() {
        System.out.println("Making tea...");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        // No additional condiments specified for tea
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding Lemon");
    }
}
