package dev.kotler.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import static dev.kotler.exercise.DefaultMessageTemplateProvider.DEFAULT_TEMPLATE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("Тест с использованием BDDMockito")
class MessageBuilderImplSolution3Test {

    MessageTemplateProvider provider;
    MessageBuilder messageBuilder;

    @BeforeEach
    void setUp() {
        provider = BDDMockito.mock(DefaultMessageTemplateProvider.class);
        messageBuilder = new MessageBuilderImpl(provider);
    }

    @Test
    @DisplayName("Создание сообщения подписи с использованием шаблона")
    void createMessageWithSignFromTemplate() {
        BDDMockito.given(provider.getMessageTemplate(Mockito.any()))
                .willReturn(DEFAULT_TEMPLATE);

        var expectedMessage = String.format(
                DEFAULT_TEMPLATE, "text42", "Kotler"
        );

        var actualMessage = messageBuilder.buildMessage(
                "null", "text42", "Kotler"
        );

        assertThat(actualMessage).isEqualTo(expectedMessage);
    }

    @Test
    @DisplayName("Обработка исключений")
    void exceptionHandling() {
        BDDMockito.given(provider.getMessageTemplate(BDDMockito.any()))
                .willReturn(DEFAULT_TEMPLATE);

        assertThatThrownBy(() -> messageBuilder
                        .buildMessage(null, null, null),
                "Тайтл сообщения об ошибке"
        )
                .isInstanceOf(TemplateNotFoundException.class)
                .hasMessage("Передан пустой templateName");
    }
}