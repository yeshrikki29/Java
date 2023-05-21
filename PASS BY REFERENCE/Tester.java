class Tester
{
int x=80;
static void disp(Tester t2)
{
System.out.println(t2.x);
}
public static void main(String[] ar)
{
Tester t1=new Tester();
System.out.println(t1.x);
disp(t1);
}
}