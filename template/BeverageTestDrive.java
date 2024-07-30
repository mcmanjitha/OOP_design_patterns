public class BeverageTestDrive {
    public static void main(String[] args){
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("Preparing tea");
        teaHook.prepareRecipe();

        System.out.println("Preparing coffee");
        coffeeHook.prepareRecipe();

    }
}
