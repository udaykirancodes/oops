import java.util.Scanner;
class EmailShop
{
	public static void main(String args[])
	{
		int i,n;
		Scanner in=new Scanner(System.in);
		Product p[]=new Product[5];
		for(i=0;i<5;++i)
			p[i]=new Product(i);       //here id and product number is same i.e., 0th product has an id 0

		System.out.println("how many products you have bought");
		n=in.nextInt();
		int id_entered[]=new int[n];

		for(i=0;i<n;i++)
		{
			System.out.println("Enter product id(0 to 4), quantity sold");
			id_entered[i]=in.nextInt();// to know which products are bought and calculate total price
			p[id_entered[i]].quantity=in.nextInt();   //since 0th pruct has id 0 and so on
		}

		for(i=0;i<5;++i)
		{
			switch(i)
			{
				case 0 : p[i].price=99.9;
				         break;
				case 1 : p[i].price=20.2;
			             break;
				case 2 : p[i].price=6.87;
			             break;
				case 3 : p[i].price=45.5;
				         break;
				case 4 : p[i].price=40.49;
				         break;
			}
		}
		/*for(i=0;i<n;i++)
		{
			System.out.println(p[id_entered[i]].price);
		}*/

		double bill=0;
		for(i=0;i<n;++i)
			bill=bill+p[id_entered[i]].totalprice();
		System.out.println("total retail price = "+bill);
 	}
}