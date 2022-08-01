pipeline {
    agent any
	
	paramters {
		booleanParam(name: 'IS_Release_Candidate' ,
		  defaultValue: false,
		  description: ''
		  )
	}

	environment {
	   username = credentials('username')
	   password = credentials('password')
	   
	
	}
	
	stages {
	
	  stage('Build and Test') {
			steps {
				bat 'mvn clean package'
			}
	  }
	  
	  stage('Publish to Sandbox') {
	  
	  }
	  
	  stage('')
	
	}
}	