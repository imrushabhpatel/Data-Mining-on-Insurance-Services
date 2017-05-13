package com;

public class User2 {
 

	private String genderl;
	private String agel;
	private String salaryl;
	private String smoke;
	private String msg="  ";

	public String getMessage() {
		return msg;
	}
	public String getGenderl() {
		return genderl;
	}
	public void setGenderl(String genderl) {
		this.genderl = genderl;
	}
	public String getAgel() {
		return agel;
	}
	public void setAgel(String agel) {
		this.agel = agel;
	}
	public String getSalaryl() {
		return salaryl;
	}
	public void setSalaryl(String salaryl) {
		this.salaryl = salaryl;
	}
	public String getSmoke() {
		return smoke;
	}
	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}
		
	public boolean validate(){
		if((this.genderl==null || this.genderl=="")){
	    		msg="Enter Your Gender";
	    		return false;
	    	}
	    else if(this.agel==null || this.agel==""){
			msg="Enter Your Age";
			return false;
		}
		if(this.agel.compareTo("18")<0){
			msg="Your age should be above 18 ";
			return false;
		}
		else if(this.salaryl==null || this.salaryl==""){
			msg="Enter your Annual Income "; 
			return false;
		}
		else if(this.smoke==null || this.smoke==""){
			msg="Select do you smoke or not?";
			return false; 
		}
				 
		else{
		return true;
		}
	}
}
