pipeline {
    agent any
    stages {
        stage('firefox-58') {
            steps {
                sh './mvnw clean test -DBROWSER=firefox -DVERSION=58'
                allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                ])
            }
        }

        stage('firefox-57') {
            steps {
                sh './mvnw clean test -DBROWSER=firefox -DVERSION=57'
                allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                ])
            }
        }

        stage('chrome-63') {
            steps {
                sh './mvnw clean test -DBROWSER=chrome -DVERSION=63'
                allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                ])
            }
        }

        stage('chrome-62') {
            steps {
                sh './mvnw clean test -DBROWSER=chrome -DVERSION=62'
                allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                ])
            }
        }
    }
}