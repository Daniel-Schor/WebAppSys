package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pleaseDrill")
public class Drilling implements Work{
    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);

    public void doWork() {
        LOGGER.info(" --> drill a hole into the wall");
    }
}
