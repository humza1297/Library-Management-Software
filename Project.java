import java.io.*; 
import java.util.Scanner; 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;


public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		while(true) {
	    System.out.println("Enter 1 for signup and 2 for signin and 3 to Exit the Program");
	    String choice1 = myObj.nextLine();
	    if (choice1.equals("1")) {
	    	System.out.println("You have chosen to Signup.");
	    	System.out.println("Enter 1 for Admin, 2 for Student ,3 for Staff and 4 for Faculty");
	    	String choice2 = myObj.nextLine();
	    	if (choice2.equals("1")) {
	    		System.out.println("Enter Name");
	    		String name = myObj.nextLine();
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		Admin x = new Admin();
		    	String y=x.signup(name,username, password);
		    	System.out.println(y);
	    	}

	    	else if (choice2.equals("2")) {
	    		System.out.println("Enter Name");
	    		String name = myObj.nextLine();
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		System.out.println("Enter rollno");
	    		String rollno = myObj.nextLine();
	    		Student x = new Student();
		    	String y=x.signup(name,username, password,rollno);
		    	System.out.println(y);

	    	}

	    	else if (choice2.equals("3")) {
	    		System.out.println("Enter Name");
	    		String name = myObj.nextLine();
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		System.out.println("Enter Position");
	    		String position = myObj.nextLine();
	    		Staff x = new Staff();
		    	String y=x.signup(name,username,password,position);
		    	System.out.println(y);
	    	}
	    	else if (choice2.equals("4")) {
	    		System.out.println("Enter Name");
	    		String name = myObj.nextLine();
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		System.out.println("Enter Position");
	    		String position = myObj.nextLine();
	    		System.out.println("Enter Department");
	    		String department = myObj.nextLine();
	    		Faculty x = new Faculty();
		    	String y=x.signup(name,username, password,position,department);
		    	System.out.println(y);
	    	}
	    	else {
	    		System.out.println("Entered value is incorrect.");
	    	}
	    }
	    else if (choice1.equals("2")) {
	    	System.out.println("You have chosen to Signin.");
	    	System.out.println("Enter 1 for Admin, 2 for Student ,3 for Faculty and 4 for Staff");
	    	String choice2 = myObj.nextLine();
	    	if (choice2.equals("1")) {
	    		System.out.println("You have chosen Admin Signin.");
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		Admin x = new Admin();
		    	String y=x.signin(username,password);
		    	
		    	if (y.equals("")==false) {
		    		System.out.println("Signin Successful.");
		    		while (true) {
		    			System.out.println("Enter 1 for Add book, 2 for delete book ,3 for Calculate fine and 4 for Get Personal Info and 5 for Signout");
		    	    	String choice3 = myObj.nextLine();
		    	    	if (choice3.equals("1")) {
		    	    		System.out.println("You have chosen to add a book ");
		    	    		System.out.println("Enter Book name");
		    	    		String bname = myObj.nextLine();
		    	    		System.out.println("Enter Author name");
		    	    		String authorname = myObj.nextLine();
		    	    		System.out.println("Enter ISSN");
		    	    		String ISSN = myObj.nextLine();
		    	    		boolean addbook = x.add_book(bname, authorname, ISSN);
		    	    		if (addbook==true) {
		    	    			System.out.println("Book has been added successfully.");
		    	    		}
		    	    		else if (choice3.equals("2")) {
			    	    		System.out.println("You have chosen to delete a book ");
			    	    		System.out.println("Enter Book name");
			    	    		String deletename = myObj.nextLine();
			    	    		String deletebook = x.delete_book(deletename);
			    	    		System.out.println(deletebook);

		    	    		}
		    	    		else if (choice3.equals("3")) {
			    	    		System.out.println("You have chosen to calculate fine.");
			    	    		System.out.println("Enter Person name");
			    	    		String personname = myObj.nextLine();
			    	    		System.out.println("Enter 1 for Student 2 for Staff and 3 for Faculty.");
			    	    		String category = myObj.nextLine();
			    	    		String fine = x.calculate_fine(personname,category);
			    	    		System.out.println(fine);

		    	    		}
		    	    		else if (choice3.equals("4")) {
			    	    		System.out.println("You have get personal data.");
			    	    		String data = x.getInfo(y);
			    	    		System.out.println(data);

		    	    		}
		    	    	else if (choice3.equals("5")) {
		    				System.out.println("Signed out Successfully.");
		    				break;
		    			}
		    		}
		    	}
	    	}

	    }
	    	else if (choice2.equals("2")) {
	    		System.out.println("You have chosen Student Signin.");
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		Student x = new Student();
		    	String y=x.signin(username,password);
		    	
		    	if (y.equals("")==false) {
		    		System.out.println("Signin Successful.");
		    		while (true) {
		    			System.out.println("Enter 1 for Get book, 2 for Return book ,3 for Get Book Due Date and 4 for Get Personal Info and 5 for Signout");
		    	    	String choice3 = myObj.nextLine();
		    	    	if(choice3.equals("1")) {
		    	    		System.out.println("You have chosen to Get a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String getbook = x.get_book(book, y);
		    	    		if (getbook.equals("yes")) {
		    	    			System.out.println("Book has been obtained Successfully.");
		    	    		}
		    	    		else {
		    	    			System.out.println(getbook);
		    	    		}	
		    	    	}
		    	    	else if (choice3.equals("2")) {
		    	    		System.out.println("You have chosen to return a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String returnbook = x.return_book(book, y);
		    	    		System.out.println(returnbook);
		    	    	}
		    	    	else if (choice3.equals("3")) {
		    	    		System.out.println("You have chosen to check duedate of a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String duedate = x.getduedate(book);
		    	    		System.out.println(duedate);
		    	    		}
		    	    	else if (choice3.equals("4")) {
		    	    		System.out.println("You have chosen to check Personal Info.");
		    	    		String info = x.getInfo(y);
		    	    		System.out.println(info);
		    	    		}
		    	    	else if (choice3.equals("5")) {
		    	    		System.out.println("Signed out Successfully.");
		    	    		break;
		    	    	}
		    	    	else {
		    	    		System.out.println("Entered value is incorrect.");
		    	    	}
		    			}
		    	}
		    		}
	    	else if (choice2.equals("3")) {
	    		System.out.println("You have chosen Staff Signin.");
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		Staff x = new Staff();
		    	String y=x.signin(username,password);
		    	
		    	if (y.equals("")==false) {
		    		System.out.println("Signin Successful.");
		    		while (true) {
		    			System.out.println("Enter 1 for Get book, 2 for Return book ,3 for Get Book Due Date and 4 for Get Personal Info and 5 for Signout");
		    	    	String choice3 = myObj.nextLine();
		    	    	if(choice3.equals("1")) {
		    	    		System.out.println("You have chosen to Get a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String getbook = x.get_book(book, y);
		    	    		if (getbook.equals("yes")) {
		    	    			System.out.println("Book has been obtained Successfully.");
		    	    		}
		    	    		else {
		    	    			System.out.println(getbook);
		    	    		}	
		    	    	}
		    	    	else if (choice3.equals("2")) {
		    	    		System.out.println("You have chosen to return a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String returnbook = x.return_book(book, y);
		    	    		System.out.println(returnbook);
		    	    	}
		    	    	else if (choice3.equals("3")) {
		    	    		System.out.println("You have chosen to check duedate of a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String duedate = x.getduedate(book);
		    	    		System.out.println(duedate);
		    	    		}
		    	    	else if (choice3.equals("4")) {
		    	    		System.out.println("You have chosen to check Personal Info.");
		    	    		String info = x.getInfo(y);
		    	    		System.out.println(info);
		    	    		}
		    	    	else if (choice3.equals("5")) {
		    	    		System.out.println("Signed out Successfully.");
		    	    		break;
		    	    	}
		    	    	else {
		    	    		System.out.println("Entered value is incorrect.");
		    	    	}
		    			}
		    	}
		    		}
	    	else if (choice2.equals("4")) {
	    		System.out.println("You have chosen Student Signin.");
	    		System.out.println("Enter Username");
	    		String username = myObj.nextLine();
	    		System.out.println("Enter Password");
	    		String password = myObj.nextLine();
	    		Faculty x = new Faculty();
		    	String y=x.signin(username,password);
		    	
		    	if (y.equals("")==false) {
		    		System.out.println("Signin Successful.");
		    		while (true) {
		    			System.out.println("Enter 1 for Get book, 2 for Return book ,3 for Get Book Due Date and 4 for Get Personal Info and 5 for Signout");
		    	    	String choice3 = myObj.nextLine();
		    	    	if(choice3.equals("1")) {
		    	    		System.out.println("You have chosen to Get a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String getbook = x.get_book(book, y);
		    	    		if (getbook.equals("yes")) {
		    	    			System.out.println("Book has been obtained Successfully.");
		    	    		}
		    	    		else {
		    	    			System.out.println(getbook);
		    	    		}	
		    	    	}
		    	    	else if (choice3.equals("2")) {
		    	    		System.out.println("You have chosen to return a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String returnbook = x.return_book(book, y);
		    	    		System.out.println(returnbook);
		    	    	}
		    	    	else if (choice3.equals("3")) {
		    	    		System.out.println("You have chosen to check duedate of a Book.");
		    	    		System.out.println("Enter Book name");
		    	    		String book = myObj.nextLine();
		    	    		String duedate = x.getduedate(book);
		    	    		System.out.println(duedate);
		    	    		}
		    	    	else if (choice3.equals("4")) {
		    	    		System.out.println("You have chosen to check Personal Info.");
		    	    		String info = x.getInfo(y);
		    	    		System.out.println(info);
		    	    		}
		    	    	else if (choice3.equals("5")) {
		    	    		System.out.println("Signed out Successfully.");
		    	    		break;
		    	    	}
		    	    	else {
		    	    		System.out.println("Entered value is incorrect.");
		    	    	}
		    			}
		    	}
		    		}
	    	else {
	    		System.out.println("Ented value is incorrect");
	    	}
	    	}
	    else if (choice1.equals("3")){
    	System.out.println("Exited Successfully.");
    	break;
    }
    else {
    	System.out.println("Entered choice is invalid.");
    }
		}
		myObj.close();
		}
	}



interface Person{
    public String getInfo(String name);
}
interface Account{
	abstract String signin(String username,String password);
	
}
class Admin implements Account{


	public String signin(String username,String password) {
		{
			String name="";
			try {	
				FileReader fu = new FileReader("Admin.txt");
				
				String curuser;
				BufferedReader br = new BufferedReader(fu);
				while ((curuser=br.readLine()) != null) {
					if (curuser.contains(username)==true && curuser.contains(password)==true) {
						break;
					}
				}
				for (int i = 0;i<=curuser.length();i++) {
					if (curuser.charAt(i)==',') {
						break;
					}
					else {
						name+=curuser.charAt(i);
					}
				}
				br.close();
				}
			catch(Exception e){
				System.out.println(e);
			}

			return name;
			}
	}
	//---------------------------------------------------------------------------//
	public String signup(String name,String username,String password) {
		// TODO Auto-generated method stub
		try {
		FileWriter fu = new FileWriter("Admin.txt",true);
		fu.write("\n"+name + "," + username + "," + password);
		fu.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "Signup is Successful.";
		
	}
	//---------------------------------------------------------------------------//
	public  boolean add_book(String name,String author,String ISSN) {
		boolean book_added;
		try {
		FileWriter fw = new FileWriter("library.txt",true);
		fw.write(name + ","+ author + "," + ISSN + "\n");
		fw.close();
		book_added=true;
		}
		catch(Exception e) {
			System.out.print(e);
			book_added=false;
		}
		return book_added;
	}
	//---------------------------------------------------------------------------//
	public String check_book(String name) {
		String isAvailable = "Yes";
		String isBook=null;
		String curline;
		String chk_book = "ok"; 
		try {
		FileReader fr = new FileReader("library.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((curline=br.readLine()) != null) {
			if (curline.contains(name)==true)
			{
				isBook="Yes";
			}
		}
		br.close();
		if (isBook=="Yes" && chk_book != null) {
			FileReader fs= new FileReader("stu_check_book.txt");
			BufferedReader fsb = new BufferedReader(fs);
			curline = null;
			
			isAvailable="Yes";
			while((curline=fsb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fsb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader fst= new FileReader("staff_check_book.txt");
			BufferedReader fstb = new BufferedReader(fst);
			curline = null;
			isAvailable="Yes";
			while((curline=fstb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fstb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader ff= new FileReader("faculty_check_book.txt");
			BufferedReader ffb = new BufferedReader(ff);
			curline = null;
			isAvailable="Yes";
			while((curline=ffb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			ffb.close();
		}
			
		
		if (isAvailable == null && isBook!=null) {
			System.out.println("Book isn't available");
			isAvailable = "No";
			
		}
		if (isBook == null) {
			System.out.println("There is no Book with that name.");
			isAvailable="No";
		}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return isAvailable;
	}
	//---------------------------------------------------------------------------//
	public String delete_book(String name) {
		String curline; 
		boolean isbook = true;
		String val = null;
		int i=0;
		String[] books = new String[100];
		try {
			FileReader fr = new FileReader("library.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if(curline.contains(name)==true) {
					isbook = false;
				}
				else {
					books[i]=curline;
					i++;
				}
			}
			br.close();
			i=0;
			FileWriter fw = new FileWriter("library.txt");
			while(i<books.length && books[i]!=null) {
				if (i==0) {
				fw.write(books[i]);
				i++;
				}
				else{
					fw.write("\n" + books[i]);
					i++;
					
				}
				}
			fw.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		if (isbook == true) {
			val = "There is no book with that name";
		}
		else {
			val = "The selected book has been deleted";
		}
		return val;
		
	}
	//---------------------------------------------------------------------------//
	public String calculate_fine(String name,String category) {
		String file = "";		
		int fine=0;
		String curline;
		String date = "";
		String val="";
		if (category.equals("1")) {
			file = "stu_check_book.txt";
		}
		else if (category.equals("2")) {
			file = "staff_check_book.txt";
		}
		else if (category.equals("3")) {
			file = "faculty_check_book.txt";
		}
		else{
			System.out.println("Invalid Entry");
		}
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while ((curline=br.readLine())!=null) {
			if(curline.contains(name)==true) {
				date = "";
				int j=0;
				for (int i =0;i<curline.length();i++) {
					
					if (curline.charAt(i)==',') {
						j++;
						i++;
					}
					if(j==2) {
						date+=curline.charAt(i);
					}
				}
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = new Date();
			String date2 = sdf.format(date1);
			if (date!="") {
				if(sdf.parse(date2).before(sdf.parse(date))) {
				fine+=20;
			}
				}

		}
		
		fr.close();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if (fine!=0) {
			val = name+ " has current fine: " + String.valueOf(fine);
		}
		else{
			val = "There is no fine.";
		}
		return val;
	}
	public String getInfo(String name) {
		String val ="";
		String uname="";
		String password = "";
		String curline;
		try {
			FileReader fr = new FileReader("Admin.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j = 0;
					for (int i=0;i<curline.length();i++) {
						if(curline.charAt(i)==',') {
							j++;
							i++;
						}
						if (j==1) {
							uname+=curline.charAt(i);
						}
						else if (j==2) {
							password+=curline.charAt(i);
						}
					}
				}
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		val =name +" has a username of "+uname+ " and a password "+ password;
		return val;
	}
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------//
class Student implements Person,Account {

	public String signin(String username,String password) {
		{
			String name="";
			try {	
				FileReader fu = new FileReader("Student.txt");
				
				String curuser;
				BufferedReader br = new BufferedReader(fu);
				while ((curuser=br.readLine()) != null) {
					if (curuser.contains(username)==true && curuser.contains(password)==true) {
						break;
					}
				}
				for (int i = 0;i<=curuser.length();i++) {
					if (curuser.charAt(i)==',') {
						break;
					}
					else {
						name+=curuser.charAt(i);
					}
				}
				br.close();
				}
			catch(Exception e){
				System.out.println(e);
			}

			return name;
			}
	}


	public String signup(String name,String username,String password,String rollno) {
		// TODO Auto-generated method stub
		try {
		FileWriter fu = new FileWriter("Student.txt",true);
		fu.write("\n"+name + "," + username + "," + password+","+rollno+",0");
		fu.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "Signup is Successful.";
		
	}
	public String getduedate(String bookname) {
		String date = "";
		String curline;
		String val="";
		try {
			FileReader fr = new FileReader("stu_check_book.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if(curline.contains(bookname)==true) {
					int j = 0;
					for (int i =0;i<curline.length();i++) {
						if(j==2) {
							date+=curline.charAt(i);
						}
						if(curline.charAt(i)==',') {
							j++;
						}
					}
				}
			}
			br.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if (date.equals("")==false) {
			val = "The return date of the book is "+ date;
		}
		else {
			val = "The book is not checked out.";
		}
		return val;
		}
	public void updatecheckedbook(String name,String current_chk_book){
		String[] person = new String[100];
		String curline;
		String person1 = "";
		int loop = 0;
		try {
			FileReader fr = new FileReader("Student.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j =0;
					for(int i =0;i<curline.length();i++) {
						if (curline.charAt(i)==',') {
							j++;
						}
						if (j!=4) {
							person1+=curline.charAt(i);
						}
					}
					person1+=","+current_chk_book;
					
				}
				if (person1.equals("")==true) {
					person[loop]=curline;
					loop++;
					
				}
				else {
					person[loop]=person1;
					person1="";
					loop++;
				}
					
			}
			br.close();
			FileWriter fw = new FileWriter("Student.txt");
			int i =0;
			while(i<person.length && person[i]!=null) {
				fw.write(person[i]);
				i++;
			}
			fw.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
    public String get_book(String name,String pname) {
		String isAvailable = "Yes";
		String isBook=null;
		String curline;
		String chk_book = "ok"; 
		int total_books_checked = 4;
		int current_books_checked;
		String value="";
		try {
		FileReader fss = new FileReader("Student.txt");
		BufferedReader bss = new BufferedReader(fss);
		while ((curline=bss.readLine()) != null) {
			if (curline.contains(pname)){
				break;
			}
		}
		bss.close();
		int j=0;
		for (int i=0 ; i<curline.length();i++) {
			if (j==4) {
				value+=curline.charAt(i);
				
			}
			else if (curline.charAt(i)== ','){
				j++;
			}
		}
		current_books_checked = Integer. parseInt(value);
		FileReader fr = new FileReader("library.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((curline=br.readLine()) != null) {
			if (curline.contains(name)==true)
			{
				isBook="Yes";
			}
		}
		br.close();
		if (isBook=="Yes" && chk_book != null) {
			FileReader fs= new FileReader("stu_check_book.txt");
			BufferedReader fsb = new BufferedReader(fs);
			curline = null;
			
			isAvailable="Yes";
			while((curline=fsb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fsb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader fst= new FileReader("staff_check_book.txt");
			BufferedReader fstb = new BufferedReader(fst);
			curline = null;
			isAvailable="Yes";
			while((curline=fstb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fstb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader ff= new FileReader("faculty_check_book.txt");
			BufferedReader ffb = new BufferedReader(ff);
			curline = null;
			isAvailable="Yes";
			while((curline=ffb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			ffb.close();
		}
			
		
		if (isAvailable == null && isBook!=null) {
			System.out.println("Book isn't available");
			isAvailable = "No";
			
		}
		if (isBook == null) {
			System.out.println("There is no Book with that name.");
			isAvailable="No";
		}
        LocalDate curDate = LocalDate.now();

		if (isAvailable=="Yes" && current_books_checked<total_books_checked) {
			FileWriter fw=new FileWriter("stu_check_book.txt",true);
			fw.write("\n" + pname + "," + name + "," + curDate.plusDays(15));
			fw.close();
			current_books_checked++;
			String cbc = String.valueOf(current_books_checked);
			updatecheckedbook(pname,cbc);
		}

		
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return isAvailable;
	}
    
    public String return_book(String name,String pname) {
		String curline;
		int current_books_checked=0;
		String value="";
		String val = null;
		int i=0;
		String[] books = new String[100];
		try {
		FileReader fss = new FileReader("Student.txt");
		BufferedReader bss = new BufferedReader(fss);
		while ((curline=bss.readLine()) != null) {
			if (curline.contains(pname)){
				val = "yes";
				break;
			}
		}
		bss.close();
		int j=0;
		for (int i1=0 ; i1<curline.length();i1++) {
			if (j==4) {
				value+=curline.charAt(i1);
				
			}
			else if (curline.charAt(i1)== ','){
				j++;
			}
		}
		current_books_checked = Integer. parseInt(value);

		FileReader fr = new FileReader("stu_check_book.txt");
		BufferedReader br = new BufferedReader(fr);
		while((curline=br.readLine())!=null) {
			if(curline.contains(name)==true) {
				continue;
			}
			else {
				books[i]=curline;
				i++;
			}
		}
		br.close();
		i=0;
		FileWriter fw = new FileWriter("stu_check_book.txt");
		while(i<books.length && books[i]!=null) {
			if (i==0) {
			fw.write(books[i]);
			i++;
			}
			else{
				fw.write("\n" + books[i]);
				i++;
				
			}
			}
		fw.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		if (val.equals("yes")) {
			val = "Book has been returned successfully";
			current_books_checked--;
			String cbc = String.valueOf(current_books_checked);
			updatecheckedbook(pname,cbc);
		
		}
		else {
			val = "Person doenst have this book";
		}
		return val;
	}

	public String getInfo(String name) {
		String val ="";
		String uname="";
		String password = "";
		String curline;
		String rollno="";
		String books="";
		try {
			FileReader fr = new FileReader("Student.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j = 0;
					for (int i=0;i<curline.length();i++) {
						if(curline.charAt(i)==',') {
							j++;
							i++;
						}
						if (j==1) {
							uname+=curline.charAt(i);
						}
						else if (j==2) {
							password+=curline.charAt(i);
						}
						else if (j==3) {
							rollno+=curline.charAt(i);
						}
						else if (j==4) {
							books+=curline.charAt(i);
						}
					}
				}
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		val =name +" has a username of "+uname+ " and a password "+ password + " and a rollno " + rollno + " and has books "+ books;
		return val;
	}
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------//

class Staff implements Account,Person{
	public String signin(String username,String password) {
		{
			String name="";
			try {	
				FileReader fu = new FileReader("Staff.txt");
				
				String curuser;
				BufferedReader br = new BufferedReader(fu);
				while ((curuser=br.readLine()) != null) {
					if (curuser.contains(username)==true && curuser.contains(password)==true) {
						break;
					}
				}
				for (int i = 0;i<=curuser.length();i++) {
					if (curuser.charAt(i)==',') {
						break;
					}
					else {
						name+=curuser.charAt(i);
					}
				}
				br.close();
				}
			catch(Exception e){
				System.out.println(e);
			}

			return name;
			}
	}


	public String signup(String name,String username,String password,String position) {
		// TODO Auto-generated method stub
		try {
		FileWriter fu = new FileWriter("Staff.txt",true);
		fu.write("\n"+name + "," + username + "," + password+","+position);
		fu.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "Signup is Successful.";
		
	}
	public void updatecheckedbook(String name,String current_chk_book){
		String[] person = new String[100];
		String curline;
		String person1 = "";
		int loop = 0;
		try {
			FileReader fr = new FileReader("Staff.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j =0;
					for(int i =0;i<curline.length();i++) {
						if (curline.charAt(i)==',') {
							j++;
						}
						if (j!=4) {
							person1+=curline.charAt(i);
						}
					}
					person1+=","+current_chk_book;
					
				}
				if (person1.equals("")==true) {
					person[loop]=curline;
					loop++;
					
				}
				else {
					person[loop]=person1;
					person1="";
					loop++;
				}
					
			}
			br.close();
			FileWriter fw = new FileWriter("Staff.txt");
			int i =0;
			while(i<person.length && person[i]!=null) {
				fw.write(person[i]);
				i++;
			}
			fw.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	public String getduedate(String bookname) {
		String date = "";
		String curline;
		String val="";
		try {
			FileReader fr = new FileReader("staff_check_book.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if(curline.contains(bookname)==true) {
					int j = 0;
					for (int i =0;i<curline.length();i++) {
						if(j==2) {
							date+=curline.charAt(i);
						}
						if(curline.charAt(i)==',') {
							j++;
						}
					}
				}
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if (date.equals("")==false) {
			val = "The return date of the book is "+ date;
		}
		else {
			val = "The book is not checked out.";
		}
		return val;
		}
	
	public String get_book(String name,String pname) {
		String isAvailable = "Yes";
		String isBook=null;
		String curline;
		String chk_book = "ok"; 
		int total_books_checked = 6;
		int current_books_checked;
		String value="";
		try {
		FileReader fss = new FileReader("Staff.txt");
		BufferedReader bss = new BufferedReader(fss);
		while ((curline=bss.readLine()) != null) {
			if (curline.contains(pname)){
				break;
			}
		}
		bss.close();
		int j=0;
		for (int i=0 ; i<curline.length();i++) {
			if (j==4) {
				value+=curline.charAt(i);
				
			}
			else if (curline.charAt(i)== ','){
				j++;
			}
		}
		current_books_checked = Integer. parseInt(value);
		FileReader fr = new FileReader("library.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((curline=br.readLine()) != null) {
			if (curline.contains(name)==true)
			{
				isBook="Yes";
			}
		}
		br.close();
		if (isBook=="Yes" && chk_book != null) {
			FileReader fs= new FileReader("stu_check_book.txt");
			BufferedReader fsb = new BufferedReader(fs);
			curline = null;
			
			isAvailable="Yes";
			while((curline=fsb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fsb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader fst= new FileReader("staff_check_book.txt");
			BufferedReader fstb = new BufferedReader(fst);
			curline = null;
			isAvailable="Yes";
			while((curline=fstb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fstb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader ff= new FileReader("faculty_check_book.txt");
			BufferedReader ffb = new BufferedReader(ff);
			curline = null;
			isAvailable="Yes";
			while((curline=ffb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			ffb.close();
		}
			
		
		if (isAvailable == null && isBook!=null) {
			System.out.println("Book isn't available");
			isAvailable = "No";
			
		}
		if (isBook == null) {
			System.out.println("There is no Book with that name.");
			isAvailable="No";
		}
        LocalDate curDate = LocalDate.now();

		if (isAvailable=="Yes" && current_books_checked<total_books_checked) {
			FileWriter fw=new FileWriter("staff_check_book.txt",true);
			fw.write("\n" + pname + "," + name + "," + curDate.plusDays(20));
			fw.close();
			current_books_checked++;
			String cbc = String.valueOf(current_books_checked);
			updatecheckedbook(pname,cbc);
		}

		}
		catch(Exception e) {
			System.out.print(e);
		}
		return isAvailable;
	}
	public String return_book(String name,String pname) {
		String curline;
		int current_books_checked=0;
		String value="";
		String val = null;
		int i=0;
		String[] books = new String[100];
		try {
		FileReader fss = new FileReader("Staff.txt");
		BufferedReader bss = new BufferedReader(fss);
		while ((curline=bss.readLine()) != null) {
			if (curline.contains(pname)){
				val = "yes";
				break;
			}
		}
		bss.close();
		int j=0;
		for (int i1=0 ; i1<curline.length();i1++) {
			if (j==4) {
				value+=curline.charAt(i1);
				
			}
			else if (curline.charAt(i1)== ','){
				j++;
			}
		}
		current_books_checked = Integer. parseInt(value);

		FileReader fr = new FileReader("staff_check_book.txt");
		BufferedReader br = new BufferedReader(fr);
		while((curline=br.readLine())!=null) {
			if(curline.contains(name)==true) {
				continue;
			}
			else {
				books[i]=curline;
				i++;
			}
		}
		br.close();
		i=0;
		FileWriter fw = new FileWriter("staff_check_book.txt");
		while(i<books.length && books[i]!=null) {
			if (i==0) {
			fw.write(books[i]);
			i++;
			}
			else{
				fw.write("\n" + books[i]);
				i++;
				
			}
			}
		fw.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		if (val.equals("yes")) {
			val = "Book has been returned successfully";
			current_books_checked--;
			String cbc = String.valueOf(current_books_checked);
			updatecheckedbook(pname,cbc);
		
		}
		else {
			val = "Person doenst have this book";
		}
		return val;
	}
	public String getInfo(String name) {
		String val ="";
		String uname="";
		String password = "";
		String curline;
		String position="";
		String books = "";
		try {
			FileReader fr = new FileReader("Staff.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j = 0;
					for (int i=0;i<curline.length();i++) {
						if(curline.charAt(i)==',') {
							j++;
							i++;
						}
						if (j==1) {
							uname+=curline.charAt(i);
						}
						else if (j==2) {
							password+=curline.charAt(i);
						}
						else if (j==3) {
							position+=curline.charAt(i);
						}
						else if (j==4) {
							position+=curline.charAt(i);
						}
					}
				}
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		val =name +" has a username of "+uname+ " and a password "+ password + " and position " + position + " and has books "+ books;
		return val;
	}
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------//
class Faculty implements Account,Person {
	public String signin(String username,String password) {
		{
			String name="";
			try {	
				FileReader fu = new FileReader("Faculty.txt");
				
				String curuser;
				BufferedReader br = new BufferedReader(fu);
				while ((curuser=br.readLine()) != null) {
					if (curuser.contains(username)==true && curuser.contains(password)==true) {
						break;
					}
				}
				for (int i = 0;i<=curuser.length();i++) {
					if (curuser.charAt(i)==',') {
						break;
					}
					else {
						name+=curuser.charAt(i);
					}
				}
				br.close();
				}
			catch(Exception e){
				System.out.println(e);
			}

			return name;
			}
	}


	public String signup(String name,String username,String password,String position,String department) {
		// TODO Auto-generated method stub
		try {
		FileWriter fu = new FileWriter("Faculty.txt",true);
		fu.write("\n"+name + "," + username + "," + password+","+position+","+department);
		fu.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "Signup is Successful.";
		
	}
	public void updatecheckedbook(String name,String current_chk_book){
		String[] person = new String[100];
		String curline;
		String person1 = "";
		int loop = 0;
		try {
			FileReader fr = new FileReader("Faculty.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j =0;
					for(int i =0;i<curline.length();i++) {
						if (curline.charAt(i)==',') {
							j++;
						}
						if (j!=5) {
							person1+=curline.charAt(i);
						}
					}
					person1+=","+current_chk_book;
					
				}
				if (person1.equals("")==true) {
					person[loop]=curline;
					loop++;
					
				}
				else {
					person[loop]=person1;
					person1="";
					loop++;
				}
					
			}
			br.close();
			FileWriter fw = new FileWriter("Faculty.txt");
			int i =0;
			while(i<person.length && person[i]!=null) {
				fw.write(person[i]);
				i++;
			}
			fw.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	public String getduedate(String bookname) {
		String date = "";
		String curline;
		String val="";
		try {
			FileReader fr = new FileReader("faculty_check_book.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if(curline.contains(bookname)==true) {
					int j = 0;
					for (int i =0;i<curline.length();i++) {
						if(j==2) {
							date+=curline.charAt(i);
						}
						if(curline.charAt(i)==',') {
							j++;
						}
					}
				}
			}
		br.close();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if (date.equals("")==false) {
			val = "The return date of the book is "+ date;
		}
		else {
			val = "The book is not checked out.";
		}
		return val;
		}
	public String get_book(String name,String pname) {
		String isAvailable = "Yes";
		String isBook=null;
		String curline;
		String chk_book = "ok"; 
		int total_books_checked = 4;
		int current_books_checked;
		String value="";
		try {
		FileReader fss = new FileReader("Faculty.txt");
		BufferedReader bss = new BufferedReader(fss);
		while ((curline=bss.readLine()) != null) {
			if (curline.contains(pname)){
				break;
			}
		}
		bss.close();
		int j=0;
		for (int i=0 ; i<curline.length();i++) {
			if (j==5) {
				value+=curline.charAt(i);
				
			}
			else if (curline.charAt(i)== ','){
				j++;
			}
		}
		current_books_checked = Integer. parseInt(value);
		FileReader fr = new FileReader("library.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((curline=br.readLine()) != null) {
			if (curline.contains(name)==true)
			{
				isBook="Yes";
			}
		}
		br.close();
		if (isBook=="Yes" && chk_book != null) {
			FileReader fs= new FileReader("stu_check_book.txt");
			BufferedReader fsb = new BufferedReader(fs);
			curline = null;
			
			isAvailable="Yes";
			while((curline=fsb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fsb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader fst= new FileReader("staff_check_book.txt");
			BufferedReader fstb = new BufferedReader(fst);
			curline = null;
			isAvailable="Yes";
			while((curline=fstb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			fstb.close();
		}
		if (isBook=="Yes" && chk_book !=null) {
			FileReader ff= new FileReader("faculty_check_book.txt");
			BufferedReader ffb = new BufferedReader(ff);
			curline = null;
			isAvailable="Yes";
			while((curline=ffb.readLine())!=null) {
				if (curline.contains(name)==true) {
					isAvailable= null;
					chk_book = null;
					break;
				}
			}
			ffb.close();
		}
			
		
		if (isAvailable == null && isBook!=null) {
			System.out.println("Book isn't available");
			isAvailable = "No";
			
		}
		if (isBook == null) {
			System.out.println("There is no Book with that name.");
			isAvailable="No";
		}
        LocalDate curDate = LocalDate.now();

		if (isAvailable=="Yes" && current_books_checked<total_books_checked) {
			FileWriter fw=new FileWriter("faculty_check_book.txt",true);
			fw.write("\n" + pname + "," + name + "," + curDate.plusDays(30));
			fw.close();
			current_books_checked++;
			String cbc = String.valueOf(current_books_checked);
			updatecheckedbook(pname,cbc);
		}

		}
		catch(Exception e) {
			System.out.print(e);
		}
		return isAvailable;
	}
	public String return_book(String name,String pname) {
		String curline;
		int current_books_checked=0;
		String value="";
		String val = null;
		int i=0;
		String[] books = new String[100];
		try {
		FileReader fss = new FileReader("Faculty.txt");
		BufferedReader bss = new BufferedReader(fss);
		while ((curline=bss.readLine()) != null) {
			if (curline.contains(pname)){
				val = "yes";
				break;
			}
		}
		bss.close();
		int j=0;
		for (int i1=0 ; i1<curline.length();i1++) {
			if (j==5) {
				value+=curline.charAt(i1);
				
			}
			else if (curline.charAt(i1)== ','){
				j++;
			}
		}
		current_books_checked = Integer. parseInt(value);

		FileReader fr = new FileReader("faculty_check_book.txt");
		BufferedReader br = new BufferedReader(fr);
		while((curline=br.readLine())!=null) {
			if(curline.contains(name)==true) {
				continue;
			}
			else {
				books[i]=curline;
				i++;
			}
		}
		br.close();
		i=0;
		FileWriter fw = new FileWriter("faculty_check_book.txt");
		while(i<books.length && books[i]!=null) {
			if (i==0) {
			fw.write(books[i]);
			i++;
			}
			else{
				fw.write("\n" + books[i]);
				i++;
				
			}
			}
		fw.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		if (val.equals("yes")) {
			val = "Book has been returned successfully";
			current_books_checked--;
			String cbc = String.valueOf(current_books_checked);
			updatecheckedbook(pname,cbc);
		
		}
		else {
			val = "Person doenst have this book";
		}
		return val;
	}

	public String getInfo(String name) {
		String val ="";
		String uname="";
		String password = "";
		String curline;
		String position="";
		String department="";
		String books="";
		try {
			FileReader fr = new FileReader("Faculty.txt");
			BufferedReader br = new BufferedReader(fr);
			while((curline=br.readLine())!=null) {
				if (curline.contains(name)==true) {
					int j = 0;
					for (int i=0;i<curline.length();i++) {
						if(curline.charAt(i)==',') {
							j++;
							i++;
						}
						if (j==1) {
							uname+=curline.charAt(i);
						}
						else if (j==2) {
							password+=curline.charAt(i);
						}
						else if (j==3) {
							position+=curline.charAt(i);
						}
						else if (j==4) {
							department+=curline.charAt(i);
						}
						else if (j==5) {
							books+=curline.charAt(i);
						}
					}
				}
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		val =name +" has a username of "+uname+ " and a password "+ password + " and position " + position +" and belongs to " +department +" department and has books " + books;
		return val;
	}

}



