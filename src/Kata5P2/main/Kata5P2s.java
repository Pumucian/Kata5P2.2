package Kata5P2.main;

import java.io.FileNotFoundException;
import Kata5P2.view.MailListReaderDDBB;
import Kata5P2.view.HistogramDisplays;
import Kata5P2.view.MailHistogramBuilders;
import Kata5P2.model.Mails;
import Kata5P2.model.Histograms;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Kata5P2s {
    private List<Mails> mailList;
    private Histograms<String> histogram;
    
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        Kata5P2s a = new Kata5P2s();
        a.execute();
    }

    private void execute() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        input();
        process();
        output();
    }
            
    private void input() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        String dburl = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\JavaApplication1\\KATA.sDB";
        mailList = MailListReaderDDBB.read(dburl);        
    }
            
    private void process(){
        histogram = MailHistogramBuilders.build(mailList);
    } 
            
    private void output(){
        HistogramDisplays histoDisplay = new HistogramDisplays(histogram);
        histoDisplay.execute();        
    }
            
    
    
}
