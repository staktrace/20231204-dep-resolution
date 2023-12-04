rootProject.name = "version-catalog"

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
  }
}

include("lib")
include("string-deps")
include("version-catalog-default")
include("version-catalog-eager")
