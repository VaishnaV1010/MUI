class StudentApp
{
int rollNo;
String name;
String branch;
static String collegeName;
public static void main(String[]args)
{
StudentApp Vaishnav=new StudentApp();
StudentApp Sadiq=new StudentApp();
StudentApp Narender=new StudentApp();
StudentApp Chandu=new StudentApp();

Vaishnav.rollNo=217;
Vaishnav.branch="EEE";
Vaishnav.collegeName="SPEC";
Sadiq.rollNo=229;
Sadiq.branch="EEE";
Sadiq.collegeName="SPEC";
Narender.rollNo=219;
Narender.branch="CSE";
Narender.collegeName="SPEC";
Chandu.rollNo=216;
Chandu.branch="ECE";
Chandu.collegeName="SPEC";

System.out.println(Vaishnav.rollNo+" "+Vaishnav.branch+" "+Vaishnav.collegeName);
System.out.println(Sadiq.rollNo+" "+Sadiq.branch+" "+Sadiq.collegeName);
System.out.println(Narender.rollNo+" "+Narender.branch+" "+Narender.collegeName);
System.out.println(Chandu.rollNo+" "+Chandu.branch+" "+Chandu.collegeName);
}
}