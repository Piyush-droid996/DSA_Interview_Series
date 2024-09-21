// Palindrome:
// String:
public class StringReverse
{
	public static void main(String[] args) {
        //here we are declaring str variable 
		String str = "madam", revStr = "";  
		//here we traverse loop in reversev 
		for(int i = str.length()-1; i >= 0 ;i--)
		{
		    revStr = revStr + str.charAt(i);
		} 
		System.out.println(revStr);

        if(str.toLowerCase().equals(revStr.toLowerCase()))
        {
            System.out.println("Palindrome.");
        }
        else
        {
            System.out.println("Not Palindrome.");
        }
}
}
