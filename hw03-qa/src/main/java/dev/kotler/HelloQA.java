package dev.kotler;

import dev.kotler.exercise.DefaultMessageTemplateProvider;
import dev.kotler.exercise.MessageBuilderImpl;
import org.jboss.logging.Logger;

public class HelloQA {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HelloQA.class);
        var template = new DefaultMessageTemplateProvider();
        var messageBuilder = new MessageBuilderImpl(template);
        var message = messageBuilder.buildMessage(null, "text42", "Kotler");
        logger.info(message);
    }
}
