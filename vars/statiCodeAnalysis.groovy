def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sonar.java.binaries=bin
         sh 'mvn clean package sonar:sonar'
    }
}
