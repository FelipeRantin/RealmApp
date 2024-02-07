buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath ("io.realm:realm-gradle-plugin:10.11.1")
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
}