def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        sh sonar.sources=src/main/java
        sh sonar.java.binaries=target/classes
        sh 'mvn clean package sonar:sonar'
    }
}
