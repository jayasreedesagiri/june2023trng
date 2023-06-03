class day3TestStringcomparison1{
public static void main(String args[])
{
String s="Sachin";
String s2="Sachin";
String s3=new String("SAchin");
String s4="Savrav";

System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s3));
System.out.println(s.equals(s4));
}
}