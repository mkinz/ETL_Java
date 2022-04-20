package factories;

import connectors.IDBConnector;
import extractors.IExtractor;
import loaders.ILoader;

public abstract class IDataFactory {

    abstract IDBConnector get_source_db_object();
    abstract IDBConnector get_target_db_object();
    abstract IExtractor get_extractor_object();
    abstract ILoader get_loader_object();

}
