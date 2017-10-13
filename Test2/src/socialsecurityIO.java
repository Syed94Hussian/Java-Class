
import java.util.*;
import java.io.*;
import java.nio.file.*;


public class socialsecurityIO
{
private static final Path Assignmentpath = Paths.get("Assignment.txt"); 
private static final File AssignmentFile = Assignmentpath.toFile();
private static final String FIELD_SEP = "\t"; 
private static List< socialsecurity > data = getAll();



private socialsecurityIO() {}; 


public static List< socialsecurity> getAll()

{
	
	if (data!=null)
	{
		return data;
	}
	
	data = new ArrayList<> ();
	
	if (Files.exists( Assignmentpath))
	{
		try (BufferedReader in = new BufferedReader( new FileReader(AssignmentFile)))
		{
			
			
			String line = in.readLine();
			while (line != null)
			{
				String [] columns = line.split(FIELD_SEP);
				String socialsecuritynum = columns[0];
				String personname = columns[1];
				String address = columns[2];
				String dateofbirth = columns[3];
				
				
				/*  socialsecuritynum = "";
    personname="";
    address = "";
    phonenum = 0;
    dateofbirth = 0;
    email = "";*/
				

				socialsecurity s = new socialsecurity();
				s.setsocialsecuritynum(socialsecuritynum);
				s.setpersonname(personname);
				s.setaddress(address);
				s.setdateofbirth(dateofbirth);
				data.add(s);
				
				line = in.readLine(); 

			}
			
			
		}
		catch(IOException e)
		{
			System.out.println(e);
			return null;
		}
	}
	return data;
} 

public static socialsecurity get(String socialsecurityNum) 
{
	for (socialsecurity s : data)
	{
		if (s.getsocialsecuritynum().equals(socialsecurityNum))
			return s;
	}
	
	return null;
}


private static boolean saveAll()
{
		String socialsecurityFile = null;
		try(PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter(socialsecurityFile))))
	{
		
		
		for (socialsecurity s : data)
		{
			out.print(s.getsocialsecuritynum() + FIELD_SEP);
			out.print(s.getpersonname(null) + FIELD_SEP);
			out.print(s.getaddress() + FIELD_SEP);
			out.print(s.getdateofbirth() + FIELD_SEP);
			
			
		}
	}
	catch(IOException e)
	{
	System.out.println(e);
	return false;
    }
return true;
}
public static boolean add(socialsecurity s)
{
	
	data.add(s);
	return saveAll();
	
	
}

public static boolean delete(socialsecurity s)
{
	
	data.remove(s);
	return saveAll();
	
	
}

public static boolean update(socialsecurity newsocialsecurity)
{
	
	
	socialsecurity oldsocialsecurity = get(newsocialsecurity.getsocialsecuritynum());
	int i = data.indexOf(oldsocialsecurity);
    data.remove(i);


data.add(i, newsocialsecurity);

return saveAll();

}
}
