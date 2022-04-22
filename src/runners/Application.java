package runners;

import connectors.SourceDBConnector;
import extractors.ConcreteExtractor;
import factories.ConcreteFactoryA;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {

        String source_conn = "mock_source_connection";
        String target_conn;
        String data_to_load;
        LocalDate operation_date = LocalDate.now();

        Logger logr = Logger.getLogger(Logger.class.getName());
        logr.info("Starting ExtractTransformFactory");

//        LocalDate operation_timestamp = LocalDate.now();
//
//        SourceDBConnector source_conn_obj = new SourceDBConnector();
//        source_conn = source_conn_obj.connect_to_db();
//
//        ConcreteExtractor data_extractor = new ConcreteExtractor();
//        data_to_load = data_extractor.extract_data(source_conn, operation_timestamp);
//
//
//        TargetDBConnector target_conn_obj = new TargetDBConnector();
//        target_conn = target_conn_obj.connect_to_db();
//
//        ConcreteLoader data_loader = new ConcreteLoader();
//        data_loader.load_data(target_conn, data_to_load, operation_timestamp);

        ConcreteFactoryA fac = new ConcreteFactoryA();

        SourceDBConnector source_conn_obj;
        source_conn_obj = fac.get_source_db_object();
        source_conn_obj.connect_to_db();

        ConcreteExtractor extractor_obj;
        extractor_obj = fac.get_extractor_object();
        extractor_obj.extract_data(source_conn, operation_date);





    }

}
