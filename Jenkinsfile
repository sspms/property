#!/usr/bin/env groovy

pipeline {
    agent {
        label 'master'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '50'))
        timeout(time: 10, unit: 'MINUTES')
        disableConcurrentBuilds()
        timestamps()
    }
    environment {
        APP_NAME = 'USER'
        SOURCE_JOB = "${JOB_NAME}"
        BUILD_REPO_PATH = "/var/deploy"
    }
    stages {
        stage('Assembly') {
            steps {
                script {
                    withEnv([
                            'MVN_HOME=/usr/maven'
                    ]) {
                        sh """${MVN_HOME}/bin/mvn clean install"""
                    }
                }
            }
        }

        stage('Copy Assembly to build repo') {
            steps {
                script {
                    def date = new Date().format('yyyyMMddhhmmssSSS')
                    sh """
if [ ! -d ${env.BUILD_REPO_PATH}/property ]; then
    mkdir ${env.BUILD_REPO_PATH}/property
fi
yes | cp -rf ./target/property*exec.jar ${env.BUILD_REPO_PATH}/property/property.jar
yes | cp -rf property.dockerfile ${env.BUILD_REPO_PATH}/property
yes | cp -rf docker-compose.yml ${env.BUILD_REPO_PATH}/property
"""
                    currentBuild.rawBuild.displayName = date
                }
            }
        }
        stage('Build Docker images') {
            when { branch 'master' }
            steps {
                script {
                    echo 'building docker iamges'
                    sh """
"""
                }
            }
            post {
                failure {
                    echo "BUILDING of ${env.APP_NAME} images FAILED !"
                }
            }
        }
        stage('Deployment') {
            when { branch 'master' }
            steps {
                script {
                    echo "Deployment is skipped"
                }
            }
        }
    }
    post {
        failure {
            echo 'pipeline failed'
        }
    }
}