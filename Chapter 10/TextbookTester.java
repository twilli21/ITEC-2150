
/**
 * 
 * Driver class for Textbook
 * @author Taylor Williams
 *
 */
import java.util.Scanner;

public class TextbookTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Textbook t1 = new Textbook();
		Textbook t2 = new Textbook();
		Textbook t3 = new Textbook();
		
		// Enter the color of the cover of textbook 1.
		System.out.println("Please enter the color of the History book's cover:");
		String coverColor1 = input.nextLine();
		t1.setCoverColor(coverColor1);
		
		// Enter the number of pages of textbook 1.
		System.out.println("Please enter the number of pages in the History book:");
		int pageNumber1 = input.nextInt();
		t1.setPageNumber(pageNumber1);
		
	    input.nextLine();
	    
		// Enter the title of textbook 1.
		System.out.println("Please enter the title of the History book:");
		String bookTitle1 = input.nextLine();
		t1.setBookTitle(bookTitle1);


		// Enter the color of the cover of textbook 2.
		System.out.println("Please enter the color of the Math book's cover:");
		String coverColor2 = input.nextLine();
		t2.setCoverColor(coverColor2);
		
		// Enter the number of pages of textbook 2.
		System.out.println("Please enter the number of pages in the Math book:");
		int pageNumber2 = input.nextInt();
		t2.setPageNumber(pageNumber2);
		
	    input.nextLine();
	    
		// Enter the title of textbook 2.
		System.out.println("Please enter the title of the Math book:");
		String bookTitle2 = input.nextLine();
		t2.setBookTitle(bookTitle2);

		
		// Enter the color of the cover of textbook 3.
		System.out.println("Please enter the color of the ITEC book's cover:");
		String coverColor3 = input.nextLine();
		t3.setCoverColor(coverColor3);
		
		// Enter the number of pages of textbook 3.
		System.out.println("Please enter the number of pages in the ITEC book:");
		int pageNumber3 = input.nextInt();
		t3.setPageNumber(pageNumber3);
		
	    input.nextLine();
	    
		// Enter the title of textbook 3.
		System.out.println("Please enter the title of the ITEC book:");
		String bookTitle3 = input.nextLine();
		t3.setBookTitle(bookTitle3);

	    
	  System.out.println(t1.toString());
	  System.out.println(t2.toString());
	  System.out.println(t3.toString());
	}
}
