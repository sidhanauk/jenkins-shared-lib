import org.sidhana.Utilities

def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    def utils = new Utilities(this)
    
    utils.mvn 'clean package'
    
    //utils.mvn(" --version")
    
    echo "Hello, ${name}."
}
