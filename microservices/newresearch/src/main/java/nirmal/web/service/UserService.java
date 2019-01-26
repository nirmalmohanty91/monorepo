package nirmal.web.service;

import nirmal.domain.ui.User;
import nirmal.exception.ValidationException;
import nirmal.exception.WarningException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  @Autowired User user;

  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName("org.postgresql.Driver");
      connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/sample_db");
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return connection;
  }

  public boolean insertData(User user) {
    boolean isInserted = false;
    try {
      Connection connection = UserService.getConnection();
      PreparedStatement pstmt =
          connection.prepareStatement("insert into people(id,fname,lname,address) values(?,?,?,?)");
      pstmt.setString(1, user.getId());
      pstmt.setString(2, user.getFirstName());
      pstmt.setString(3, user.getLastName());
      pstmt.setString(4, user.getAddress());
      int rs = pstmt.executeUpdate();
      if (rs != 0) {
        isInserted = true;
      }

      pstmt.close();
      connection.close();
    } catch (Exception e) {

      e.printStackTrace();
    }
    return isInserted;
  }

  public List<User> getUserByFirstName(String fname) {
    List<User> list = new ArrayList<>();
    try {
      Connection connection = UserService.getConnection();
      PreparedStatement pstmt = connection.prepareStatement("SELECT * from people where fname=?");
      pstmt.setString(1, fname);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        user.setId(rs.getString(1));
        user.setFirstName(rs.getString(2));
        user.setLastName(rs.getString(3));
        user.setAddress(rs.getString(4));
        list.add(user);
      }
      pstmt.close();
      connection.close();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {

    }
    return list;
  }

  public void getError() {

    if (1 == 2) {
      throw new WarningException("Warning");
    } else {
      throw new ValidationException("Validation");
    }
  }
}
