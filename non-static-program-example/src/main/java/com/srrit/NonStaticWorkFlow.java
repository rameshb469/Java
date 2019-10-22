package com.srrit;


/**
 * 
 * @author srrit
 *
 */
public class NonStaticWorkFlow 
{
	// initializing instance variable a = 100
	int a = 100;
	
    public static void main( String[] args )
    {
    	// creating object for this class
    	NonStaticWorkFlow nsw = new NonStaticWorkFlow();
    	
    	// calling instance method
    	nsw.instance_method();
    	
    	// calling print method
    	nsw.print();
        
    }
    
    public void instance_method() {
    	// Intializing variable a = 200;
    	// local vairable (inside the method)
        int a = 200;
        
        System.out.println("inside the method : "+a);
        
        print();
    }
    
 // instance method print()
 	public void print() {
 		// displaying value of b
 		System.out.println(a);
   	}
}
