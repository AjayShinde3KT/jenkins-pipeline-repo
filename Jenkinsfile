pipeline {
    agent any
    tools {
        maven 'maven 3.6.3'
    }
    stages {
        stage('Maven Build') {
            steps{
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'd5a43a8f-242a-46c0-9711-001329084809', url: 'https://github.com/AjayShinde3KT/jenkins-pipeline-repo']])
               sh 'mvn clean install'
            }
        }
    }
}