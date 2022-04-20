package extractors;

import java.time.LocalDate;
import java.util.logging.Logger;

public abstract class IExtractor {
        protected final Logger logr = Logger.getLogger(Logger.class.getName());

        abstract String extract_data(String source_connection, LocalDate extraction_date);

}
