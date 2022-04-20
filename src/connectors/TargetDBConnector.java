package connectors;

public class TargetDBConnector extends  IDBConnector {

    String dbname = "my_target_db";
    String username = "my_user";
    String connection_string = "my_target_connection_string";

     public String connect_to_db() {
        logr.info("Connected to target database " + dbname + "with username " + username + " and connection info: " + connection_string );
        return dbname;
    }



}
