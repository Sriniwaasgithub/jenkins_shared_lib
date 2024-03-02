def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        mvn clean install -DskipTests=true
        mvn sonar:sonar
    }
}
