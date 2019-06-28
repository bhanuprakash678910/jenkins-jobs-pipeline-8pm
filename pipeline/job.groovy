node('SLAVE') {
  stage("shell commands"){
     sh '''
        uptime
        hostname
     '''
}}
