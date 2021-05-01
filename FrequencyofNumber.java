import java.util.*;
class Main{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String[] s=sc.nextLine().split(" ");
   int[] a=new int[s.length];
   int[] f=new int[s.length];
   for(int i=0;i<s.length;i++)
      a[i]=Integer.parseInt(s[i]);
   int c,vit=-1;
   for(int i=0;i<s.length;i++)
   {
     c=1;
     for(int j=i+1;j<s.length;j++)
     {
       if(a[i]==a[j])
        {
         f[j]=vit;
         c++;
        }
     }
 if(f[i]!=vit)
    f[i]=c;
   }
  for(int i=0;i<s.length;i++)
  {
     if(f[i]!=vit)
      {
       System.out.println(a[i]+"   "+f[i]);
}
}
}
}
         
