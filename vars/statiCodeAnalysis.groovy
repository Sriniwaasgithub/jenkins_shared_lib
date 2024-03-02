def call(SonarQubecredentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        sh 'mvn clean install'
        sh 'mvn sonar:sonar'
    }
}
