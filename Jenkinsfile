pipeline {
    agent any
    tools {
        maven 'maven 3.6.3' // Ensure that the tool name matches the installation in Jenkins Global Tool Configuration.
    }
    stages {
        stage('Maven Build') {
            steps {
                // Checkout code from the Git repository.
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AjayShinde3KT/jenkins-pipeline-repo']])

                // Run the Maven build.
                script {
                    def mvnHome = tool name: 'maven 3.6.3', type: 'hudson.tasks.Maven$MavenInstallation'
                    def mvnCMD = "${mvnHome}/bin/mvn"
                    sh "${mvnCMD} clean install"
                }
            }
        }
    }
}
