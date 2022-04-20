package runners;

import connectors.SourceDBConnector;
import connectors.TargetDBConnector;
import extractors.ConcreteExtractor;
import loaders.ConcreteLoader;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {

        String source_conn;
        String target_conn;
        String data_to_load;

        Logger logr = Logger.getLogger(Logger.class.getName());
        logr.info("Starting ExtractTransformFactory");

        LocalDate operation_timestamp = LocalDate.now();

        SourceDBConnector source_conn_obj = new SourceDBConnector();
        source_conn = source_conn_obj.connect_to_db();

        ConcreteExtractor data_extractor = new ConcreteExtractor();
        data_to_load = data_extractor.extract_data(source_conn, operation_timestamp);


        TargetDBConnector target_conn_obj = new TargetDBConnector();
        target_conn = target_conn_obj.connect_to_db();

        ConcreteLoader data_loader = new ConcreteLoader();
        data_loader.load_data(target_conn, data_to_load, operation_timestamp);




    }
}
