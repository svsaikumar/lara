public class Main 
{
  public static void main(String args[]) 
  {
    // Do something...
    ...

    // Create the ConnectionPool:
    JDBCConnectionPool pool = new JDBCConnectionPool("oracle.jdbc.driver.OracleDriver", "jdbc:hsqldb://localhost/mydb","system", "Oracle123");

    // Get a connection:
    Connection con = pool.checkOut();

    // Use the connection
    ...

    // Return the connection:
    pool.checkIn(con);
  }
}