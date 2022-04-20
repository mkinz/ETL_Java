package connectors;

import java.util.logging.Logger;

public abstract class IDBConnector {

    protected final Logger logr = Logger.getLogger(Logger.class.getName());

    abstract String connect_to_db();
}
