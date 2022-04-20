package extractors;

import java.time.LocalDate;

public class ConcreteExtractor extends IExtractor {
    String mock_return_data = "mock returned data";

    public String extract_data(String source_connection, LocalDate datetime) {
        String query = "select * from myschema.mytable_A where date = " + datetime;
        logr.info(query);
        logr.info("Extract completed from " + source_connection + ".myschema.mytable_A");
        return mock_return_data;
    }
}
