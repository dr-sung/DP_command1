
/**
 * participant: ConcreteCommand
 */
public class CourseMealNormal implements Order {

    private Chef chef;

    public CourseMealNormal(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("----- Cooking: Course Meal Normal -----");
        chef.cookGrilledSteak();
    }

    @Override
    public void unexecute() {
        System.out.println("----- Canceling: Course Meal Normal -----");
        chef.uncookGrilledSteak();
    }
    
    @Override
    public String toString() {
        return "Course Meal Normal";
    }

}
