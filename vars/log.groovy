def call(message) {
    echo "Entry to log library"
    echo "${message}"
}


def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def error(message) {
    echo "ERROR: ${message}"
}
