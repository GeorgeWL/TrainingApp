package uk.ac.shu.webarch.trainingapp

class User { 
	// Declare variables for user data
	String username
	String gender
	int    height 
	Float  weight
	Set trainingSessions //Many training sessions associated with a user
	
	static mapping = 
	{
		//Allows the user table to properly store the user's weight		
		weight column: "weight", sqlType: "decimal", precision: 4, scale: 1
	} 


	static hasMany = [trainingSessions: Trainingsession] //Relationship between user and Trainin sessions
	static mappedBy = [trainingSessions: 'username'] //What to map training sessions by	

    	static constraints = 
	{
		//Only allow 2 genders to be entered in gender field
		gender(inList:["Male", "Female"])
				
        }
}
