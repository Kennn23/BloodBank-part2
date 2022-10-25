class BloodData{
    private String bloodType;
    private String rhFactor;

    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    //setter
    public void setBloodType(String name){
    	this.bloodType = name;
    }
    public void setRhFactor(String type){
    	this.rhFactor = type;
    }
    //getter
    public String getBloodType(){
    	return bloodType;
    }
    public String getRhFactor(){
    	return rhFactor;
    }
    public void display(){
        System.out.println(bloodType+rhFactor+" is added to the blood bank.");
    }
}