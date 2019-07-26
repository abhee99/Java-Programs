import java.util.*;
public class balancedbracket
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int i,j,c,f;
        char a[];
        char ch;
        String s;
        for(i=0;i<n;i++)
        {   
            f=0;
            c=0;
            s=sc.nextLine();
            a=new char[s.length()];
            for(j=0;j<s.length();j++)
            {
                ch=s.charAt(j);
                if(ch == '(' || ch == '[' || ch == '{')
                {
                    a[c]=ch;
                    c++;
                }
                else if((ch == ')' || ch == ']' || ch == '}')&& c==0)
                {
                    f=1;
                    break;
                }
                else if(ch == ')' || ch == ']' || ch == '}')
                {
                    if((ch==')'&& a[c-1]=='(')||(ch=='}'&& a[c-1]=='{')||(ch==']'&&a[c-1]=='['))
                        c--;
                    else
                    {
                        f=1;
                        break;
                    }
                }
                // if(f==1)
                //     break;
            }
            if(f==1|| c!=0)
                 System.out.println("NO");
            else if(c==0) 
                System.out.println("YES");
        }
    }
}

