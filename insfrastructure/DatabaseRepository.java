package insfrastructure;

import java.sql.*;

public class DatabaseRepository
{
    protected String databaseUrl;
    protected String tableSchema;
    protected String tableName;

    DatabaseRepository(String databaseUrl, String tableSchema, String tableName)
    {
        this.databaseUrl =  "jdbc:sqlite:C:/sqlite/map.db";
        this.tableSchema = tableSchema;
        this.tableName = tableName;

        this.createDatabase();
        this.createTable();
    }

    private void createTable()
    {
        this.executeSQL("DROP TABLE IF EXISTS " + this.tableName + ";");
        this.executeSQL("CREATE TABLE IF NOT EXISTS " + this.tableName + " " + this.tableSchema + ";");
    }



    public void executeSQL(String sqlString) {
        try {
            Connection connection = DriverManager.getConnection(this.databaseUrl);
            Statement statement = connection.createStatement();
            statement.execute(sqlString);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void createDatabase()
    {
        try {
            Connection conn = DriverManager.getConnection(this.databaseUrl);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
