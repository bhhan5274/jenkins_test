node {
    def commit_id

    stage('preparation'){
        checkout scm
        sh "git rev-parse --short HEAD > .git/commit-id"
        commit_id = readFile('.git/commit-id').trim()
    }

    stage('test'){
        withMaven(maven: 'M3') {
            sh 'mvn clean package'
        }
    }

    stage('docker build/push'){
        docker.withRegistry('https://index.docker.io/v1/', 'dockerhub'){
            def app = docker.build("bhhan87/jenkins-test:${commit_id}", '.').push()
        }
    }
}