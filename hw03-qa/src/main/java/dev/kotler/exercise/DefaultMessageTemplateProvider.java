package dev.kotler.exercise;

public class DefaultMessageTemplateProvider implements MessageTemplateProvider {

    public static String DEFAULT_TEMPLATE = "Hi!\n %s \n With best regards, %s";

    @Override
    public String getMessageTemplate(String templateName) {
//        return DEFAULT_TEMPLATE == null? DEFAULT_TEMPLATE : templateName;
        return DEFAULT_TEMPLATE;
    }
}
