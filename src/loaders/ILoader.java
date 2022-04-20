package loaders;

import java.time.LocalDate;
import java.util.logging.Logger;

public abstract class ILoader {

    protected final Logger logr = Logger.getLogger(Logger.class.getName());

    String mock_return_data = "mock returned data";

    abstract String load_data(String target_connection, String data_to_load, LocalDate datetime);

}
