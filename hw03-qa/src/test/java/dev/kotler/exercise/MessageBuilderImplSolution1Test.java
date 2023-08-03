package dev.kotler.exercise;

import org.jboss.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageBuilderImplSolution1Test {

    /*
    Классический вид заглушек
    Fake - упрощенная версия объекта оригинала.
    Dummy - объект болванка, не содержит логики и ничего не делает, возвращает дефолтные значения.
    Stub - заглушка для подмены зависимости тестируемого объекта с заданным поведением.
    Spy - как stub, запоминает состояние, какие методы вызывали с какими параметрами.
    Mock - как spy, сам проверяет на сколько реальное использование соответствует ожидаемому.

    Mockito заглушки
    Mock - заглушка, которой можно подменить полноценную зависимость класса при тестировании, либо не содержит
    никакой логики, либо содержит только то что необходимо.
    Spy - заглушка, которая содержит полноценную реализацию зависимости, для тестирования изменено поведение
    некоторых методов и позволяет следить за порядком/фактом вызова методов.
     */

    private MessageTemplateProvider provider;
    private MessageBuilder messageBuilder;

    @BeforeEach
    void setUp() {
//        throw new RuntimeException("Ooops...");
        System.out.println("@BeforeEach");
        provider = Mockito.mock(DefaultMessageTemplateProvider.class); // stub classic
        messageBuilder = new MessageBuilderImpl(provider);
    }

    @AfterEach
    void tearDown() {
        // AfterEach - выполняет в любом случае, например, для закрытия всех соединений после exception
        System.out.println("@AfterEach");
    }

    @Test
    void buildMessageTest() {
        System.out.println("@Test");

//        Mockito.when(provider.getMessageTemplate(Mockito.any()))
        Mockito.when(provider.getMessageTemplate("null"))
                .thenReturn(DefaultMessageTemplateProvider.DEFAULT_TEMPLATE);

        var expectedMessage = String.format(DefaultMessageTemplateProvider.DEFAULT_TEMPLATE, "text42", "Kotler");

        var actualMessage = messageBuilder.buildMessage(
                "null",
                "text42",
                "Kotler"
        );

        Logger log = Logger.getLogger(MessageBuilderImplSolution1Test.class);
        log.warn(actualMessage);

        assertEquals(expectedMessage, actualMessage);
    }
}