pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Wojs0819/CI-CDpractice.git'
            }
        }
        stage('Build') {
            steps {
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run --rm bye-world-java'
            }
        }
        stage('production') {
            steps {
                sh 'docker run --rm bye-world-java'
            }
        }
    }
}