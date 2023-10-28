pipeline {
    agent any
    stages {
        stage ('GetProject') {
            steps {
                git 'https://github.com/NiamhC503/Springboot.git'
            }
        }
        stage ('build') {
            steps {
                sh 'mvn clean:clean'
                sh 'mvn dependency:copy-dependencies'
                sh 'mvn compiler:compile'
            }
        }
        stage ('Exec') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
    }
}