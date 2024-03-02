def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sonar.java.binaries=.    
         sonar.java.source=8
         sonar.sources=.
         sh 'mvn clean package sonar:sonar'
    }
}
