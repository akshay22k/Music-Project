import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class musicBeta {
    public static String notesRow = "";
    public static char[] dispArray = new char[16];

    public static void main(String[] args) throws SQLException {
        System.out.println("ur mum gay lol"); //for testing porpoises


        try(Connection con = DBConnection.getConnection();//acess connection from global class elsewhere
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM saves");
        )
        {
            System.out.println("Connected"); //for testing porpoises
            //System.out.println(rs.getRow());
            //Insert into record
            //stmt.executeUpdate("INSERT INTO saves " + "VALUES (2, 'Testing Again', '48739210')");

            //GET SAVE FILES
            while(rs.next()){ //Goes through the possible saves
                if(rs.getString("name").equals("Transposed Test 2 ")){ //if the name of the save file is the same as the desired
                    notesRow = (rs.getString(3)); //Give the DB array onto the function that will pass over
                }
            }

            System.out.println("The string is " + notesRow); //debugging
            char[] notesArray = notesRow.toCharArray(); //turn string into array
            //Turns the array into actual notes
            int i = 0;
            for(char c : notesArray){
                i ++; //count interations for adding to the display
                //System.out.println(c); //debugging porpoisies
                if(c != '-'){
                    System.out.println(c + " " + i);
                    dispArray[i] = c;
                    System.out.println(dispArray[i]); //place the value of dispArray in position i
                }
            }
            //System.out.println(i); //debugging still
        } catch (SQLException e){ //for debugging porpoises
            System.err.print(e);
        }

    }
}
