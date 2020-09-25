package org.horizoncolumbus.hs;

public class TechDistribution {

    public static void main(String[] args) {
	boolean isJunior = true;
	boolean isSenior = false;
	boolean isTeacher = false;
	boolean isAdmin = false;
	boolean haveCTE = true;
	boolean atHome = false;

	if((isJunior || isSenior) && haveCTE){
		System.out.println("Windows Laptop Given");
	}
	else if((isTeacher || isAdmin) && atHome){
		System.out.println("Macbook Given");
	}
	else{
		System.out.println("Chromebook Given");
	}
	}
}
