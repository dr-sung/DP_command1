
/**
 * participant: ConcreteCommand
 */
public class CourseMealSupreme implements Order {

    private Chef chef;

    public CourseMealSupreme(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("----- Cooking: Course Meal Supreme -----");
        chef.cookAppetizer();
        chef.cookGourmetSoup();
        chef.cookGrilledSteak();
        chef.cookDesert();
    }

    @Override
    public void unexecute() {
        System.out.println("----- Canceling: Course Meal Supreme -----");
        chef.uncookAppetizer();
        chef.uncookGourmetSoup();
        chef.uncookGrilledSteak();
        chef.uncookDesert();
    }

    @Override
    public String toString() {
        return "Course Meal Supreme";
    }

}
