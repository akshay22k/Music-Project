package Mypackage;

import Mypackage.DBConnection;
import Mypackage.createFile;
import com.sun.jdi.Value;

import java.sql.*;


public class musicBeta {
    public static String notesRow = "";
    //public static char[] dispArray = new char[16];
    public static final String SQL_INSERT = "INSERT INTO saves (id, name, array) VALUES (?,?,?)";

    public static void main(String[] args) throws SQLException {
        System.out.println("ur mum gay lol"); //for testing porpoises
        //System.out.println(createFile.tab); //for testing again
        System.out.println(createFile.dispArray); //final Array to be saved

        try(Connection con = DBConnection.getConnection();//acess connection from global class elsewhere
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM saves");
        )

        {
            System.out.println("Connected"); //for testing porpoises

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
                    createFile.dispArray.add(c);
                    System.out.println(createFile.dispArray + "H"); //place the value of dispArray in position i
                }
            }
            //System.out.println(i); //debugging still
        } catch (SQLException e){ //for debugging porpoises
            System.err.print(e);
        }

    }

    public static void saveFile(){

        //establish connection
        try(Connection con = DBConnection.getConnection();//acess connection from global class elsewhere
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM saves");
            PreparedStatement preparedStatement = con.prepareStatement(SQL_INSERT) //create prepare statement
        ) {
            System.out.println(rs.getRow());


            //create prepared statements for update
            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, String.valueOf(EditorFrame.savedFile));
            preparedStatement.setString(3, String.valueOf(createFile.createFile()));

            preparedStatement.executeUpdate();

        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
