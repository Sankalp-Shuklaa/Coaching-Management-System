package com.cms.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cms.model.Student;


public class StudentDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/cms";
	private String jdbcUsername = "root";
	private String jdbcPassword = "sankalp";

	private static final String INSERT_USERS_SQL = "INSERT INTO student" + "  (Fullname ,Class ,Instution_Name ,PhoneNo ,Address,City ,State ,Postcode ,Cid ,Student_Password ) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_USER_BY_ID = "select Sid,Fullname ,Class ,Instution_Name ,PhoneNo ,Address,City ,State ,Postcode ,Cid ,Student_Password  from student where Sid =?";
	private static final String SELECT_ALL_USERS = "select * from student";
	private static final String DELETE_USERS_SQL = "delete from student where User_id = ?;";
	private static final String UPDATE_USERS_SQL = "update student set Fullname = ?,Class= ?, Instution_Name =? PhoneNo = ?,Address= ?, City =?,State= ?, Postcode =? ,Cid = ?,Student_Password= ? where Sid = ?;";

	public StudentDAO() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public void insertUser(Student user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getFullmame());
			preparedStatement.setString(2, user.getStudent_Class());
			preparedStatement.setString(3, user.getInstution_Name());
			preparedStatement.setString(4, user.getPhoneNo());
			preparedStatement.setString(5, user.getAddress());
			preparedStatement.setString(6, user.getCity());
			preparedStatement.setString(7, user.getState());
			   preparedStatement.setInt(8, user.getPostCode());
			   preparedStatement.setInt(9, user.getCid());
			preparedStatement.setString(10, user.getStudent_Password());

			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public Student selectUser(int Sid) {
		Student user = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, Sid);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String FullName = rs.getString("FullName");
				String Studen_Class = rs.getString("Studen_Class");
				String Instution_Name = rs.getString("Instution_Name");
				String PhoneNo = rs.getString("PhoneNo");
				String Address = rs.getString("Address");
				String City = rs.getString("City");
				String State = rs.getString("State");
				int PostCode = rs.getInt("PostCode");
				int Cid = rs.getInt("Cid");
				String Student_Password = rs.getString("Student_Password");
				user = new Student( Sid,FullName,Studen_Class, Instution_Name, PhoneNo, Address,
					City, State, PostCode, Cid,Student_Password);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<Student> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Student> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int Sid=rs.getInt("Sid");
				String FullName = rs.getString("FullName");
				String Studen_Class = rs.getString("Studen_Class");
				String Instution_Name = rs.getString("Instution_Name");
				String PhoneNo = rs.getString("PhoneNo");
				String Address = rs.getString("Address");
				String City = rs.getString("City");
				String State = rs.getString("State");
				int PostCode = rs.getInt("PostCode");
				int Cid = rs.getInt("Cid");
				String Student_Password = rs.getString("Student_Password");
				users.add(new Student(Sid,FullName ,Instution_Name ,PhoneNo ,Address,City ,State ,Student_Password, PostCode ,Cid ,Student_Password ));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return users;
	}

	public boolean deleteUser(int Sid) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
			statement.setInt(1, Sid);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	/*public boolean updateUser(Student user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			System.out.println("updated USer:"+statement);
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getCountry());
			statement.setInt(4, user.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
*/
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}