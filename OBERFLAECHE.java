import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JOptionPane;               
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import javax.swing.border.*;
import java.awt.Color;

/**   BITTE ALS VORLAGE BZW. TIPS DAS PROJEKT MIT DER SCHLANGE UND DEM PILZ BENUTZEN (SIEHE PROJEKT IN GITHUB BEI ACCOUNT DENNIS)
      ALTERNATIV CATERINGPROJEKT BEI GITHUB PAULA

      Bitte als Oberkommentare die blauen verwenden mit Slash und zwei Sternen
      und als Zwischenkommentar die grauen verwenden 
           mit Slash und einem Stern (Mehrzeilig)
           mit zwei Slash und ohne Sterne (Einzeilig)
           
           
      Povisorische Besetzung:
          Paula:    model
          Matthias:  view
          Dennis:   controller
 */

public class OBERFLAECHE extends JFrame implements ActionListener

{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
   
    
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
        /**Anmeldebild*/
        
        panel1 = new JPanel ();
        panel1.setLocation(40, 40);
        panel1.setSize (876,942);
        panel1.setVisible(true);
        panel1.setLayout(null);
        panel1.setBorder(new EtchedBorder());
        
        panel2 = new JPanel ();
        panel2.setLocation(40, 40);
        panel2.setSize (876,942);
        panel2.setVisible(true);
        panel2.setLayout(null);
        panel2.setBorder(new EtchedBorder());
        
        panel3 = new JPanel ();
        panel3.setLocation(40, 40);
        panel3.setSize (876,942);
        panel3.setVisible(true);
        panel3.setLayout(null);
        panel3.setBorder(new EtchedBorder());
        
        l_anmeldung = new JLabel();
        l_anmeldung.setText("Anmeldung");
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
        
        b_beenden = new JButton();
        b_beenden.setText("beenden");
        b_beenden.setLocation(100,750);
        b_beenden.setSize(200,100);
        b_beenden.setEnabled(true);
        b_beenden.setFont(b_beenden.getFont().deriveFont(20f));
        b_beenden.setVisible(true);
        
        b_anmelden = new JButton();
        b_anmelden.setText("anmelden");
        b_anmelden.setLocation(550,750);
        b_anmelden.setSize(200,100);
        b_anmelden.setEnabled(true);
        b_anmelden.setFont(b_anmelden.getFont().deriveFont(20f));
        b_anmelden.setVisible(true);
        
        /**Bestellbild*/
        
        l_bestellung = new JLabel();
        l_bestellung.setText("Bestellung");
        l_bestellung.setLocation(40,0);
        l_bestellung.setSize(876, 150);
        l_bestellung.setFont(l_bestellung.getFont().deriveFont(Font.BOLD));
        l_bestellung.setFont(l_bestellung.getFont().deriveFont(46f));
        l_bestellung.setHorizontalAlignment(JLabel.CENTER);

        
        l_anzahl = new JLabel();
        l_anzahl.setText("Anzahl der Karten");
        l_anzahl.setLocation(100,250);
        l_anzahl.setSize(400,100);
        l_anzahl.setFont(l_anzahl.getFont().deriveFont(Font.BOLD));
        l_anzahl.setFont(l_anzahl.getFont().deriveFont(24f));
        l_anzahl.setHorizontalAlignment(JLabel.CENTER);
        
        
        /**Rechnungsbild*/
        
        
        /**Zusatz*/
        
        FensterAufbauenV1();
        
        b_17.addActionListener(this);
        b_18.addActionListener(this);
        b_beenden.addActionListener(this);
        b_anmelden.addActionListener(this);
        
        
        //Für Anmeldebild
        panel1.add(l_anmeldung);
        panel1.add(l_benutzername);
        panel1.add(l_passwort);
        panel1.add(tf_benutzername);
        panel1.add(tf_passwort);
        panel1.add(b_17);
        panel1.add(b_18);
        panel1.add(b_beenden);
        panel1.add(b_anmelden);
        
        //Für Bestellbild
        panel2.add(l_bestellung);
        panel2.add(l_anzahl);
        
        //Für Rechnungsbild
        
        
        super.add(panel1);
        super.add(panel2);
        super.add(panel3);
        
        
        super.setLayout(null);
        super.setSize(973, 1047);
        super.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    
        if(ae.getSource()==this.b_anmelden){
            panel1.setVisible(false);
            panel2.setVisible(true);
        }
        
        if(ae.getSource()==this.b_beenden){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
        }
        
        if(ae.getSource()==this.b_17){
            b_17.setBackground(new Color(8,224,28));
            
        }
        
        if(ae.getSource()==this.b_18){
            b_18.setBackground(new Color(8,224,28));
        }
    }
    
    public void FensterAufbauenV1() {
        
        l_anmeldung.setVisible(true);
        l_benutzername.setVisible(true);
        l_passwort.setVisible(true);
        tf_benutzername.setVisible(true);
        tf_passwort.setVisible(true);
        b_17.setVisible(true);
        b_18.setVisible(true);
        b_beenden.setVisible(true);
        b_anmelden.setVisible(true);
        
        panel1.setVisible(true);

    }
    
    public void FensterAufbauenV2() {
        
        l_bestellung.setVisible(true);
        l_anzahl.setVisible(true);
        
        panel2.setVisible(true);
        

    }
    
    public void FensterAufbauenV3() {
        
        
        
        
    }
}
