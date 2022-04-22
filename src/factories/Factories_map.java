package factories;
import connectors.IDBConnector;
import extractors.IExtractor;
import loaders.ILoader;

import java.util.HashMap;
import java.util.Map;

public class Factories_map {
    public static void main(String[] args) {

        IExtractor extractor_object;
        IDBConnector source_connector_object;
        IDBConnector target_connector_object;
        ILoader loader_object;


        HashMap<String, IDataFactory> factories = new HashMap<>();
        factories.put("A", new ConcreteFactoryA());
        factories.put("B", new ConcreteFactoryB());
        factories.put("C", new ConcreteFactoryC());


        for(IDataFactory factory: factories.values())
            extractor_object = factory.get_extractor_object();

        for(IDataFactory factory: factories.values())
            loader_object = factory.get_loader_object();

        for(IDataFactory factory: factories.values())
            source_connector_object = factory.get_source_db_object();

        for(IDataFactory factory: factories.values())
            target_connector_object = factory.get_target_db_object();



    }
}
