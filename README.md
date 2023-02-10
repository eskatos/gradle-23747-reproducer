Issue reproducer for

* https://github.com/gradle/gradle/issues/23747

Workaround:

In `included-plugins/src/main/kotlin/my-plugin.gradle.kts` register the `GradleBuild` task lazily.

