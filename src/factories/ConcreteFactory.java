package factories;

import connectors.IDBConnector;
import connectors.SourceDBConnector;
import connectors.TargetDBConnector;
import extractors.ConcreteExtractor;
import extractors.IExtractor;
import loaders.ConcreteLoader;
import loaders.ILoader;

public class ConcreteFactory extends IDataFactory {
    public IDBConnector get_source_db_object(){
        return new SourceDBConnector();
    }
    public IDBConnector get_target_db_object(){
        return new TargetDBConnector();
    }
    public IExtractor get_extractor_object(){
        return new ConcreteExtractor();
    }
    public ILoader get_loader_object(){
        return new ConcreteLoader();
    }
}
