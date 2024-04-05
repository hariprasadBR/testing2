
public class arraypract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a =  "hello jytoi how are you";
					
//		"hari"   'a'
		
//		System.out.println(a[1]);
//		System.out.println(a.charAt(a.length()-1));
		
//		index position  of array or string starts from 0
//		and counting start from 1
//		incase if we want to fetch last value in string or array use length-1
				
				
	char[]  b =a.toCharArray();//output//		['h','e','l','l','o',' ','j','y'',t','o','i', 'h','o','w' ,'a','r','e' ,'y','o','u']
		
System.out.println(b[0]);
System.out.println(b[b.length-1]);

   String[] c= a.split("jytoi");//output   ["hello ","jytoi"," how " ,"are"," you"];
   
   System.out.println(c[c.length-1]);//
   
   
   

	}

}
