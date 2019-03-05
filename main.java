package temp;
import java.util.Scanner;
public class main {

	public static void main(String[] args)
	{
		fahrn ob = new fahrn();
		length ob1= new length();
		
		int choice=0;
		System.out.println("enter the choice");
		Scanner in=new Scanner(System.in);
		choice=in.nextInt();
		if(choice==1)
		{
			//int temp_in_c=0,temp_in_f;
			//System.out.println("enter value in c");
			//Scanner myob=new Scanner(Scanner.in);
			//temp_in_c=myob
			//temp_in_f=fahrn.CTF(temp_in_c);
			ob.converttocelcius();
			//System.out.println("value="+temp_in_f);
		}
		
		if(choice==2)
		{
			//int temp_in_f=0,temp_in_c;
			//System.out.println("enter value in f");
			//=fahrn.FTC(temp_in_f);
			//System.out.println("value="+temp_in_c);
			ob.converttofahrn();
		}
		if(choice==3)
		{
			//int len_in_foot=0,len_in_cm;
			//System.out.println("enter value in foot");
			//len_in_cm=length.FOTCM(len_in_foot);
			//System.out.println("value="+len_in_cm);
			ob1.converttofoot();
		}
		if(choice==4)
		{
			//int len_in_foot,len_in_cm;
			//System.out.println("enter value in cm");
			//len_in_foot=length.CMTFO(len_in_cm);
			//1
			//System.out.println("value="+len_in_foot);
			ob1.converttocm();
		}
 }
}
