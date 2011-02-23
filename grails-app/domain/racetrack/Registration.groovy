package racetrack

class Registration {
	
	static belongsTo = [race:Race, runner:Runner]
	
	Boolean paid
	Date dateCreated // Note: this is a special name
	
    static constraints = {
    	race()
    	runner()
    	paid()
    	dateCreated()
    }
    
    String toString() {
    	return "${id} - ${runner.lastName}, ${runner.firstName}"
    }
}
