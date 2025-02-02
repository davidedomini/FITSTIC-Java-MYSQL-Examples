plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("mysql:mysql-connector-java:8.0.33")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaExec>().forEach {
    it.args("-Djava.net.preferIPv4Stack=true")
}

tasks.register<JavaExec>("runStep00") {
    // Sostituisci con il percorso completo della classe main
    mainClass.set("fitstic.Step00.Main")

    // Configura il classpath
    classpath = sourceSets["main"].runtimeClasspath
}
