// vars/checkLicense.groovy
def call(String language = 'java') {
  if (language.contains('java')) {
    pipeline {
      agent any
      stages {
        stage('Java Licence Check') {
          steps {
            echo "Check licence in java dependencies"
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Python Licence Check') {
          steps {
            echo "Check licence in java dependencies"
          }
        }
      }
    }
  }
}
