public abstract class CaffeinBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Water boiling");
    }
    void pourInCup(){
        System.out.println("pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
