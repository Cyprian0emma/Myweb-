import java.util.Scanner;
public class Atm
{
	public static void main(String[] args)
	{
		int x;
		System.out.println("1.Angalia salio\n");
		System.out.println("2.Taarifa fupi\n");
		System.out.println("3.Toa pesa\n");
		System.out.println("4.Sim banking\n");

		System.out.println("select your choice");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();

		if(x==1)
		{
			System.out.println("salio lako mi shilingi......");
		}
		else if(x==2)
			{
				System.out.println("ulipokea shilingi kadhaa siku ya jana\n ulitoa kiasi kadhaa siku ya tarehe 12/02.2018");
			}

		else if(x==3)
			{
				System.out.println("andika kiasi");
			}
		else if(x==4)
			{
				System.out.println("andika namba yako ya simu");
			}
		else
			System.out.println("WRONG ENTRY");
	}
}