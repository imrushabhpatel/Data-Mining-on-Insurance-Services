package com;

public class User1 {
	private String username;
	private String ownership;
	private String area;
	private String cost;
	private String total;
	private String gender;
	private String salary;
	private String mobile;
	private String msg="  ";
	
	/**
	 * @return the ownership
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getOwnership() {
		return ownership;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/**
	 * @param ownership the ownership to set
	 */
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the msg
	 */
	
	public String getMessage() {
		return msg;
	}

	public boolean validate(){
		if((this.ownership==null || this.ownership=="")){
	    		msg="Enter Ownership";
	    		return false;
	    	}
	    else if(this.area==null || this.area==""){
			msg="Enter Area";
			return false;
		}
		else if(this.cost==null || this.cost==""){
			msg="Enter Cost";
			return false;
		}
		else if(this.total==null || this.total==""){
			msg="Click on Total"; 
			return false;
		}
		else if(this.gender==null || this.gender==""){
			msg="Enter Gender";
			return false; 
		}
		else if(this.salary==null || this.salary==""){
			msg="Enter Your Salary";
			return false;
		}
		else if(this.mobile==null || this.mobile==""){
			msg="Enter your Mobile number"; 
			return false;
		}
		else if( (this.mobile.length()<10) || (this.mobile.length()>10))
		{
			msg="Enter valid mobile number";
			return false;
		}
		 
		else{
		return true;
		}
	}
	
	

}
