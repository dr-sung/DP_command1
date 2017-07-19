/**
 *   participant: Client (The restaurant in operation)
 */
public class Main {
    
    public static void main(String[] args) {
        
        // the operation of the restarant: configuration
        
        Chef threeStarChef = new Chef();
        BarTender john = new BarTender();
        
        Order sosoOrder = new CourseMealNormal(threeStarChef);
        Order ripoffOrder = new CourseMealSupreme(threeStarChef);
        Order cocktail = new Cocktail(john);
        
        Waiter internWaiter = new Waiter();
        
        // the restaurant in operation
        
        internWaiter.takeOrder(sosoOrder);
        internWaiter.takeOrder(sosoOrder);
        internWaiter.takeOrder(ripoffOrder);
        internWaiter.takeOrder(cocktail);
        
        internWaiter.placeOrder();
        internWaiter.placeOrder();
        internWaiter.cancelOrder(ripoffOrder);
        
        internWaiter.takeOrder(ripoffOrder);
        internWaiter.placeOrder();
        internWaiter.cancelOrder(ripoffOrder);
        internWaiter.placeOrder();
        
    }
    
}
