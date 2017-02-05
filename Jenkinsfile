node('swarm') {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/jglick/simple-maven-project-with-tests.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.
      mvnHome = tool 'M3'
   }
   stage('Build App') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' -e -Dmaven.test.failure.ignore clean package"
   }
   stage('Build container image') {
      // Run the maven build
      // sh "'${mvnHome}/bin/mvn' -e docker:build"
      sh "echo '[PLACEHOLDER] Build container image'"
   }
   stage('Push Container image') {
      // Run the maven build
      // sh "'${mvnHome}/bin/mvn' -e docker:push"
      sh "echo '[PLACEHOLDER] Push Container image'"
   }
   stage('Stage Application') {
      // Run the maven build
      sh "pwd; ls -l; rancher-compose --url http://139.162.118.183:8080/v1/projects/1a549 --access-key B5AAE7FE856D687A4E86 --secret-key 3syLvkMN3QMXG3chMkuhjEaZMziS9EFFWZCMpPgU --project-name swgapi --verbose up -d"
   }
   stage('Run load test') {
      // Run the maven build
      // sh "TBD"
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}
