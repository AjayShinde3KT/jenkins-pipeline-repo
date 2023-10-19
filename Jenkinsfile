pipeline {
    agent any
    tools {
        maven 'maven 3.6.3'
    }
    stages {
        stage('Maven Build') {
            steps{
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AjayShinde3KT/jenkins-pipeline-repo']])
               sh 'mvn clean install'
            }
        }
    }
}