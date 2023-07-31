import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id ("com.github.johnrengelman.shadow")
}

dependencies {
    implementation("org.jboss.logging:jboss-logging")
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("hello")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        mergeServiceFiles()
        manifest {
            attributes(mapOf("Main-Class" to "dev.kotler.HelloGradle"))
        }
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}