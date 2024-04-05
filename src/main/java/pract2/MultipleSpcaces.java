package pract2;

public class MultipleSpcaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input ="hello java this    programe     is to remove multple    Spaces and     add single spaces";
		
//		regulare Expression
//		[0-9]or \\d+
		
//		\\s white spcase
//		Quantifiers define quantities:
//			Quantifier 	Description 	Try it
//			n+ 	Matches any string that contains at least one n 	
//			n* 	Matches any string that contains zero or more occurrences of n 	
//			n? 	Matches any string that contains zero or one occurrences of n

		
		String inputarr =input.replaceAll("\\s+", " ");
		
		System.out.println(inputarr);
		
		String input2 = "jyoti1236523";
		
		String inp3 =input2.replaceAll("[0-9]", "");
		
		System.out.println(inp3);
		
	}

}
