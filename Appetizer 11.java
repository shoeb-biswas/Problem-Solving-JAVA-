public class Appetizer {
    public void prepare() {
        System.out.println("Appetizer is being prepared.");
    }

    public void serve() {
        System.out.println("Appetizer is served.");
    }
}

public class Drinks {
    public void prepare() {
        System.out.println("Drinks are being prepared.");
    }

    public void serve() {
        System.out.println("Drinks are served.");
    }
}

public class MainCourse {
    public void prepare() {
        System.out.println("Main course is being prepared.");
    }

    public void serve() {
        System.out.println("Main course is served.");
    }
}

public class RestaurantFacade {
    private MainCourse mainCourse;
    private Drinks drinks;
    private Appetizer appetizer;

    public RestaurantFacade() {
        this.mainCourse = new MainCourse();
        this.drinks = new Drinks();
        this.appetizer = new Appetizer();
    }

    public void serveMeal() {
        System.out.println("Serving the meal...");
        appetizer.prepare();
        mainCourse.prepare();
        drinks.prepare();
        
        appetizer.serve();
        mainCourse.serve();
        drinks.serve();
        System.out.println("Meal served successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();
        restaurant.serveMeal();
    }
}
