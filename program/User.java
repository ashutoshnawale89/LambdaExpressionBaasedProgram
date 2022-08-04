package com.LambdaExpression.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	public static void main(String[] args)  {
		LambdaExpression m= (user,regx,name ) -> {
			Pattern p = Pattern.compile(regx);
			Matcher num = p.matcher(user); 
			System.out.println(name+ " "+user + "->" + num.matches());
			return user;
		};
		// For Valid User Details
		m.data("ASHUTOSH","[A-Z]{3,}","First Name");
		m.data("NAWALE","[A-Z]{3,}","Last Name");
		m.data("abc.xyz@bl.co.in","[abc]{3}[.]{1}[xyz]*[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]*","Email ID :");
		m.data("7776042852","[0-9]{10}","Moile Number");
		m.data("ShrurTiKa","[A-Za-z]{8,}","Passaword");
		
		// For Invalid Condiion Check
		m.data("Ashutosh","[A-Z]{3,}","First Name");
		m.data("Nawale","[A-Z]{3,}","Last Name");
		m.data("abd.xyz@bl.co.in","[abc]{3}[.]{1}[xyz]*[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]*","Email ID :");
		m.data("777604285211","[0-9]{10}","Moile Number");
		m.data("ShrurTiKa$1","[A-Za-z]{8,}","Passaword");
	}
	}

