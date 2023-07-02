package progremmer_beginner.belajar_java_logging;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFormatTest {

    private static final Logger log= LoggerFactory.getLogger(LogFormatTest.class);

    @Test
    void logFormatTest(){

        log.info("without parameter");
        log.info("{}+{}={}",10,10,(10+10));
        log.error("ups",new NullPointerException());
    }


}
