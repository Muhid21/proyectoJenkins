pipeline {
    agent { label 'master'} // Indica que se ejecute en el nodo principal [cite: 12]
    stages {
        stage ('test') { 
            steps {
                sh "mvn clean compile test" // Ejecuta tus pruebas unitarias [cite: 16]
            }
        }
        stage ('Build application') {
            steps {
                sh "mvn -f pom.xml clean install -Dmaven.test.skip=true" // Empaqueta omitiendo tests [cite: 21]
            }
        }
        stage ('Pasamos a producción') {
            steps {
                echo "Movemos al servidor y lo ponemos en producción" // Simulación de despliegue [cite: 26]
            }
        }
    }
}
