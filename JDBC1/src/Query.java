public class Query {
    static String insert = "Insert into Interns (id,name,eMail,salary) values (?,?,?,?)";
    static String update = "Update interns SET name = ? Where id = ?";
    static String delete = "Delete from interns where id = ?";
    static String select = "Select * From interns";
}
