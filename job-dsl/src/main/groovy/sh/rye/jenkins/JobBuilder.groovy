package sh.rye.jenkins

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.jobs.FreeStyleJob

class JobBuilder {

    private FreeStyleJob job

    JobBuilder(DslFactory factory, String name) {
        this.job = factory.freeStyleJob(name)
    }

    def addMavenStep(String goal) {
        this.job.steps {
            maven goal
        }
    }

    def setRepo(String repoUrl, String cronString = '') {
        this.job.with {
            scm {
                git repoUrl
            }

            triggers {
                scm cronString
            }
        }
    }

}
