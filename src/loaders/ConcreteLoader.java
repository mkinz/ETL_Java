package loaders;

import java.time.LocalDate;

public class ConcreteLoader extends  ILoader {

    public String load_data(String target_connection, String data_to_load, LocalDate datetime) {
        String query = "update myschema.mytable_A set data = '" + data_to_load + "' where date = " + datetime;
        logr.info(query);
        logr.info("Load completed to " + target_connection + ".myschema.mytable_A");
        return mock_return_data;
    }
}
