package Kata5P2.view;

import java.util.ArrayList;
import java.util.List;
import Kata5P2.model.Mails;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MailListReaderDDBB {
    public static List<Mails> read (String fileName) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        List<Mails> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:" + fileName);
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery("SELECT * FROM MAIL;");
        
        while (rs.next()){
            mailList.add(new Mails(rs.getString("mail")));
        }
        return mailList;
    }
}
