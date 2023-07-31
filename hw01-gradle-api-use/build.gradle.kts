import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id ("com.github.johnrengelman.shadow")
}

dependencies {
    implementation(project(":hw01-gradle-api"))
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("hw01-gradle-api-use")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        mergeServiceFiles()
        manifest {
            attributes(mapOf("Main-Class" to "dev.kotler.HelloGradleWithApiUse"))
        }
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}

// Project with path ':hw01-gradle-api' could not be found in project ':hw01-gradle-api-use'.
tasks.register("prepareKotlinBuildScriptModel"){}