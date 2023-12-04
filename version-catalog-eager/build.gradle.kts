plugins {
    id("org.jetbrains.kotlin.jvm").version("1.9.21")
}

dependencies {
    implementation(project(":lib"))
    implementation(enforcedPlatform(libs.wireBom.get()))
}
