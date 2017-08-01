import sh.rye.jenkins.JobBuilder

def job1 = new JobBuilder(this, 'one')
job1.setRepo('git@github.com:rypcarr/jenkins-dsl-demo.git', '* */15 * * *')
job1.addMavenStep('clean test')

for (name in ['two', 'three', 'four']) {
    def job = new JobBuilder(this, name)
    job.setRepo('git@github.com:rypcarr/jenkins-dsl-demo.git')
    job.addMavenStep('clean test')
}
