package dev.kotler.exercise;

import org.jboss.logging.Logger;

public class TemplateNotFoundException extends RuntimeException {

    Logger logger = Logger.getLogger(TemplateNotFoundException.class);

    public TemplateNotFoundException() {
    }

    public TemplateNotFoundException(Class<MessageBuilderImpl> clazz, String error) {
        logger.error(error);
    }

    public TemplateNotFoundException(String methodName, String message) {
        logger.error(methodName + " -> " + message);
    }

    public TemplateNotFoundException(String message) {
        super(message);
    }
}
