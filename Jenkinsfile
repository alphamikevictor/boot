node{
	stage("Lets get the code"){
		checkout scm
	}
	stage("Build S2I Docker"){
		echo("Es el build ${env.BUILD_NUMBER}")
		sh("docker build -t springboot:${env.BUILD_NUMBER} .")
	}
}