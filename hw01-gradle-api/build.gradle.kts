import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id ("java-library")
    id ("com.github.johnrengelman.shadow")
}

dependencies {
    implementation("org.jboss.logging:jboss-logging")
}

//tasks {
//    named<ShadowJar>("shadowJar") {
//        archiveBaseName.set("hw01-gradle-api")
//        archiveVersion.set("0.1")
//        archiveClassifier.set("")
//        mergeServiceFiles()
//        manifest {
//            attributes(mapOf("Main-Class" to "dev.kotler.HelloGradleWithApi"))
//        }
//    }
//}
//
//tasks {
//    build {
//        dependsOn(shadowJar)
//    }
//}