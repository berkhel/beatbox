node {

  environment {
    SONAR_TOKEN=credentials('pippo-sonar')
  }
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      sh "./gradlew sonar -Dsonar.token=${SONAR_TOKEN}"
    }
  }
}
