package org.sidhana

//class Utilities implements Serializable {
  //def steps
  //Utilities(steps) {this.steps = steps}
  //def mvn(args) {
  //  steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
 //}

class Utilities {
  
  def checkJava(){
    sh("git log -1 --pretty=%B")
    
    println("[INFO] Jenkins credentials set to: ")
    //sh "echo Java"
  }
  
  
  def checkPython(){
    println("[INFO] Jenkins credentials set to:")
    //sh " echo Python"
  }
}
