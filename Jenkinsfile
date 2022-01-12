pipeline {
    agent any

    stages {
        stage('Parallel Execution') {
            steps {
                parallel(
                    a: {
                        bat "mvn clean"
                    },
                    b: {
                        bat "mvn test"
                    },
                    c: {
                        bat "mvn package"
                    }
                )   
            }
        }
        stage('Consolidate Results'){
            steps{
                input("Do you want to capture results?")
                junit'**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
        stage('Email Build Status') {
            steps {
                mail bcc: '', body: 'Sample Body', cc: '', from: '', replyTo: '', subject: 'Sample Subject', to: 'kalraishaan16@gmail.com'
            }
        }
    }
}
