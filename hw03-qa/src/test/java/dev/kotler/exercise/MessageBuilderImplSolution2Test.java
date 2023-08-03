package dev.kotler.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static dev.kotler.exercise.DefaultMessageTemplateProvider.DEFAULT_TEMPLATE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageBuilderImplSolution2Test {

    private MessageTemplateProvider provider;
    private MessageBuilder messageBuilder;

    @BeforeEach
    void setUp() {
        provider = Mockito.mock(DefaultMessageTemplateProvider.class);
        messageBuilder = new MessageBuilderImpl(provider);
    }

    @Test
    void buildMessageSolution2Test_A() {

        Mockito.when(provider.getMessageTemplate("null"))
                .thenReturn(DEFAULT_TEMPLATE);

        var expectedMessage = String.format(DEFAULT_TEMPLATE, "text42", "Kotler");

        var actualMessage = messageBuilder.buildMessage(
                "null",
                "text42",
                "Kotler"
        );

//        Logger log = Logger.getLogger(MessageBuilderImplSolution2Test.class);
//        log.debug(actualMessage);
//
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void buildMessageSolution2Test_B() {

        Mockito.when(provider.getMessageTemplate(DEFAULT_TEMPLATE))
                .thenReturn(DEFAULT_TEMPLATE);

        var expectedMessage = String.format(DEFAULT_TEMPLATE, "text42", "Kotler");

        var actualMessage = messageBuilder.buildMessage(
                DEFAULT_TEMPLATE,
                "text42",
                "Kotler"
        );

//        Logger log = Logger.getLogger(MessageBuilderImplSolution2Test.class);
//        log.debug(actualMessage);
//
        assertEquals(expectedMessage, actualMessage);

        // Проверить, что провайдер был вызван один раз (хотя бы один раз) с параметром DEFAULT_TEMPLATE
        Mockito.verify(provider, Mockito.times(1)).getMessageTemplate(DEFAULT_TEMPLATE);
    }

    @Test
    @DisplayName("Проверка на обработку исключений")
    void buildMessageSolution2Test_C() {

        Mockito.when(provider.getMessageTemplate(DEFAULT_TEMPLATE))
                .thenReturn(DEFAULT_TEMPLATE);

        Assertions.assertThrows(TemplateNotFoundException.class,
                () -> messageBuilder.buildMessage("null", "text42", "Kotler"), "Ooops..."
        );

        Assertions.assertDoesNotThrow(
                () -> messageBuilder.buildMessage(DEFAULT_TEMPLATE, "text42", "Kotler"), "Ooops..."
        );
    }
}