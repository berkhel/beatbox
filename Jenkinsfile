node {

  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      sh "./gradlew sonar -Dsonar.token=${credentials($SONAR_TOKEN)}"
    }
  }
}
