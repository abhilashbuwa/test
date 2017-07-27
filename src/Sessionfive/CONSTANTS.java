package sessionFive;

/*Database Constants*/
public class CONSTANTS {

	final static String USER_NAME="root";
	final static String PASSWORD="root";
	final static String DB_URL="jdbc:mysql://localhost:3306/studentdb";
	final static String DRIVER_URL="com.mysql.jdbc.Driver";
	final static String createQuery="CREATE TABLE IF NOT EXISTS student_details (roll_no int(3) AUTO_INCREMENT, name VARCHAR(20),class VARCHAR(20),grade VARCHAR(20),PRIMARY KEY(roll_no));";
	final static String insertQuery="INSERT INTO student_details(name,class,grade) values( ?, ? , ?)";
	final static String selectQuery="SELECT * FROM student_details;";

}
