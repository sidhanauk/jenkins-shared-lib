import org.sidhana.Utilities

def call(String name = 'java') {
    
    def licence = new Utilities()

    if (name.contains('java')){
        licence.checkJava()
    }
    
    if (name.contains('python')){
        licence.checkPython()
    }
}
