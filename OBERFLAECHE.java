import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JOptionPane;               
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import javax.swing.border.*;

/**   BITTE ALS VORLAGE BZW. TIPS DAS PROJEKT MIT DER SCHLANGE UND DEM PILZ BENUTZEN (SIEHE PROJEKT IN GITHUB BEI ACCOUNT DENNIS)
      ALTERNATIV CATERINGPROJEKT BEI GITHUB PAULA

      Bitte als Oberkommentare die blauen verwenden mit Slash und zwei Sternen
      und als Zwischenkommentar die grauen verwenden 
           mit Slash und einem Stern (Mehrzeilig)
           mit zwei Slash und ohne Sterne (Einzeilig)
           
           
      Povisorische Besetzung:
          Paula:    model
          Mathias:  view
          Dennis:   controller
 */

public class OBERFLAECHE extends JFrame

{
    private JPanel panel;
    private JPanel anmeldungsbild;
    private JPanel Bestellungsbild;
    private JPanel Rechnungsbild;
    
    /**JFrame zur Anmeldung am Anfang*/
    private JLabel l_anmeldung;
    private JLabel l_benutzername;
    private JLabel l_passwort;
    private JTextField tf_benutzername;
    private JTextField tf_passwort;
    private JButton b_17;
    private JButton b_18;
    private JButton b_beenden;
    private JButton b_anmelden;
    
    /**JFrame zur Bestellungsauswahl für BEIDE Altersgruppen; es wird beim Ausführen mit setVisible bearbeitet*/
    private JLabel l_bestellung;
    private JLabel l_anzahl;
    private JLabel l_konzertnummer;
    private JTable t;
    private JComboBox cb_anzahl;
    private JComboBox cb_konzertnummer;
    private JButton b_zurück;
    private JButton b_auswahlbestätigen;
    
    /**JFrame für Rechnung am Ende*/
    private JLabel l_rechnung;
    private JLabel l_gesamtpreis;
    /*   Drei Felder zur Zusammenfassenden Info fehlen noch
         konzertnr.
         anzahl
         gesamtpreis
    */
    private JButton b_pdf;
    
    public OBERFLAECHE()
    {
        panel = new JPanel ();
        panel.setLocation(40, 40);
        panel.setSize (876,942);
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBorder(new EtchedBorder());
        
        l_anmeldung = new JLabel();
        l_anmeldung.setText("Anmedlung");
        l_anmeldung.setLocation(40,0);
        l_anmeldung.setSize(876, 150);
        l_anmeldung.setFont(l_anmeldung.getFont().deriveFont(Font.BOLD));
        l_anmeldung.setFont(l_anmeldung.getFont().deriveFont(46f));
        l_anmeldung.setHorizontalAlignment(JLabel.CENTER);
        
        l_benutzername = new JLabel();
        l_benutzername.setText("Benutzername");
        l_benutzername.setLocation(150,250);
        l_benutzername.setSize(200,100);
        l_benutzername.setFont(l_benutzername.getFont().deriveFont(24f));
        
        l_passwort = new JLabel();
        l_passwort.setText("Passwort");
        l_passwort.setLocation(150,400);
        l_passwort.setSize(200,100);
        l_passwort.setFont(l_passwort.getFont().deriveFont(24f));
        
        tf_benutzername = new JTextField();
        tf_benutzername.setText("Benutzername eingeben...");
        tf_benutzername.setLocation(500,250);
        tf_benutzername.setSize(300,100);
        tf_benutzername.setEnabled(true);
        tf_benutzername.setFont(tf_benutzername.getFont().deriveFont(20f));
        tf_benutzername.setVisible(true);
        tf_benutzername.setHorizontalAlignment(JTextField.CENTER);
        
        tf_passwort = new JTextField();
        tf_passwort.setText("Passwort eingeben...");
        tf_passwort.setLocation(500,400);
        tf_passwort.setSize(300,100);
        tf_passwort.setEnabled(true);
        tf_passwort.setFont(tf_passwort.getFont().deriveFont(20f));
        tf_passwort.setVisible(true);
        tf_passwort.setHorizontalAlignment(JTextField.CENTER);
        
        b_17 = new JButton();
        b_17.setText("17-");
        b_17.setLocation(150,550);
        b_17.setSize(150,100);
        b_17.setEnabled(true);
        b_17.setFont(b_17.getFont().deriveFont(20f));
        b_17.setVisible(true);
        
        b_18 = new JButton();
        b_18.setText("18+");
        b_18.setLocation(550,550);
        b_18.setSize(150,100);
        b_18.setEnabled(true);
        b_18.setFont(b_18.getFont().deriveFont(20f));
        b_18.setVisible(true);
        
        
        
        FensterAufbauenV1();
        
        
        panel.add(l_anmeldung);
        panel.add(l_benutzername);
        panel.add(l_passwort);
        panel.add(tf_benutzername);
        panel.add(tf_passwort);
        panel.add(b_17);
        panel.add(b_18);
        super.add(panel);
        
        
        super.setLayout(null);
        super.setSize(973, 1047);
        super.setVisible(true);
    }
    
    public void FensterAufbauenV1() {

        l_anmeldung.setVisible(true);
        l_benutzername.setVisible(true);
        l_passwort.setVisible(true);
        tf_benutzername.setVisible(true);
        tf_passwort.setVisible(true);
        b_17.setVisible(true);
        b_18.setVisible(true);
        panel.setVisible(true);

    }
    
    public void FensterAufbauenV2() {

        
        

    }
    
    public void FensterAufbauenV3() {
        
        
        
        
    }
}
