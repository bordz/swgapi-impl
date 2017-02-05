node('swarm') {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/bordz/swgapi-impl.git/'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.
      mvnHome = tool 'M3'
   }
   stage('Build App') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' -e -Dmaven.test.failure.ignore clean package docker:build"
   }
   stage('Push Container image') {
      // Run the maven build
      // sh "'${mvnHome}/bin/mvn' -e docker:push"
      sh "docker push xcoordinate/swgapi:latest"
   }
   stage('Stage Application') {
      // Run the maven build
      sh "pwd; ls -l; rancher-compose --url http://139.162.118.183:8080/v1/projects/1a549 --access-key B5AAE7FE856D687A4E86 --secret-key 3syLvkMN3QMXG3chMkuhjEaZMziS9EFFWZCMpPgU --project-name swgapi --verbose up -d"
   }
   stage('Run load test') {
      // Run the maven build
      // sh "TBD"
      // sh "echo '[PLACEHOLDER] Run load test'"
      withDockerContainer(args: '-v $PWD:/bzt-configs', image: 'undera/taurus') {
          // some block
          sh "echo '[PLACEHOLDER] Run load test'"
      }

   }
   stage('Results') {
      // junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}
