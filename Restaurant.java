import java.util.*;
class Restaurant
{
	static String username;
	static String pass;
	static String phone;
	static ArrayList<String> cart = new ArrayList<>();
	static double bill;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for( ; ; )
		{
			System.out.println();
			System.out.println("                 ************ WELCOME TO TAJ  *************            ");
			System.out.println();
			System.out.println("1. Sign In ");
			System.out.println("2. Sign up ");
			System.out.println();
			System.out.println("Enter an option : ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1: createaccount(sc);
				break;
				case 2: login(sc);
				break;
				default:
   				System.out.println("Wrong option entered ");
			}
		}
	}
		
	public static void createaccount(Scanner sc)
	{
			System.out.println();
			System.out.println("Create Account ");
			System.out.println();
			System.out.print("Username : ");
			sc.nextLine();
			username=sc.nextLine();
			System.out.print("Password ");
			pass=sc.next();
			System.out.print("Contact Number ");
			phone = sc.next();
			System.out.println();
			System.out.println("Acccount Created ");
			System.out.println();

	}
	public static void login(Scanner sc)
	{
		if(username != null)
		{
			for(int i=1; i<=3; i++)
			{
				System.out.println();
				System.out.println("Login Page");
				System.out.println();
				System.out.println(" Username/Contact : ");
				sc.nextLine();
				String un1 = sc.nextLine();
				System.out.println("Password : ");
				String pass1 = sc.next();
				
				if( ((un1.equals(username)) || (un1.equals(phone))) && (pass1.equals(pass))) 
				{
					homepage(sc);
				}
				else
				{
					System.out.println();
					System.out.println("wrong cred entered");
					System.out.println();
				}
			}
			System.exit(0);
		}
		else
		{
			System.out.println("Create your account first");
		}
	}
	public static void homepage(Scanner sc)
	{
		for( ; ; )
		{
			System.out.println();
			System.out.println("Home Page");
			System.out.println();
			System.out.println(" 1. VEG MENU");
			System.out.println(" 2. NON-VEG MENU");
			System.out.println(" 3. CHECKOUT ");
			System.out.println(" 4. LOGOUT ");
			System.out.println();
			System.out.print("Enter an option :- ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1: vegmenu(sc); break;
				case 2: nonvegmenu(sc); break;
				case 3: checkout(sc); break;
				case 4: System.exit(0); System.out.println("Thank you never visit again"); break;
				default : System.out.print("Wrong option "); break;
			}
		}
	}
				
	public static void vegmenu( Scanner sc )
	{
		System.out.println();
		System.out.println("VEG DISHES");
		System.out.println(" 101. Puranpoli : 200 ");
		System.out.println(" 102. PavBhaji : 300");
		System.out.println(" 103. Aloo Paratha : 200");
		System.out.println(" 104. Pizza : 250");
		System.out.println(" 105. Pasta : 300 ");
		System.out.println(" 106. Mneu");
		System.out.println();
		System.out.println("Enter a dish Id :- ");
		int id = sc.nextInt();
		switch(id)
		{
			case 101: cart.add("Puranpoli : 200");
					bill+=200;
					System.out.println("Puranpoli added inside cart"); 
					break;
			case 102: cart.add("Pavbhaji : 300");
					bill+=300;
					System.out.println("Pavbhaji added inside cart"); 
					break;
			case 103: cart.add("Aloo Paratha : 200");
					bill+=200;
					System.out.println("Aloo Paratha added inside cart"); 
					break;
			case 104: cart.add("Pizza : 250");
					bill+=250;
					System.out.println("Pizza added inside cart"); 
					break;
			case 105: cart.add("Pasta : 300");
					bill+=300;
					System.out.println("Pasta added inside cart"); 
					break;
			case 106: return;
			default: System.out.println("Wrong dish id");
		}
	}
	public static void nonvegmenu( Scanner sc )
	{
		System.out.println();
		System.out.println("NON VEG DISHES");
		System.out.println(" 107. CHICKEN 65 : 200 ");
		System.out.println(" 108. CHICKEN NOODLES : 300");
		System.out.println(" 109. CHICKEN BIRYANI : 350");
		System.out.println(" 106. Menu :");
		System.out.println("Enter a dish Id :- ");
		int id = sc.nextInt();
		switch(id)
		{
			case 107: cart.add("chicken 65 : 200");
					bill+=200;
					System.out.println("chicken 65 added inside cart"); 
					break;
			case 108: cart.add("chicken noodles : 300");
					bill+=300;
					System.out.println("chicken noodles added inside cart"); 
					break;
			case 109: cart.add("chicken biryani : 200");
					bill+=200;
					System.out.println("chicken biryani added inside cart"); 
					break;
			case 106: return;
			default: System.out.println("Wrong dish id");
		}
	}
	public static void cart()
	{
		System.out.println("YOUR PURCHASED FOOD :");
		System.out.println();
		for( String food : cart)
		{
			System.out.println(food);
		}

		System.out.println();
		System.out.println("Your total bill is : "+bill+" rs");
		System.out.println();
	}
	public static void checkout(Scanner sc )
	{
		System.out.println("checkout tomorrow");
		cart();
	}
}
		
		


		






