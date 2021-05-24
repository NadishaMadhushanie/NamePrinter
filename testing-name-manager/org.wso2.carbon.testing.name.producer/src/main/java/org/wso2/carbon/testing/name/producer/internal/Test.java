package org.wso2.carbon.testing.name.producer.internal;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import java.util.logging.Logger;

@Component(
        name = "testing.name.producer",
        immediate = true
)

public class Test {
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    @Activate
    protected void activate(ComponentContext context) {
        LOGGER.info("***********************************************************************************************************************************");
        LOGGER.info("*****************************************************NADISHA MADHUSHANIE******************************************************************************");
        LOGGER.info("***********************************************************************************************************************************");
    }
}
