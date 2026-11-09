package method;
import java.util.Scanner;
public class Average {
int marks(int java,int sql,int html) {
	int res=(java+sql+html)/3;
	return res;
}
public static void main (String[] args) {
	Average av=new Average();
	Scanner sc=new Scanner(System.in);
	
	int java=sc.nextInt();
	int sql=sc.nextInt();
	int html=sc.nextInt();
	int result=av.marks(java, sql,html);
	System.out.print(result);
			;
}
}
