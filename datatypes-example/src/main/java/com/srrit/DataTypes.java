package com.srrit;

/**
 * 
 * @author SRRIT
 *
 */
public class DataTypes 
{
	/**
	 * This is method will print all primitive datatypes  and they are
	 * 
	 * <a> byte </a>
	 * <a> short </a>
	 * <a> int </a>
	 * <a> long </a>
	 * <a> double </a>
	 * <a> float </a>
	 * <a> char </a>
	 * <a> boolean </a>
	 *  
	 */
	
	public void print_primitives() {
		
		// byte type
		byte b = 126;
        System.out.println(b);
        
        // short type
        short s = 56;
        System.out.println(s);
        
        // long type (should add 'L' at end)
        long l = 100000L;
        System.out.println(l);
        
        // double type
        double d = 43234.3434;
        System.out.println(d);
        
     // float type (should add 'f' at end)
        float f = 4.5541132f;
        System.out.println(f);
        
        // char type
        char c = 'a';
        System.out.println(c);
        
        // boolean type
        boolean bl = true; // only true or false 
        System.out.println(bl);
	}
	
	/**
	 * This method print all non-primitives
	 * 
	 * <a> String </a>
	 * <a> Array </a>
	 * @return 
	 */
	public void print_non_primitives() {
		
		// String type
		String name = "String-Type";
		System.out.println(name);
		
		// Array type
		int[] a = {1,3,4,54};
		System.out.println(a);
	}
	
    public static void main( String[] args )
    {
        DataTypes dt = new DataTypes();
        
        // printing primitives
        dt.print_primitives();
    }
    
}
