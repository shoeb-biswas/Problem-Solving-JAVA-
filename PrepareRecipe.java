public class Main {

    // Abstract class (Template)
    static abstract class Recipe {
        // Template method
        public final void prepareRecipe() {
            gatherIngredients();
            cook();
            serve();
        }

        protected abstract void gatherIngredients();
        protected abstract void cook();
        protected abstract void serve();
    }

    // Concrete class 1
    static class SoupRecipe extends Recipe {
        @Override
        protected void gatherIngredients() {
            System.out.println("Gathering ingredients for soup.");
        }

        @Override
        protected void cook() {
            System.out.println("Cooking the soup.");
        }

        @Override
        protected void serve() {
            System.out.println("Serving the soup.");
        }
    }

    // Concrete class 2
    static class DessertRecipe extends Recipe {
        @Override
        protected void gatherIngredients() {
            System.out.println("Gathering ingredients for dessert.");
        }

        @Override
        protected void cook() {
            System.out.println("Preparing the dessert.");
        }

        @Override
        protected void serve() {
            System.out.println("Serving the dessert.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Recipe soup = new SoupRecipe();
        soup.prepareRecipe();

        System.out.println();

        Recipe dessert = new DessertRecipe();
        dessert.prepareRecipe();
    }
}
