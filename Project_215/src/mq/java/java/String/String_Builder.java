package mq.java.String;

public class String_Builder {

	public static void main(String[] args) {
		
		
		String surname="Gajjala";
		StringBuilder Fullname=new StringBuilder(surname).append(" ").append("Sunil");
		System.out.println(Fullname);
		
		//Revers a string using StringBuilder
		StringBuilder builder=new StringBuilder("WebDriver");
		StringBuilder res=builder.reverse();
		System.out.println(res.toString());

	}

}
