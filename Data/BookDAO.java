package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class BookDAO {
     public Book findAddBook(String bookId) {
         String sql = "SELECT * FROM books WHERE bookId = ?";
        try (Connection conn = DataConnect.getConnection()) {
                if (conn == null) {
                    System.err.println(" Kết nối thất bại.");
                    return null;
                }

                try (PreparedStatement pre = conn.prepareStatement(sql)) {
                    pre.setString(1, bookId);
                    ResultSet rs = pre.executeQuery();
                    if (rs.next()) {
                        return new Book(
                            rs.getString("1"),
                            rs.getString("2"),
                            rs.getString("author"),
                            rs.getString("publisher"),
                            rs.getInt("yearPublished"),
                            rs.getInt("quantity")
                        );
                    }
                }
            } catch (SQLException e) {
                System.err.println(" Lỗi khi tìm sách trong CSDL:");
                e.printStackTrace();
            }
         return null;
     }

        public int addBook(Book b) {
        String sql = "INSERT INTO books (bookId, bookName, author, publisher, yearPublished, quantity) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DataConnect.getConnection()) {
            if (conn == null) {
                System.err.println(" Kết nối thất bại.");
                return 0;
            }

            try (PreparedStatement pre = conn.prepareStatement(sql)) {
                pre.setString(1, b.getBookId());
                pre.setString(2, b.getBookName());
                pre.setString(3, b.getAuthor());
                pre.setString(4, b.getPublisher());
                pre.setInt(5, b.getYearPublished());
                pre.setInt(6, b.getQuantity());

                return pre.executeUpdate();
            }

        } catch (SQLException e) {
            System.err.println(" Lỗi khi thêm sách vào CSDL:");
            e.printStackTrace();
        }

        return 0;
    }
}


