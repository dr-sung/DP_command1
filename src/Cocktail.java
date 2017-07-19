
/**
 * participant: ConcreteCommand
 */
public class Cocktail implements Order {

    private BarTender barTender;

    public Cocktail(BarTender barTender) {
        this.barTender = barTender;
    }

    @Override
    public void execute() {
        System.out.println("----- Making: Cocktail -----");
        barTender.makeCocktail();
    }

    @Override
    public void unexecute() {
        System.out.println("----- Canceling: Cocktail -----");
        barTender.unmakeCocktail();
    }
    
    @Override
    public String toString() {
        return "Cocktail";
    }

}
