package dev.kotler.exercise;

public class MessageBuilderImpl implements MessageBuilder {

    private final MessageTemplateProvider messageTemplateProvider;

    public MessageBuilderImpl(MessageTemplateProvider messageTemplateProvider) {
        this.messageTemplateProvider = messageTemplateProvider;
    }

    @Override
    public String buildMessage(String templateName, String text, String signature) {

        if (templateName == null || templateName.isEmpty()) {
//            String methodName = this.getClass().getEnclosingMethod().getName();
            throw new TemplateNotFoundException("Передан пустой templateName");
        }

        // buildMessageSolution2Test_A
        String messageTemplate = messageTemplateProvider.getMessageTemplate(templateName);
        if (messageTemplate == null || messageTemplate.isEmpty()) {
//            var error = "Error: ".formatted(text, signature);
            throw new TemplateNotFoundException();
        }
        return messageTemplate.formatted(text, signature);

        // buildMessageSolution2Test_B()
//        return "Hi!\n %s \n With best regards, %s".formatted(text, signature);
    }
}
