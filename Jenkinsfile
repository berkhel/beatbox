node {

  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      sh "./gradlew sonar -Dsonar.token=${credentials('pippo-sonar')}"
    }
  }
}
