package pract.pract;

public class pratte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ha ri p ra sa d No mul a Bi xa m";
        String output = "Hariprasad Nomula Bixam";

        String[] outputComponents = output.split("\\s+");
        String inputWithoutSpaces = input.replaceAll("\\s+", "");

        StringBuilder sb = new StringBuilder(inputWithoutSpaces);

        int currentPosition = 0;

        for (String word : outputComponents) {
            int wordLength = word.length();
            // Insert space at the appropriate position
            sb.insert(currentPosition + wordLength, " ");
            // Update the current position for the next iteration
            currentPosition += wordLength + 1;
        }

        System.out.println(sb.toString());  
    
	}
}
