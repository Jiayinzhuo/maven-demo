pipeline {
    agent any
    tools { 
        maven 'Maven 3.6.0' 
    }    
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }


}
