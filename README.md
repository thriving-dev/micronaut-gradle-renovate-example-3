# micronaut-gradle-renovate-example-3

[![Use this template](https://img.shields.io/badge/from-java--library--template-brightgreen?logo=dropbox)](https://github.com/thriving-dev/java-library-template/generate)
[![Java CI](https://github.com/thriving-dev/micronaut-gradle-renovate-example-3/actions/workflows/1.pipeline.yml/badge.svg)](https://github.com/thriving-dev/micronaut-gradle-renovate-example-3/actions/workflows/1.pipeline.yml)
[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg)](CODE_OF_CONDUCT.md)

Micronaut gradle project with automated dependency updates by renovate that _actually_ updates the micronaut runtime used.

TLDR: Projects created via [Micronaut Launch](https://micronaut.io/launch) define the micronaut version to be used in the `gradle.properties` file which is not discoverable by renovate.
Further, switching from the properties file to [version catalog](https://docs.gradle.org/current/userguide/platforms.html#sub:central-declaration-of-dependencies) the version also is not discoverable/resolvable by renovate.


## References
- [Micronaut Gradle Plugin](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/index.html)

## Credits
- Created by https://github.com/thriving-dev/java-library-template
