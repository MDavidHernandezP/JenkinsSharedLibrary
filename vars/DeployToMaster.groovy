def call(Map config = [:]) {
    echo "Starting deployment with parameter: ${config.anyparam}"
    
    // Example of a deploy step - you can customize this
    sh 'echo Deploying application to production...'
    
    echo "Deployment completed."
}
