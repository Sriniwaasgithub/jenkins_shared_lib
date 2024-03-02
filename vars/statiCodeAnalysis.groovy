def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn clean install -DskipTests=true'
        sh 'mvn sonar:sonar'
    }
}
