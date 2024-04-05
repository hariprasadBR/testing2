package pract.pract;

public class kailran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ka bil Rang a nat ha n";
	       //o/p = Kabil Ranganathan
	       String a = s.replaceAll(" ","");
	       String res = "";
	       for(int i=0;i<a.length();i++){
	           char c = a.charAt(i);
	           if(Character.isUpperCase(c)){
	               res = res+" "+c;
	           } else {
	               res = res+c;
	           }
	       }
	       System.out.println(res.trim());

	}

}
