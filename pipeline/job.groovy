node() {
  stage("shell commands"){
     sh '''
        uptime
        hostname
     '''
}}
