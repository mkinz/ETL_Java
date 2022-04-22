package factories;

import connectors.SourceDBConnector;
import connectors.TargetDBConnector;
import extractors.ConcreteExtractor;
import loaders.ConcreteLoader;

public class ConcreteFactoryB extends IDataFactory {
    public SourceDBConnector get_source_db_object(){
        return new SourceDBConnector();
    }
    public TargetDBConnector get_target_db_object(){
        return new TargetDBConnector();
    }
    public ConcreteExtractor get_extractor_object(){
        return new ConcreteExtractor();
    }
    public ConcreteLoader get_loader_object(){
        return new ConcreteLoader();
    }
}
