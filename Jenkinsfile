node {


  stage('SCM') {
    checkout scm
  }
  stage('Build'){
    sh "./gradlew build"
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      sh "./gradlew sonar -Dsonar.token=${SONAR_TOKEN}"
    }
  }
}
