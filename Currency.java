//to covert indian currency into other currency
import java.io.*;
public class Currency
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int ch;
double convert=0.0,amount=0.0;
System.out.println("\t\tINDIAN CURRENCY CONVERTOR");
System.out.println("--------------------------------------------------");
System.out.println();
System.out.println("\tPlease enter your Indian amount in rupees");
System.out.print("\t");
amount=Double.parseDouble(in.readLine());
System.out.println();
System.out.println("\t************************");
System.out.println("\t 1--Afghan Afghani");
System.out.println("\t 2--Australian Dollar");
System.out.println("\t 3--British Pound");
System.out.println("\t 4--Chinese Yuan");
System.out.println("\t 5--Egyptian Pound");
System.out.println("\t 6--Euro");
System.out.println("\t 7--German Mark");
System.out.println("\t 8--Hong Kong Dollar");
System.out.println("\t 9--Iranian Rial");
System.out.println("\t10--Italian Lira");
System.out.println("\t11--Japanese Yen");
System.out.println("\t12--Malasysian Ringgit");
System.out.println("\t13--Mexican Pesco");
System.out.println("\t14--Nepalese Rupee");
System.out.println("\t15--Singapore Dollar");
System.out.println("\t16--Srilankan Rupee");
System.out.println("\t17--US Dollar");
System.out.println("\t****************************");
System.out.println();
System.out.println("\tEnter the choice number you want to convert to");
System.out.print("\t");
ch=Integer.parseInt(in.readLine());
System.out.println();
System.out.print("\t");
if(ch==1)
{
convert=amount*1.03223;
System.out.println(amount+" Indian Rupee = "+convert+" Afghan Afghanis");
}
if(ch==2)
{
convert=amount*0.021;
System.out.println(amount+" Indian Rupee = "+convert+" Australian Dollars"); 
}
if(ch==3)
{
convert=amount*0.010;
System.out.println(amount+" Indian Rupee = "+convert+" British Pounds");
}
if(ch==4)
{
convert=amount*0.098;
System.out.println(amount+" Indian Rupee = "+convert+" Chinese Yuans");
}
if(ch==5)
{
convert=amount*0.12;
System.out.println(amount+" Indian Rupee = "+convert+" Egyptian Pounds");
}
if(ch==6)
{
convert=amount*0.014;
System.out.println(amount+" Indian Rupee = "+convert+" Euros");
}
if(ch==7)
{
convert=amount*0.026;
System.out.println(amount+" Indian Rupee = "+convert+" German Marks");
}
if(ch==8)
{
convert=amount*0.12;
System.out.println(amount+" Indian Rupee = "+convert+" Hong Kong Dollars");
}
if(ch==9)
{
convert=amount*454.39;
System.out.println(amount+" Indian Rupee = "+convert+" Iranian Rials");
}
if(ch==10)
{
convert=amount*25.77;
System.out.println(amount+" Indian Rupee = "+convert+" Italian Liras");
}
if(ch==11)
{
convert=amount*1.80;
System.out.println(amount+" Indian Rupee = "+convert+" Japanese Yens");
}
if(ch==12)
{
convert=amount*0.065;
System.out.println(amount+" Indian Rupee = "+convert+" Malasyian Ringitts");
}
if(ch==13)
{
convert=amount*0.26;
System.out.println(amount+" Indian Rupee = "+convert+" Mexican Pescos");
}
if(ch==14)
{
convert=amount*1.60;
System.out.println(amount+" Indian Rupee = "+convert+" Nepalese Rupees");
}
if(ch==15)
{
convert=amount*0.021;
System.out.println(amount+" Indian Rupee = "+convert+" Singapore Dollars");
}
if(ch==16)
{
convert=amount*2.18;
System.out.println(amount+" Indian Rupee = "+convert+" Srilankan Rupees");
}
if(ch==17)
{
convert=amount*0.015;
System.out.println(amount+" Indian Rupee = "+convert+" US Dollars");
}
if(ch<0 && ch>17)
{
System.out.println("wrong choice entered");
}
}
}