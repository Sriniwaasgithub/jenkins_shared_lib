def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh 'mvn clean package'
         sh 'mvn sonar:sonar'
    }
}
