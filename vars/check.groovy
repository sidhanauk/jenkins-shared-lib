import org.sidhana.Utilities

def call(String name = 'java') {

    if (name.contains('java')){
        checkJava()
    }
    
    if (name.contains('python')){
        checkPython()
    }
}

def checkJava(){
    echo "Checking java"
}


def checkPython(){
    echo "Checking python"
}
