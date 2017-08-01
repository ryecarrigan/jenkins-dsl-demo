import sh.rye.jenkins.JobBuilder

def repo = 'https://github.com/rypcarr/jenkins-dsl-demo.git'

def job1 = new JobBuilder(this, 'one')
job1.setRepo(repo, '* */15 * * *')
job1.addMavenStep('clean test')

for (name in ['two', 'three', 'four']) {
    def job = new JobBuilder(this, name)
    job.setRepo(repo)
    job.addMavenStep('clean test')
}
