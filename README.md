Instructions for reproducing:
----------------------------

1. Run `./gradlew string-deps:dependencyInsight --configuration runtimeClasspath --dependency wire-bom`
   Observe that wire-bom is forced to version 4.9.2 because of the enforcedPlatform dependency in `string-deps/build.gradle.kts`

2. Run `./gradlew version-catalog-default:dependencyInsight --configuration runtimeClasspath --dependency wire-bom`
   Observe that wire-bom is NOT forced to version 4.9.2, but instead version 4.9.3 gets selected via the transitive dependency graph, DESPITE the enforcedPlatform in `version-catalog-default/build.gradle.kts`

3. Run `./gradlew version-catalog-eager:dependencyInsight --configuration runtimeClasspath --dependency wire-bom`
   Observe that wire-bom is again forced to version 4.9.2, presumably because we are eagerly evaluating the version catalog entry using `.get()` in `version-catalog-eager/build.gradle.kts`
