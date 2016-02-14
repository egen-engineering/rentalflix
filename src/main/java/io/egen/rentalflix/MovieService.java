package NetFlix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;

public class MovieService 
{

	public static void main (String[] args){
		int n;
		Movie name;
		List<Movie> movies= new ArrayList <Movie>();
		movies.add(new Movie(1211,"Inception","English",2010));
		movies.add(new Movie(1212,"Avengers","English",2011));
		movies.add(new Movie(1213,"MadMax","English",2015));
		movies.add(new Movie(1214,"Deadpool","English",2016));
		movies.add(new Movie(1215,"GoneGirl","English",2015));
		System.out.println("WELCOME TO RENTALFLIX");
		System.out.println("PLEASE CHOOSE FROM THE FOLLOWING OPTIONS");
		System.out.println("1.VIEW ALL MOVIES");
		System.out.println("2.SERACH FOR A MOVIE BY NAME");
		System.out.println("3.ADD A NEW MOVIE");
		System.out.println("4.DELETE A MOVIE");
		Scanner option = new Scanner(System.in);
 		  System.out.println("ENTER YOUR OPTION");
			int title_option = option.nextInt(); 
			if (title_option == 1)
			{
				MovieService.findAll();	
			}
			else if (title_option == 2)
			{
		findByName(movies);
			}
			else if (title_option == 3)
		 create (name);
			else if (title_option == 4)
			{
			delete(n);
			}
			else
			{
				System.out.println("INVALID OPTION PLEASE CHOOSE A VALID OPTION");	
			}
		}
	
	public static void findAll() {
		List<Movie> name = new ArrayList <Movie>();
		for (Movie n:name){
			System.out.println(n.getId());
			System.out.println(n.getTitle());
		
		}	
	}
	public static Movie create (Movie movie) {
		return null;
	}
		{  String Name;
		 String Stuff;
        {List <Movie> line = new ArrayList <Movie>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 1; i++) {
            Movie p = new <Movie>();
            System.out.println("Enter the id");
            System.out.print("nid: ");
            p.Nid = scanner.nextLine();
            System.out.println("Enter the title");
            System.out.print("Name: ");
           p.Name = scanner.nextLine();
            System.out.print("language: ");
            p.Stuff = scanner.nextLine();
            System.out.println("Enter the year");
            System.out.print("nyear: ");
            p.Nyear = scanner.nextLine();

            line.add(line);
        }

        System.out.println("The following people were added:");
        for(Movie p : line) {
            System.out.println(p);
        }	
        }	
		}
		
  
	public static void findByName (List<Movie> movies)
	{
		 Scanner input = new Scanner(System.in);
		  System.out.println("Please enter the title of the movie:");
            String title_input = input.nextLine(); 
            
		List<Movie> sname = new ArrayList <Movie>();
		
            Iterator <Movie> itr= sname.iterator();
            while (itr.hasNext())
            {
            	Movie m = itr.next();
            	if (m.getTitle().contains(title_input) )
            	{
            		System.out.println(m.getTitle());
            		return;
            	}
            	  else 
                	System.out.println("error");	
            	
            }
      
             /* for (Movie s : sname)
              {
        if (s.getTitle()== title_input)
        {
        	 System.out.println(s.getTitle());
	}
        else 
        	System.out.println("error");	
	
	}*/
	}    
	         public static void delete (int id)
	{
           
            	 Scanner input1 = new Scanner(System.in);
       		  System.out.println("Please enter the title of the movie:");
                   int title_input1 = input1.nextInt(); 
                   
       		List<Movie> sname1 = new ArrayList <Movie>();
       		       for (Movie m:sname1){
       		    	   if (m.getId()== title_input1)
       		    	   { sname1.remove(m);
                  
                   		System.out.println(m.getId());
                   		
                   	}
                   	  else 
                       	System.out.println("error");	
                   	
                   }
            
	
	}}

	