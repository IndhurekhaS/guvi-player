import java.util.*;
public class strs{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s1.charAt(i))
            {
                count++;
            }
        }
        if(count==1)
        System.out.println("yes");
        else 
        System.out.println("no");
        
        
    }
}
