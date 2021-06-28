package Assigment3;

public abstract class Basketball {
	

	private String centreName,location,contact,time;

	public Basketball() {	
		
		centreName = "KnBasketball Centre";
		location = "KnBasketball Court Langkawi";
		contact = "Miss Kano +6017-24340708";
		time = "10:00am - 10:00pm";
	}
	public Basketball(String cn, String l,String c, String t) {
		this.centreName=cn;
		this.location=l;
		this.contact=c;
		this.time=t;

	}
	public String getCentreName() {
		return centreName;
	}
	public String getLocation() {
		return location;
	}
	public String getContact() {
		return contact;
	}
	public String getTime() {
		return time;
	}
	public String toString() {
		return  "\n====================================================================="+
				"\n Basketball Center Information"+
				"\n====================================================================="+
				"\n Centre Name\t\t: " + centreName +
				"\n Location\t\t: " + location + 
				"\n Contact Number\t\t: " + contact +
				"\n Time Operating\t\t: "+ time+
				"\n=====================================================================";
}
}