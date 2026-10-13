/*Create a Library class to manage books. Implement methods to add
books, borrow books, and return books.*/

package Tasks;
class Library{
	void addBook() {
		System.out.println("Book added to library");
	      }
        
	void borrowBook() {
		System.out.println("Book Borrowed Successfull");
	        }
	void returnBook() {
		System.out.println("Book Returned Successfull");
	}
public class Q24 {

	public static void main(String[] args) {
			Library lib=new Library();
			 lib.addBook();
			 lib.borrowBook();
			 lib.returnBook();
	}
	}

}
