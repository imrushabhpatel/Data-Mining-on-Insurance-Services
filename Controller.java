/**Shital**/
package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action == null)
		{
	   request.getRequestDispatcher("index.jsp").forward(request, response);
	   
	   
	}
		else
			doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		
			String gender=request.getParameter("gender");
			String ownership=request.getParameter("ownership");
			String salary=request.getParameter("salary");
			String area=request.getParameter("area");
			String cost=request.getParameter("cost");
			String total=request.getParameter("total");
			String mobile=request.getParameter("mobile");
			
			
			String genderl=request.getParameter("genderl");
			String agel=request.getParameter("agel");
			String salaryl=request.getParameter("salaryl");
			String smoke=request.getParameter("smoke");
			
			
			
			
			
		   HttpSession session=request.getSession();
		   
/** if user has nt registered atall**/
		if(action.equals("doregister")){
			 User user=new User();
		     request.setAttribute("msg", user.getMessage());
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
		}
		
		if(action.equals("login")){
			 User user=new User();
		     request.setAttribute("msg", user.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
		
/**clicked on register 
 * validate values
 * enters into db **/		
		if(action.equals("register")){
			
		    User user=new User();
		    user.setUsername(username);
			user.setEmail(email);
			user.setPassword(password);
			user.setRepassword(repassword);
			boolean status=user.validate();
		
			request.setAttribute("username", username);
			request.setAttribute("email", email);
			if(status==true){
				
				try {
					Account acc=new Account();
					
					acc.insertaccount(username, email, password);
				}
					 catch (Exception e) {
						}
		

			    request.getRequestDispatcher("home.jsp").forward(request, response);
					
			}
			else{
			request.setAttribute("msg", user.getMessage());
			request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
/** already register user dos login**/		
		if(action.equals("dologin")){

			request.setAttribute("username", username);
			request.setAttribute("password", password);
			
			Account acc=new Account();
			try {
				boolean status=true;
				if(status==acc.acc_validate(username, password))
				{
			
					session.setAttribute("username", username);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
				else{
					request.setAttribute("msg1", "Enter valid Username/Password");
				
					request.getRequestDispatcher("index.jsp").forward(request, response);
			 }
			  	
		}
			catch (Exception e) {}
		}
		
		if(action.equals("HomeInsurance")){
	/*NEW */ User1 user=new User1(); /* */
		     request.setAttribute("msg", user.getMessage());
			request.getRequestDispatcher("homeinsurance.jsp").forward(request, response);
			}
		
		/** home insurance form validation and result display**/
		
		if(action.equals("homeins")){
			 User1 user1=new User1();
			 
			 user1.setSalary(salary);
			 user1.setOwnership(ownership);
			 user1.setGender(gender);
			 user1.setCost(cost);
			 user1.setTotal(total);
			 user1.setArea(area);
			 user1.setMobile(mobile);
			 
			 boolean status=user1.validate();
			 
			request.setAttribute("ownership", ownership);
			request.setAttribute("area", area);
			request.setAttribute("gender", gender);
			request.setAttribute("cost", cost);
			request.setAttribute("total", total);
			request.setAttribute("salary", salary);
			request.setAttribute("mobile", mobile);
		
			if(status==true){
			
				try{
				Account accc=new Account();
				
				accc.insertaccount1(ownership,area,cost,total,salary,gender,mobile);
				
				}
				catch(Exception e){}
			
				request.getRequestDispatcher("homeresult.jsp").forward(request, response);
				}
				else{
			
					request.setAttribute("msg", user1.getMessage());
					request.getRequestDispatcher("homeinsurance.jsp").forward(request, response);
					}
			}
		
		
		if(action.equals("lifeins")){
			 User2 user2=new User2();
			 
			 user2.setGenderl(genderl);
			 user2.setAgel(agel);
			 user2.setSalaryl(salaryl);
			 user2.setSmoke(smoke);
			 
			 
			 boolean status=user2.validate();
			 
			request.setAttribute("genderl", genderl);
			request.setAttribute("agel", agel);
			request.setAttribute("salaryl", salaryl);
			request.setAttribute("smoke", smoke);
			
			if(status==true){
			
				try{
				
				Account acccc=new Account();
				acccc.insertaccount2(genderl,agel,salaryl,smoke);
				
				}
				catch(Exception e){}
			
				request.getRequestDispatcher("liferesult.jsp").forward(request, response);
				}
				else{
			
					request.setAttribute("msg", user2.getMessage());
					request.getRequestDispatcher("lifeinsurance.jsp").forward(request, response);
					}
			}
		

		
		
		
		
		if(action.equals("CarInsurance")){
			request.getRequestDispatcher("carinsurance.jsp").forward(request, response);
		}
		
		
		if(action.equals("LifeInsurance")){
			User2 user2=new User2(); /* */
		     request.setAttribute("msg", user2.getMessage());
			request.getRequestDispatcher("lifeinsurance.jsp").forward(request, response);
		}
		if(action.equals("TravelInsurance")){
			request.getRequestDispatcher("travelinsurance.jsp").forward(request, response);
		}
	}

	}

