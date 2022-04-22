package factories;
import java.util.HashMap;

public class factories_map {
    public static void main(String[] args) {


        HashMap<String, IDataFactory> factories = new HashMap<>();
        factories.put("A", new ConcreteFactoryA());
        factories.put("B", new ConcreteFactoryB());
        factories.put("C", new ConcreteFactoryC());






    }
}
