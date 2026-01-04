# LLD
- LLD requires you to analyze real-world problems and break them down into object-world problems using OOP concepts.
#### Implementing SOLID Principles 
https://www.geeksforgeeks.org/system-design/solid-principle-in-programming-understand-with-real-life-examples/
These are sets of 5 principles(rules) that are strictly followed as per requirements of the system or requirements for optimal designing. In order to write scalable, flexible, maintainable, and reusable code:

a- Single-responsibility principle (SRP) - A class should have only one reason to change" ex baker who is responsible for baking bread. 
class BreadBaker {
    public void bakeBread() {
        System.out.println("Baking high-quality bread...");
    }
}

b- Open-closed principle (OCP) - "Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification
abstract class PaymentProcessor {
    public abstract void processPayment(double amount); // Pure virtual function
}
class CreditCardPaymentProcessor extends PaymentProcessor // extending the functionality
class PayPalPaymentProcessor extends PaymentProcessor


c- Liskov’s Substitution Principle(LSP)- LSP ensures subclasses do not break parent class behavior.
Violating parent class behavious
class Calculator {
    int square(int x) {
        return x * x;
    }
}

class BrokenCalculator extends Calculator {
    @Override
    int square(int x) {
        return -1; // wrong behavior
    }
}
Fix violations using: interfaces
class Bird {
    void fly() { System.out.println("Bird is flying"); }
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
} 
Replacing Bird with Penguin will break the program.
interface Bird {}

interface Flyable {
    void fly();
}

class Sparrow implements Bird, Flyable {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Penguin implements Bird {
    // Penguin does not implement Flyable — correct design
}


d- Interface Segregation Principle (ISP)- first principle that applies to Interfaces instead of classes in SOLID. It states that "do not force any client to implement an interface which is irrelevant to them. You should prefer many client interfaces rather than one general interface and each interface should have a specific responsibility. you should have a menu card which includes only vegetarian items, not everything which you don't eat in your food. Here the menu should be different for different types of customers.
interface IVegetarianMenu {
    List<String> getVegetarianItems();
}
class VegetarianMenu implements IVegetarianMenu {
    public List<String> getVegetarianItems() {
        return Arrays.asList("Vegetable Curry", "Paneer Tikka", "Salad");
    }
}
Similarly
class DrinkMenu implements IDrinkMenu {}
class MenuDisplay {
    public static void displayVegetarianMenu(IVegetarianMenu menu) {
        System.out.println("Vegetarian Menu:");
        for (String item : menu.getVegetarianItems()) {
            System.out.println("- " + item);
        }
    }

    // Function to display menu items for a non-vegetarian customer
    public static void displayNonVegetarianMenu(INonVegetarianMenu menu) {
        System.out.println("Non-Vegetarian Menu:");
        for (String item : menu.getNonVegetarianItems()) {
            System.out.println("- " + item);
        }
    }
}
VegetarianMenu vegMenu = new VegetarianMenu();
MenuDisplay.displayVegetarianMenu(vegMenu);


e- Dependency Inversion Principle (DIP) - the DIP suggests that classes should rely on abstractions (e.g., interfaces or abstract classes) rather than concrete implementations.
interface IVersionControl { t serves as an abstraction that decouples high-level code from low-level implementations.
    void commit(String message);
    void push();
    void pull();
}

A type of GIT version control-  This class implements the IVersionControl interface, providing specific functionality for managing version control using Git.
class GitVersionControl implements IVersionControl {
    @Override
    public void commit(String message) {
        System.out.println("Committing changes to Git with message: " + message);
    }
}
class DevelopmentTeam { 
    This class relies on the IVersionControl interface, meaning it can work with any version control 
    private IVersionControl versionControl;

    public DevelopmentTeam(IVersionControl vc) {
        this.versionControl = vc;
    }

    public void makeCommit(String message) {
        versionControl.commit(message);
    }
}
GitVersionControl git = new GitVersionControl();
DevelopmentTeam team = new DevelopmentTeam(git);
team.makeCommit("Initial commit");


#### LLD Syntaxes useful
List<Spot> spots = new ArrayList<>(); spots.add(new Spot()); spots.get(0);
Map<String, Ticket> activeTickets = new HashMap<>(); activeTickets.put(ticket.getId(), ticket); Ticket t = activeTickets.get(id); activeTickets.remove(id);
Set<Integer> availableSpots = new HashSet<>(); availableSpots.add(5); availableSpots.remove(5);
if (availableSpots.contains(5)) {
    // do something
} availableSpots.isEmpty(); availableSpots.size();
for (Map.Entry<String, Integer> m : mp.entrySet()) {
    System.out.println(m.getKey());
    System.out.println(m.getValue());
}
Piece [][] = new Piece[size][size] //dynamic array
List<Pair<Integer,Integer>> l = new ArrayList<>();
Pair<Integer,Integer> p = new Pair<>(i,j);
Deque<Player> dq= new LinkedList<>(); addFirst addLast removeFirst