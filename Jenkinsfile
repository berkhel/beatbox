node {


  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    environment{
      TOKEN = credentials('pippo-sonar')  
    }
    withSonarQubeEnv() {
      sh "./gradlew sonar -Dsonar.token=${TOKEN}"
    }
  }
}
