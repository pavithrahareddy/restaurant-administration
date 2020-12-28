//to calculate mc donalds and kfc bill
import java.io.*;
public class mckfc
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i=0,choice=0,mcch=0,ach=0,bch=0,cch=0,dch=0,ech=0,fch=0,kfcch=0,mch=0,nch=0,och=0,pch=0,qch=0,rch=0,sch=0,uch=0,achno=0,bchno=0,cchno=0,dchno=0,echno=0,fchno=0,mchno=0,nchno=0,ochno=0,pchno=0,qchno=0,rchno=0,schno=0,uchno=0;
double vat=0.0,tamt=0.0,aamt=0.0,bamt=0.0,camt=0.0,damt=0.0,eamt=0.0,famt=0.0,mamt=0.0,namt=0.0,oamt=0.0,pamt=0.0,qamt=0.0,ramt=0.0,samt=0.0,uamt=0.0;
String mc="y";
String ama="y";
String name="";
String mcmenu[]={"BURGERS","WRAPS","DESERTS","BEVERAGES","MEALS","HAPPY MEALS"};
String ana[]={"Veg McMuffin","Veg Supreme McMuffin","Mc Egg","Egg & Cheese McMuffin","Sausage McMuffin","Sausage McMuffin with Egg","Mc AlooTikki","Mc Veggie","Masala Grill Veg","Mc Spicy Paneer","Chicken McGrill","Chicken Maharaja Mac","Masala Grill Chicken","Mc Chicken","Filet-O-Fish","Mc Spicy Chicken"};
String bna[]={"Hash Browns","Veg Pizza McPuff","Frech Fries Small","French Fries Medium","Spicy Paneer Wrap","Chicken Grill Wrap","Spicy Chicken Wrap","Chicken McNuggets 6pc","Chicken McNuggets 9pc","Chicken McNuggets 20pc"};
String cna[]={"Soft Serve Cone","Mc Swirl Chocolate","Mc Swirl ButterScoth","Soft Serve Strawberry Small","Soft Serve Strawberry Medium","Soft Serve Chocolate Small","Soft Serve Chocolate Medium","Chocolate Brownie Spft Serve Small","Chocolate Brownie Soft Serve Medium","Mc Flurry Oreo","Mc Flurry ChocoCrunch","Straberry Shake Small","Strawberry Shake Medium","Strawberry Shake Large","Chocolate Shake Small","Chocolate Shake Medium","Chocolate Shake Large"};
String dna[]={"Ice Tea","Cold Coffee McFloat","Coke McFloat","Fanta McFloat","Sprite McFloat","Coke Small","Coke Medium","Coke Large","Fanta Small","Fanta Medium","Fanta Large","Sprite Small","Sprite Medium","Sprite Large","Cold Coffee","Black Tea","Tea","Black Coffee","Fresh Brew Coffee","Minute Maid Pulpy Orange","Maaza"};
String ena[]={"Veg McMuffin+Hash Brown+Small Tea/Coffee/coke","Sausage McMuffin with Egg+Hash Brown+Small Tea/Coffee/Coke","Mc Veggie+Medium Fries+Medium Coke","Mc Spicy Paneer+Medium Fries+Medium Coke","Mc Spicy Paneer Wrap+Medium Fries+Medium Coke","Mc Paneer Royale+Medium Fries+Medium Coke","Mc Chicken+Medium Fries+Medium Coke","Filet-O-Fish+Medium Fries+Medium Coke","Chicken Mharaja Mac+Medium Fries+Medium Coke","Mc Spicy Chicken+Medium Fries+Medium Coke","Spicy Chicken Wrap+Medium Fries+Medium Coke","Chicken Grilled Royale+Medium Fries+Medium Coke","Chicken McNuggets 6pc+Medium Fries+Medium Coke","Chicken McNuggets 9pc+Medium Fries+Medium Coke"};
String fna[]={"Veg McMuffin,Maaza/Small-coke,Toy","Veg Supreme McMuffin,Maaza/Small-Coke,Toy","Hot Cakes,Maaza/Small-Coke,Toy","Egg & Cheese McMuffin,Maaza/Small-coke,Toy","Sausage McMuffin,Maaza/Small-Coke,Toy","Sausage McMuffin with Egg,Maaza/Small-Coke,Toy","Mc AlooTikki,Maaza/Small-Coke,Toy","Mc Veggie,Maaza/Small-Coke,Toy","Mc Egg,Mazza/Small-Coke,Toy","Chicken McGrill,Maaza/Small-Coke,Toy","Mc Chicken,Maaza/Small-Coke,Toy","Chicken McNuggets,Maaza/Small-Coke,Toy"};
String kfcmenu[]={"Snacks","Burgers","Toasted Wraps","Box Meal","Deserts","Share a Bucket","Rice Bowlz","Krushers"};
String mna[]={"Large fries","Medium Fries","Small Fries","Chicken Shots","Popcorn Chicken Regular","Popcorn Chicken Large","Hot Wings 5pc","Veg Strips 6pc","Boneless Strips 3pc","Boneless Strips 6pc"};
String nna[]={"Potato Krisper","Chicken Snacker","Veg Rockin","Chicken Rockin","Paneer Zinger","Chicken Zinger"};
String ona[]={"Veg Twister","Chicken Twister"};
String pna[]={"Veg Rockin,Fries,Pepsi","Chicken Rockin,Fries,Pepsi","Veg RiceBowlz,Pepsi","Chicken Rice Bowlz,Pepsi","Veg Rice Meal(3pc VegStrings,Rice,Gravy,Pepsi)","Chicken Rice Meal(1pc Chicken,Rice,Gravy,Pepsi)","Paneer Zinger Meal,Pepsi","Veg Twister,Fries,Pepsi","Chicken Zinger,Fries,Pepsi","Chicken Twistwe,Fries,Pepsi","Chicken Meal(2pc Hot&Crispy,Fries,Pepsi","Chicken Meal(2pc FieryGrilled,Fries,Pepsi","Group Meal(4pc Chicken,4pc BonelessStrips,2 LargeFries,4 Pepsi"};
String qna[]={"2 Soft Serves","Brownie Sundae","Chocolate Kreamball","Mango Kreamball","Strawberry Kreamball"}; 
String rna[]={"1pc Hot & Crispy","2pc Hot & Crispy","4pc Hot & Crispy","6pc Hot & Crispy","8pc Hot & Crispy","2pc Fiery Grilled","4pc Fiery Grilled","6pc Fiery Grilled","8pc Fiery Grilled"};
String sna[]={"Veg RiceBowlz","Chicken RiceBowlz"};
String una[]={"Lime Soda","Virgin Mojito","Vanilla Blue","Green Mango Jelly","Choco Lash","Chocopeanut Bolt","Iced Kappuccino","Mango Burst","Strawberry Storm","Kold Coffee"};
int ars[]={49,59,35,55,65,75,30,69,49,119,45,109,59,85,105,125};
int brs[]={29,25,60,75,149,45,155,95,125,265};
int crs[]={55,45,45,55,65,55,65,55,65,69,69,60,70,80,60,70,80};
int drs[]={45,55,30,30,30,15,20,25,15,20,25,15,20,25,49,30,35,50,55,45,25};
int ers[]={95,115,125,155,209,239,165,189,204,214,244,231,105,135};
int frs[]={100,110,114,100,110,120,105,130,108,118,140,120};
int mrs[]={90,70,40,40,59,105,99,99,99,195};
int nrs[]={29,40,65,79,115,119};
int ors[]={85,129};
int prs[]={139,149,99,109,169,179,185,145,189,189,219,229,519};
int qrs[]={30,55,65,65,65};
int rrs[]={75,149,285,419,529,149,289,429,559};
int srs[]={79,89};
int urs[]={29,59,59,59,95,95,95,99,99,40};
System.out.println("\t\t\tWELCOME TO");
System.out.println();
System.out.println("\t\t ____  ____   ____  ___       _   _   ___      ");
System.out.println("\t\t:     0    0 :    : 0   0    | * * | |   | |    | ");
System.out.println("\t\t:---  0    0 :    : 0    0   |  *  | |---| |    |");
System.out.println("\t\t:     0____0 :____: 0___0    |     | |   | |___ |___");
System.out.println();
System.out.println("_________________________________________________________________");
System.out.println();
System.out.println("Enter your name");
name=in.readLine();
System.out.println();
System.out.println("\t1 - Mc Donalds");
System.out.println("\t2 - KFC");
System.out.println();
System.out.println("Enter your choice number");
choice=Integer.parseInt(in.readLine());
System.out.println();
System.out.println("************--------------------------************");
switch(choice)
{
case 1:
{
System.out.println("\t\t MC DONALDS");
System.out.println("************--------------------------************");
System.out.println();
while(mc.equalsIgnoreCase("y"))
{
for(i=0;i<6;i++)
{
System.out.println("\t"+(i+1)+"---"+mcmenu[i]);
}
System.out.println();
System.out.println("Enter your choice number");
mcch=Integer.parseInt(in.readLine());
System.out.println("___________________________________________________");
System.out.println();
switch(mcch)
{
case 1:
{
System.out.println("\t\tB-U-R-G-E-R-S");
System.out.println();
for(i=0;i<16;i++)
{
System.out.println("\t"+(i+1)+"---"+ana[i]+"---RS "+ars[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the burger choice you want");
ach=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+ana[ach-1]+" you want");
achno=Integer.parseInt(in.readLine());
aamt=ars[ach-1]*achno;
tamt=aamt+tamt;
System.out.println("would you like to buy any more burgers? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 2:
{
System.out.println("\t\tW-R-A-P-S");
System.out.println();
for(i=0;i<10;i++)
{
System.out.println("\t"+(i+1)+"---"+bna[i]+"---RS "+brs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the wrap choice you want");
bch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+bna[bch-1]+" you want");
bchno=Integer.parseInt(in.readLine());
bamt=brs[bch-1]*bchno;
tamt=tamt+bamt;
System.out.println("would you like to buy any more wraps? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 3:
{
System.out.println("\t\tD-E-S-E-R-T-S");
System.out.println();
for(i=0;i<17;i++)
{
System.out.println("\t"+(i+1)+"---"+cna[i]+"---RS "+crs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the desert choice you want");
cch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+cna[cch-1]+" you want");
cchno=Integer.parseInt(in.readLine());
camt=crs[cch-1]*cchno;
tamt=tamt+camt;
System.out.println("would you like to buy any more deserts? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 4:
{
System.out.println("\t\tB-E-V-E-R-A-G-E-S");
System.out.println();
for(i=0;i<21;i++)
{
System.out.println("\t"+(i+1)+"---"+dna[i]+"---RS "+drs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the beverage choice you want");
dch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+dna[dch-1]+" you want");
dchno=Integer.parseInt(in.readLine());
damt=drs[dch-1]*dchno;
tamt=tamt+damt;
System.out.println("would you like to buy any more beverages? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 5:
{
System.out.println("\t\tM-E-A-L-S");
System.out.println();
for(i=0;i<14;i++)
{
System.out.println("\t"+(i+1)+"---"+ena[i]+"---RS "+ers[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the meal choice you want");
ech=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+ena[ech-1]+" you want");
echno=Integer.parseInt(in.readLine());
eamt=ers[ech-1]*echno;
tamt=tamt+eamt;
System.out.println("would you like to buy any more meals? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 6:
{
System.out.println("\t\tH-A-P-P-Y M-E-A-L-S");
System.out.println();
for(i=0;i<12;i++)
{
System.out.println("\t"+(i+1)+"---"+fna[i]+"---RS "+frs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the happy meal choice you want");
fch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+fna[fch-1]+" you want");
fchno=Integer.parseInt(in.readLine());
aamt=frs[fch-1]*fchno;
tamt=tamt+famt;
System.out.println("would you like to buy any more happy meals? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("___________________________________________________________");
}
break;
}
System.out.println();
System.out.println("Do you want to buy any more?enter y for yes and n for no");
mc=in.readLine(); 
System.out.println("__________________________________________________");
}
System.out.println();
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("**********************************************************************************************************");
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println();
System.out.println("\t\t\t\t @ @ Y O U R -- B I L L @ @");
System.out.println();
System.out.println("\tNAME----"+name);
System.out.println();
System.out.println("\tYour total cost is Rs "+tamt);
vat=Math.round(5.5/100.0*tamt);
System.out.println("\tVat is 5.5%");
System.out.println("\tTotal vat is Rs "+vat);
System.out.println("\tYOUR TOTAL BILL IS Rs "+(tamt+vat));
System.out.println();
System.out.println("--------------------------------------------T H A N K   Y O U---------------------------------------------");
System.out.println("------------------------------------------ MAY YOU VISIT AGAIN -------------------------------------------");
}
break;
case 2:
{
System.out.println("\t\t K F C");
System.out.println("************--------------------------************");
System.out.println();
while(mc.equalsIgnoreCase("y"))
{
for(i=0;i<8;i++)
{
System.out.println("\t"+(i+1)+"---"+kfcmenu[i]);
}
System.out.println();
System.out.println("Enter your choice number");
kfcch=Integer.parseInt(in.readLine());
System.out.println("___________________________________________________");
System.out.println();
switch(kfcch)
{
case 1:
{
System.out.println("\t\tS-N-A-C-K-S");
System.out.println();
for(i=0;i<10;i++)
{
System.out.println("\t"+(i+1)+"---"+mna[i]+"---RS "+mrs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the snack choice you want");
mch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+mna[mch-1]+" you want");
mchno=Integer.parseInt(in.readLine());
mamt=mrs[mch-1]*mchno;
tamt=tamt+mamt;
System.out.println("would you like to buy any more snack? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 2:
{
System.out.println("\t\tB-U-R-G-E-R-S");
System.out.println();
for(i=0;i<6;i++)
{
System.out.println("\t"+(i+1)+"---"+nna[i]+"---RS "+nrs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the burger choice you want");
nch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+nna[nch-1]+" you want");
nchno=Integer.parseInt(in.readLine());
namt=nrs[nch-1]*nchno;
tamt=tamt+namt;
System.out.println("would you like to buy any more burgers? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 3:
{
System.out.println("\t\tT-O-A-S-T-E-D W-R-A-P-S");
System.out.println();
for(i=0;i<2;i++)
{
System.out.println("\t"+(i+1)+"---"+ona[i]+"---RS "+ors[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the toasted wrap choice you want");
och=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+ona[och-1]+" you want");
ochno=Integer.parseInt(in.readLine());
oamt=ors[och-1]*ochno;
tamt=tamt+oamt;
System.out.println("would you like to buy any more toasted wraps? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 4:
{
System.out.println("\t\tB-O-X M-E-A-L");
System.out.println();
for(i=0;i<13;i++)
{
System.out.println("\t"+(i+1)+"---"+pna[i]+"---RS "+prs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the box meal choice you want");
pch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+pna[pch-1]+" you want");
pchno=Integer.parseInt(in.readLine());
pamt=prs[pch-1]*pchno;
tamt=tamt+pamt;
System.out.println("would you like to buy any more box meals? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 5:
{
System.out.println("\t\tD-E-S-E-R-T-S");
System.out.println();
for(i=0;i<5;i++)
{
System.out.println("\t"+(i+1)+"---"+qna[i]+"---RS "+qrs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the desert choice you want");
qch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+qna[qch-1]+" you want");
qchno=Integer.parseInt(in.readLine());
qamt=qrs[qch-1]*qchno;
tamt=tamt+qamt;
System.out.println("would you like to buy any more deserts? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 6:
{
System.out.println("\t\tS-H-A-R-E A B-U-C-K-E-T");
System.out.println();
for(i=0;i<9;i++)
{
System.out.println("\t"+(i+1)+"---"+rna[i]+"---RS "+rrs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the share a bucket choice you want");
rch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+rna[rch-1]+" you want");
rchno=Integer.parseInt(in.readLine());
ramt=rrs[rch-1]*rchno;
tamt=tamt+ramt;
System.out.println("would you like to buy any more share a bucket? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 7:
{
System.out.println("\t\tR-I-C-E B-O-W-L-Z");
System.out.println();
for(i=0;i<2;i++)
{
System.out.println("\t"+(i+1)+"---"+sna[i]+"---RS "+srs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the rice bowl choice you want");
sch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+sna[sch-1]+" you want");
schno=Integer.parseInt(in.readLine());
aamt=srs[sch-1]*schno;
tamt=tamt+samt;
System.out.println("would you like to buy any more rice bowlz? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
case 8:
{
System.out.println("\t\tK-R-U-S-H-E-R-S");
System.out.println();
for(i=0;i<10;i++)
{
System.out.println("\t"+(i+1)+"---"+una[i]+"---RS "+urs[i]);
}
System.out.println();
ama="y";
while(ama.equalsIgnoreCase("y"))
{
System.out.println("Enter the krusher choice you want");
uch=Integer.parseInt(in.readLine());
System.out.println("enter the number of "+una[uch-1]+" you want");
uchno=Integer.parseInt(in.readLine());
uamt=urs[uch-1]*uchno;
tamt=tamt+uamt;
System.out.println("would you like to buy any more krushers? Enter'y'for yes or 'n' for no");
ama=in.readLine();
}
System.out.println("__________________________________________________");
}
break;
}
System.out.println();
System.out.println("Do you want to buy any more?enter y for yes and n for no");
mc=in.readLine();
System.out.println("__________________________________________________");
}
System.out.println();
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("**********************************************************************************************************");
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println();
System.out.println("\t\t\t\t @ @ Y O U R -- B I L L @ @");
System.out.println();
System.out.println("\tNAME--"+name);
System.out.println();
System.out.println("\tYour total cost is Rs "+tamt);
vat=Math.round(5.5/100.0*tamt);
System.out.println("\tVat is 5.5%");
System.out.println("\tTotal vat is Rs "+vat);
System.out.println("\tYOUR TOTAL BILL IS Rs "+(tamt+vat));
System.out.println();
System.out.println("--------------------------------------------T H A N K   Y O U---------------------------------------------");
System.out.println("------------------------------------------ MAY YOU VISIT AGAIN -------------------------------------------");
}
break;
}
}
}