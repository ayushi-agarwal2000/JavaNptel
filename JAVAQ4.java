Scanner sc=new Scanner(System.in);

char ch=sc.next().charAt(0);	 		
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.print(""); 
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	System.out.print("Consonant");
