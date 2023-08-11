import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow")
}

dependencies {
    implementation("org.jboss.logging:jboss-logging")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.mockito:mockito-junit-jupiter")
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("hw04-collections")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        mergeServiceFiles()
        manifest {
            attributes(mapOf("Main-Class" to "dev.kotler.catpack.MainCatMap"))
        }
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}

// Project with path ':hw01-gradle-api' could not be found in project ':hw01-gradle-api-use'.
tasks.register("prepareKotlinBuildScriptModel") {}