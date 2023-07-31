package dev.kotler;

import org.jboss.logging.Logger;

public class HelloGradleWithApi {

    static Logger log = Logger.getLogger(HelloGradleWithApi.class);

    public static void main(String[] args) {
        log.info("Hello from Gradle!");
    }

    public static void say() {
        log.info("Hello from Api!");
    }
}
