import java.util.*;

public class Application 
{
	public static void main(String[] args)
	{
		CD cds[];
		Artist a[];
		DVD dvds[];
		Media m[];
		Audio music[];
		
		Scanner user = new Scanner(System.in);
		int choice = 0;
		int numA = 0;
		//MENU
		do
		{
			System.out.println("MENU: ");
			System.out.println("1. Create a CD or DVD.");
			System.out.println("2. List all media.");
			System.out.println("3. List data for a media.");
			System.out.println("4. Look up an artist.");
			System.out.println("5. Play media.");
			System.out.println("6. Find the number of plays.");
			System.out.println("7. Exit.");
			choice = user.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Would you like to create a CD or a DVD?");
				String c = user.nextLine();
				if(c.equals("DVD") || c.equals("dvd"))
				{
					Artist[] sf;
					System.out.println("How many supporting actors are there?");
					int actors = user.nextInt();
					for(int j = 0; j < actors; j++)
					{
						System.out.println("What is the actor's first name?");
						String l = user.nextLine();
						System.out.println("What is the actor's first name?");
						String f = user.nextLine();
						System.out.println("Birthday?");
						String b = user.next();
						System.out.println("Twitter username?");
						String t = user.nextLine();
						System.out.println("URL:");
						String u = user.nextLine();
						//a[numA + 1] = new Artist(l,f,b,t,u);
						//sf[j] = a[numA + 1];
						numA++; //adds new arist
					}
				}
				else if(c.equals("CD") || c.equals("cd"))
				{
					
					System.out.println("Title: " );
					String title = user.nextLine();
					System.out.println("Playing Time: ");
					double play = user.nextDouble();
					System.out.println("What is the artist's first name?");
					String lName = user.nextLine();
					System.out.println("What is the artist's first name?");
					String fName = user.nextLine();
					System.out.println("Birthday?");
					String bday = user.next();
					System.out.println("Twitter username?");
					String tweet = user.nextLine();
					System.out.println("URL:");
					String url = user.nextLine();
					//a[numA] = new Artist(lName,fName,bday,tweet,url);
					System.out.println("Is it a group of members?");
					String yon = user.nextLine();
					int gmem = 0;
					Artist group[];
					if(yon.equals("yes"))
					{
						System.out.println("How many group members are there?");
						gmem = user.nextInt();
						for(int j = 0; j < gmem; j++)
						{
							System.out.println("What is the artist's first name?");
							String l = user.nextLine();
							System.out.println("What is the artist's first name?");
							String f = user.nextLine();
							System.out.println("Birthday?");
							String b = user.next();
							System.out.println("Twitter username?");
							String t = user.nextLine();
							System.out.println("URL:");
							String u = user.nextLine();
							//a[numA + 1] = new Artist(l,f,b,t,u);
							//group[j] = a[numA + 1];
							numA++; //adds new arist
						}
					}
					System.out.println("Producer's last name?");
					String l1 = user.nextLine();
					System.out.println("First name?");
					String f1 = user.nextLine();
					System.out.println("Birthday?");
					String b1 = user.next();
					System.out.println("Twitter username?");
					String t1 = user.nextLine();
					System.out.println("URL:");
					String u1 = user.nextLine();
					//a[numA + 1] = new Artist(l1,f1,b1,t1,u1);
					//Artist producer = a[numA + 1];
					System.out.println("How many songs are there?" );
					int numTracks = user.nextInt();
					for(int i = 0; i < numTracks; i++)
					{
						System.out.println("Song " + i + " is: ");
						String songs = user.nextLine();
						//music[i] = new Audio(title,a[numA],play,0,group,gmem,producer);
					}
					//m[0] = new Media(title,a[numA],play,0);
				}
			}
			else if(choice == 2)
			{
				//for(int i = 0; i < m.length; i++)
				{
					//System.out.println(i + ": " + m[i]);
				}
			}
			else if(choice == 3)
			{
				System.out.println("What number media: ");
				int n = user.nextInt();
				//System.out.println(m[n]);
			}
			else if(choice == 4)
			{
				System.out.println("What number artist: ");
				int n1 = user.nextInt();
				//System.out.println(a[n1]);
			}
			else if(choice == 5)
			{
				System.out.println("What number media would you like to play?: ");
				int n2 = user.nextInt();
				//m[n2].playMedia();
			}
			else if(choice == 6)
			{
				System.out.println("What number media would you like to find the plays for?: ");
				int n3 = user.nextInt();
				//System.out.println("It has been played " + m[n3].getNumPlays() + " times.");
			}
		}while(choice != 7);
	
	}

}
