pipeline {
    agent any

    stages {
        stage('Compilation') {
            steps {
                echo 'Compiling..!!'
                bat """ JenkinsTut.java """
            }
        }
     
        stage('Running') {
            steps {
                echo 'Running..!!'
                bat """ java Jenkins """
            }
        }
    }
}
