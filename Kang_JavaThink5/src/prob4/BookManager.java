package prob4;

import java.util.Vector;

public class BookManager {
	public static int getRentalPrice(Vector<Book> bookList, String kind) {
		// 구현하세요.
		int tot = 0;
		for (int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getKind().equals(kind)) tot += bookList.get(i).getRentalPrice();
		}
		return tot;
	}
}
