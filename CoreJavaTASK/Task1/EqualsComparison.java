package coreJAVAtasks;

import java.util.Objects;

public class EqualsComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        
		        int[][] array1 = {{12, 2}, {13, 4}};
		        int[][] array2 = {{12, 2}, {13, 4}};
		        
		      
		        System.out.println("Using equals(): " + array1.equals(array2));  
		        
		        System.out.println("Using deepEquals(): " + Objects.deepEquals(array1, array2));  
		    }
		}


	


