def call(String name) {
    def hour = new Date().getHours()
    def greeting = (hour < 12) ? "Good morning" : 
                  (hour < 18) ? "Good afternoon" : "Good evening"
    
    echo "${greeting}, ${name}! 🎉"
    echo "Current time: ${new Date()}"
}
