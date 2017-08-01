freeStyleJob('test-job') {
    scm {
        git 'git@github.com:rypcarr/jenkins-dsl-demo.git'
    }

    triggers {
        scm '* */15 * * *'
    }

    steps {
        maven 'clean test'
    }
}

