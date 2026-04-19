plugins {
  id("java")
  id("maven-publish")
}

group = "io.github.DanielUNA"
version = "0.12.0"

repositories {
  mavenCentral()
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
      from(components["java"])                // attach the Java artifact (jar)
      pom {
        name.set("DAdapterForNativeTTS")
        url.set("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
        scm {
          url.set("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
        }
      }
    }
  }
repositories {
    maven {
      name = "DAdapterForNativeTTS"
      url = uri("https://github.com/Daniel-UNA/DAdapterForNativeTTS")
      credentials {
        username = System.getenv("GITHUB_ACTOR")
        password = System.getenv("GITHUB_TOKEN")
      }
    }
  }
}
