def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        sonar.sources=src/main/java
        sonar.java.binaries=target/classes
        sh 'mvn clean package sonar:sonar'
    }
}
