package connectors;

public class SourceDBConnector extends IDBConnector {

    String dbname = "my_source_db";
    String username = "my_user";
    String connection_string = "my_source_connection_string";

    public String connect_to_db() {
        logr.info("Connected to source database " + dbname + "with username " + username + " and connection info: " + connection_string );
        return dbname;
    }



}
