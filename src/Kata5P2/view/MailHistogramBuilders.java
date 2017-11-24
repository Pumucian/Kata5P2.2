package Kata5P2.view;

import java.util.List;
import Kata5P2.model.Histograms;
import Kata5P2.model.Mails;

public class MailHistogramBuilders {
    public static Histograms<String> build ( List<Mails> mail ){
        Histograms<String> histo = new Histograms<>();
        for (Mails mail1 : mail) {
            histo.increment(mail1.getDomain(), 1);
        }
        return histo;
    }
}
