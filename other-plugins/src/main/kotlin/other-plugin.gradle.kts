
// change this to `register` instead and it works
tasks.register<GradleBuild>("mytask") {
    startParameter = project.gradle.startParameter.newInstance()
}

