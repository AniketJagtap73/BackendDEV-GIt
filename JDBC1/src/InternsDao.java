import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InternsDao {

    public static void CreateInterns(Interns interns) throws SQLException{
        Connection con = DB.connect();
        String query = Query.insert;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1, interns.getId());
        preparedStatement.setString(2, interns.getName());
        preparedStatement.setString(3, interns.geteMail());
        preparedStatement.setInt(4, interns.getSalary());

        System.out.println("/n ps =  " + preparedStatement+"/n" + interns);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
    public static void updateInterns(int id,String name) throws SQLException{
        Connection con = DB.connect();
        String query = Query.update;

        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(2,id);
        preparedStatement.setString(1,name);

        System.out.println("/n ps = " + preparedStatement);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
    public static void deleteIntern(int id)throws SQLException{
        Connection con = DB.connect();
        String query = Query.delete;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1, id);

        System.out.println("/n ps = " + preparedStatement);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
    public static ArrayList<Interns> readAllInterns() throws SQLException{
        ArrayList<Interns> empList = new ArrayList<Interns>();
        Connection con = DB.connect();
        String query = Query.select;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        System.out.println("/st = " + preparedStatement);
        ResultSet rs = preparedStatement.executeQuery(query);

        while(rs.next()){
            Interns intern = new Interns(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            empList.add(intern);
        }
        preparedStatement.close();
        return empList;

    }
}
