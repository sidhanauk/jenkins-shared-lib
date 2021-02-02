def call(Map pipelineParams){

pipeline{

  agent any

  stages{

  stage('checkout code'){
    steps{
      git branch: pipelineParams.branch, credentialsId: 'GitCredentials', url: pipelineParams.scmUrl
    }
  }
  

  stage('static code analysis'){
    steps{
      echo "sonar scan"
    }
  }
  
  
  stage('build code'){
    steps{
      sh "mvn clean package -DskipTests=true"
    }
  }
  
  stage('test code'){
    steps{
      sh "mvn test"
    }
  }

  stage('CI Server: deploy app'){
    steps{
      echo "CI server deploy"
    }
  }
  }
}
}
