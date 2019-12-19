/*-------------------------------------------------------------
// AUTHOR: Seraphine Ritenour
// FILENAME: builder.java
// SPECIFICATION: your own description of the program.
// FOR: CSE 110- Lab #7
// TIME SPENT: how long it took you to complete the assignment.
//----------------------------------------------------------- */

public class Builder
{
    // ======================= Attributes =======================

    // A String called name
	private String name;
	
    // ======================= Constructors =======================

    public Builder (String name)
    {
    	this.name = name;
        // Write the segment of code
        // that assigns input data to the instance variables (attributes)
    }

    // ======================= Methods =======================

    public String getName()
    {
        // Write a line of code that returns the name
    	return name;
    }

    public String makeRow(int n, String s)
    {
    	String row = "";
    	for(int i = 1; i <= n; i++) {
    		row = s + row;
    	}
        // Given an int n and string s, return a string that represents n
        // copies of s in one row.
        // Example: n = 5, s ="*", return a string "*****"
    	return row;
    }
    
    public void makePyramid(int n, String s)
    { 
    	int midWidth = -1;
    	int sideWidth = -1;
    	String sideSymb = "*";
    	String result = "";
    	for(int i = 1; i <= n; i = i + 2) {
    		midWidth = i;
    		sideWidth = (n - midWidth)/2;
    		result += makeRow (sideWidth, sideSymb) + makeRow(midWidth, s) + makeRow (sideWidth, sideSymb) +"\n";
    		
    	}
    	System.out.println(result);
        // Print the pyramid pattern as showed in the sample output by
        // the makeRow method

        // Note this method does not return anything.
    }
    
}