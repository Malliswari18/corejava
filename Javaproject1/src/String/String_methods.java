package String;

public class String_methods {
	public static void main(String[] args) {
		String s="Software Developer";
		System.out.println(s.length());
		System.out.println("-------------");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("-------------");
		System.out.println(s.startsWith("soft"));
		System.out.println(s.startsWith("Soft"));
		System.out.println("------------------");
		System.out.println(s.endsWith("er"));
		System.out.println(s.endsWith("ER"));
		System.out.println("-------------------");
		System.out.println(s.isEmpty());
		System.out.println(s.contains("Dev"));
		System.out.println(s.contains(" "));
		System.out.println("-------------------");
		System.out.println(s.concat(" at dcl"));
		System.out.println("-------------------");
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		System.out.println("-------------------");
		System.out.println(s.indexOf("e"));//Always prints the first character index number
		System.out.println(s.lastIndexOf("e"));
		
		String s1="Java";
		String s2="jAva";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("-------------------");
		System.out.println(s.substring(4));
		System.out.println(s.substring(10));
		System.out.println(s.substring(1,16));
		System.out.println(s.substring(4,12));
	}

}
