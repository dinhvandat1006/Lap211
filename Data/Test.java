package Data;

public class Test {
    public static void main(String[] args) {
        DataConnect dataConnect = new DataConnect();
        if (dataConnect.getConnection() != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Kết nối thất bại!");
        }

//        BookDAO bookDAO = new BookDAO();
//        Book book = new Book("B001", "Java Programming", "John Doe", "Tech Press", 2023, 10);
//        int result = bookDAO.addBook(book);
//        if (result > 0) {
//            System.out.println("Thêm sách thành công!" + result + " bản ghi đã được thêm.");
//        } else {
//            System.out.println("Thêm sách thất bại!");
//        }
//        Book b = bookDAO.findAddBook("B001");
//        if (b != null) {
//            System.out.println("Sách tìm thấy: " + b.getBookName() + " của tác giả " + b.getAuthor());
//        } else {
//            System.out.println("Không tìm thấy sách với ID B001.");
//        }
//    }
    }
}

