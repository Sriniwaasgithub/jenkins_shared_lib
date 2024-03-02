

def call(credentialsId){

waitForQualityGate abortPipeline: true, credentialsId: credentialsId

}


