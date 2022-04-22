package runners;

import connectors.SourceDBConnector;
import connectors.TargetDBConnector;
import extractors.ConcreteExtractor;
import factories.ConcreteFactoryA;
import factories.Factories_map;
import factories.IDataFactory;
import loaders.ConcreteLoader;

import java.time.LocalDate;
import java.util.Map;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {

        String source_conn = "mock_source_connection";
        String target_conn;
        String data_to_load;
        LocalDate operation_date = LocalDate.now();

        Logger logr = Logger.getLogger(Logger.class.getName());
        logr.info("Starting ExtractTransformFactory");

        Factories_map factories = new Factories_map();



        ConcreteFactoryA fac = new ConcreteFactoryA();

        SourceDBConnector source_conn_obj;
        source_conn_obj = fac.get_source_db_object();
        source_conn = source_conn_obj.connect_to_db();

        ConcreteExtractor extractor_obj;
        extractor_obj = fac.get_extractor_object();
        String extracted_data = extractor_obj.extract_data(source_conn, operation_date);

        TargetDBConnector target_conn_obj;
        target_conn_obj = fac.get_target_db_object();
        target_conn = target_conn_obj.connect_to_db();

        ConcreteLoader loader_obj;
        loader_obj = fac.get_loader_object();
        loader_obj.load_data(target_conn, extracted_data, operation_date);







    }

}
