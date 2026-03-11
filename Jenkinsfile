pipeline {
    agent any // Indica que se ejecute en el nodo principal
    
    tools {
        maven 'Maven' // Define la herramienta antes de los stages
    }

    stages {
        stage ('test') {
            steps {
                sh "/opt/Maven/bin/mvn clean compile test" // Ejecuta tus pruebas unitarias
            }
        }
        stage ('Build application') {
            steps {
                sh "/opt/Maven/bin/mvn -f pom.xml clean install -Dmaven.test.skip=true" // Empaqueta omitiendo tests
            }
        }
        stage ('Pasamos a producción') {
            steps {
                echo "Movemos al servidor y lo ponemos en producción" // Simulación de despliegue
            }
        }
    }
}
