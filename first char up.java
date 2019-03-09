import java.util.*;
public class strs{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.toLowerCase();
        String s4="";
        String s2=s.substring(0,1).toUpperCase()+s.substring(0,2);
        for(int i=0;i<s.length();i++)
        {
             if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
             {
                 char s3=Character.toUpperCase(s.charAt(i+1));
                 s4=s3+s.substring(i+2);
             }
             
        }
         System.out.print(s2+" "+s4);
         
       
        
        
    }
}
