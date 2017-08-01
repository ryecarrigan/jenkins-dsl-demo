freeStyleJob('test-job') {
    scm {
        git 'https://github.com/rypcarr/jenkins-dsl-demo.git'
    }

    triggers {
        scm '* */15 * * *'
    }

    steps {
        maven 'clean test'
    }
}

