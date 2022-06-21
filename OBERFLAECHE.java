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
import javax.swing.JComboBox;

/**   BITTE ALS VORLAGE BZW. TIPS DAS PROJEKT MIT DER SCHLANGE UND DEM PILZ BENUTZEN (SIEHE PROJEKT IN GITHUB BEI ACCOUNT DENNIS)
      ALTERNATIV CATERINGPROJEKT BEI GITHUB PAULA

      Bitte als Oberkommentare die blauen verwenden mit Slash und zwei Sternen
      und als Zwischenkommentar die grauen verwenden 
           mit Slash und einem Stern (Mehrzeilig)
           mit zwei Slash und ohne Sterne (Einzeilig)
           
           
      Povisorische Besetzung:
          Paula:    model
          Matthias:  view
          Dennis:   controller1
 */

public class OBERFLAECHE extends JFrame implements ActionListener

{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
   
    
    /**JPanel1 zur Anmeldung am Anfang*/
    private JLabel l_anmeldung;
    private JLabel l_benutzername;
    private JLabel l_passwort;
    private JTextField tf_benutzername;
    private JTextField tf_passwort;
    private JButton b_17;
    private JButton b_18;
    private JButton b_beenden;
    private JButton b_anmelden;
    
    
    /**JPanel2 zur Bestellungsauswahl für BEIDE Altersgruppen; es wird beim Ausführen mit setVisible bearbeitet*/
    private JLabel l_bestellung;
    private JLabel l_anzahl;
    private JLabel l_konzertnummer;
    private JTable t;
    private JComboBox cb_anzahl;
    private JComboBox cb_konzertnummer;
    private JButton b_zurück1;
    private JButton b_auswahlbestätigen;
    
    
    /**JPanel3 für Rechnung am Ende*/
    private JLabel l_rechnung;
    private JLabel l_gesamtpreis;
    private JLabel l_gesamtzahl;
    private JLabel l_endnummer;
    private JLabel l_gesamtzahl2;
    private JLabel l_endnummer2;
    private JButton b_zurück2;
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
        b_17.setBackground(new Color(200,200,200));
        
        b_18 = new JButton();
        b_18.setText("18+");
        b_18.setLocation(550,550);
        b_18.setSize(150,100);
        b_18.setEnabled(true);
        b_18.setFont(b_18.getFont().deriveFont(20f));
        b_18.setVisible(true);
        b_18.setBackground(new Color(200,200,200));
        
        b_beenden = new JButton();
        b_beenden.setText("Beenden");
        b_beenden.setLocation(100,750);
        b_beenden.setSize(200,100);
        b_beenden.setEnabled(true);
        b_beenden.setFont(b_beenden.getFont().deriveFont(20f));
        b_beenden.setVisible(true);
        b_beenden.setBackground(new Color(200,200,200));
        
        b_anmelden = new JButton();
        b_anmelden.setText("Anmelden");
        b_anmelden.setLocation(550,750);
        b_anmelden.setSize(200,100);
        b_anmelden.setEnabled(true);
        b_anmelden.setFont(b_anmelden.getFont().deriveFont(20f));
        b_anmelden.setVisible(true);
        b_anmelden.setBackground(new Color(200,200,200));
        
        
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
        l_anzahl.setSize(250,100);
        l_anzahl.setFont(l_anzahl.getFont().deriveFont(24f));       
        
        l_konzertnummer = new JLabel();
        l_konzertnummer.setText("Konzertnummer");
        l_konzertnummer.setLocation(100,400);
        l_konzertnummer.setSize(250,100);
        l_konzertnummer.setFont(l_konzertnummer.getFont().deriveFont(24f));
        
        cb_anzahl = new JComboBox();
        cb_anzahl.setLocation(500,270);
        cb_anzahl.setSize(300,50);
        cb_anzahl.addItem("1 Karte");
        cb_anzahl.addItem("2 Karten");
        cb_anzahl.addItem("3 Karten");
        cb_anzahl.addItem("4 Karten");
        cb_anzahl.addItem("5 Karten");
                
        cb_konzertnummer = new JComboBox();
        cb_konzertnummer.setLocation(500,430);
        cb_konzertnummer.setSize(300,50);
        cb_konzertnummer.addItem("1 Andreas Gabalier");
        cb_konzertnummer.addItem("2 Donikkl");
        cb_konzertnummer.addItem("3 Exil des Schatten");
        cb_konzertnummer.addItem("4 Die Toten Hosen");
        cb_konzertnummer.addItem("5 Trailerpark");
        cb_konzertnummer.addItem("6 Rammstein");
        
        b_zurück1 = new JButton();
        b_zurück1.setText("Zurück");
        b_zurück1.setLocation(100,750);
        b_zurück1.setSize(200,100);
        b_zurück1.setEnabled(true);
        b_zurück1.setFont(b_zurück1.getFont().deriveFont(20f));
        b_zurück1.setVisible(true);
        b_zurück1.setBackground(new Color(200,200,200));
        
        b_auswahlbestätigen = new JButton();
        b_auswahlbestätigen.setText("Auswahl bestätigen");
        b_auswahlbestätigen.setLocation(550,750);
        b_auswahlbestätigen.setSize(200,100);
        b_auswahlbestätigen.setEnabled(true);
        b_auswahlbestätigen.setFont(b_auswahlbestätigen.getFont().deriveFont(20f));
        b_auswahlbestätigen.setVisible(true);
        b_auswahlbestätigen.setBackground(new Color(200,200,200));
        
        
        /**Rechnungsbild*/
        l_rechnung = new JLabel();
        l_rechnung.setText("Rechnung");
        l_rechnung.setLocation(40,0);
        l_rechnung.setSize(876, 150);
        l_rechnung.setFont(l_rechnung.getFont().deriveFont(Font.BOLD));
        l_rechnung.setFont(l_rechnung.getFont().deriveFont(46f));
        l_rechnung.setHorizontalAlignment(JLabel.CENTER);
        
        b_zurück2 = new JButton();
        b_zurück2.setText("Zurück");
        b_zurück2.setLocation(100,750);
        b_zurück2.setSize(200,100);
        b_zurück2.setEnabled(true);
        b_zurück2.setFont(b_zurück2.getFont().deriveFont(20f));
        b_zurück2.setVisible(true);
        b_zurück2.setBackground(new Color(200,200,200));
        
        l_gesamtzahl = new JLabel();
        l_gesamtzahl.setText("Anzahl der Karten");
        l_gesamtzahl.setLocation(100,250);
        l_gesamtzahl.setSize(250,100);
        l_gesamtzahl.setFont(l_gesamtzahl.getFont().deriveFont(24f));
        
        l_endnummer = new JLabel();
        l_endnummer.setText("Konzertnummer");
        l_endnummer.setLocation(100,400);
        l_endnummer.setSize(250,100);
        l_endnummer.setFont(l_endnummer.getFont().deriveFont(24f));
        
        l_gesamtzahl2 = new JLabel();
        l_gesamtzahl2.setText("Anzahl der Karten");
        l_gesamtzahl2.setLocation(500,250);
        l_gesamtzahl2.setSize(250,100);
        l_gesamtzahl2.setFont(l_gesamtzahl2.getFont().deriveFont(24f));
        
        l_endnummer2 = new JLabel();
        l_endnummer2.setText("Konzertnummer");
        l_endnummer2.setLocation(500,400);
        l_endnummer2.setSize(250,100);
        l_endnummer2.setFont(l_endnummer2.getFont().deriveFont(24f));
        
        l_gesamtpreis = new JLabel();
        l_gesamtpreis.setText("Gesamtpreis");
        l_gesamtpreis.setLocation(100,550);
        l_gesamtpreis.setSize(250,100);
        l_gesamtpreis.setFont(l_gesamtpreis.getFont().deriveFont(24f));
        
        b_pdf = new JButton();
        b_pdf.setText("pdf drucken");
        b_pdf.setLocation(550,750);
        b_pdf.setSize(200,100);
        b_pdf.setEnabled(true);
        b_pdf.setFont(b_pdf.getFont().deriveFont(20f));
        b_pdf.setVisible(true);
        b_pdf.setBackground(new Color(200,200,200));
        
        
        /**Zusatz*/
        FensterAufbauenV1();    
        
        
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
        
        b_17.addActionListener(this);
        b_18.addActionListener(this);
        b_beenden.addActionListener(this);
        b_anmelden.addActionListener(this);
        
        
        //Für Bestellbild
        panel2.add(l_bestellung);
        panel2.add(l_anzahl);
        panel2.add(l_konzertnummer);
        panel2.add(b_zurück1);
        panel2.add(b_auswahlbestätigen);
        panel2.add(cb_konzertnummer);
        panel2.add(cb_anzahl);
        
        b_zurück1.addActionListener(this);
        b_auswahlbestätigen.addActionListener(this);
        cb_anzahl.addActionListener(this);
        
        
        //Für Rechnungsbild
        panel3.add(l_rechnung);
        panel3.add(b_zurück2);
        panel3.add(l_gesamtzahl);
        panel3.add(l_endnummer);
        panel3.add(l_gesamtzahl2);
        panel3.add(l_endnummer2);
        panel3.add(l_gesamtpreis);
        panel3.add(b_pdf);
        
        b_zurück2.addActionListener(this);
        b_pdf.addActionListener(this);
        
        
        //Zusatz
        super.add(panel1);
        super.add(panel2);
        super.add(panel3);
        
        
        super.setLayout(null);
        super.setSize(973, 1047);
        super.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        /**Anmeldefenster*/
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
            b_18.setBackground(new Color(200,200,200));
        }
        
        if(ae.getSource()==this.b_18){
            b_18.setBackground(new Color(8,224,28));
            b_17.setBackground(new Color(200,200,200));
        }
        
        
        /**Bestellfenster*/
        if(ae.getSource()==this.b_zurück1){
            panel1.setVisible(true);
            panel2.setVisible(false);
        }
        
        if(ae.getSource()==this.b_auswahlbestätigen){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
        }
        
        int selection = cb_anzahl.getSelectedIndex();
        switch (selection){
            case 0:  l_gesamtzahl2.setText("1 Karte"); break;
            case 1:  l_gesamtzahl2.setText("2 Karten"); break;
            case 2:  l_gesamtzahl2.setText("3 Karten"); break;
            case 3:  l_gesamtzahl2.setText("4 Karten"); break;
            case 4:  l_gesamtzahl2.setText("5 Karten"); break;
            }
            
        int selection2 = cb_konzertnummer.getSelectedIndex();
        switch (selection2){
            case 0:  l_endnummer2.setText("1-Andreas Gabailer"); break;
            case 1:  l_endnummer2.setText("2-Donikkl"); break;
            case 2:  l_endnummer2.setText("3-Exil des Schattens"); break;
            case 3:  l_endnummer2.setText("4-Die Toten Hosen"); break;
            case 4:  l_endnummer2.setText("5-Trailerpark"); break;
            case 5:  l_endnummer2.setText("6-Rammstein"); break;
            }
                
        
        /**Rechnungsfenster*/
        if(ae.getSource()==this.b_zurück2){
            panel2.setVisible(true);
            panel3.setVisible(false);
        }
        
        if(ae.getSource()==this.b_pdf){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
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
        b_zurück1.setVisible(true);
        l_konzertnummer.setVisible(true);
        b_auswahlbestätigen.setVisible(true);
        cb_konzertnummer.setVisible(true);
        cb_anzahl.setVisible(true);
        
        panel2.setVisible(true);
        

    }
    
    public void FensterAufbauenV3() {
        l_rechnung.setVisible(true);
        b_zurück2.setVisible(true);
        l_gesamtzahl.setVisible(true);
        l_endnummer.setVisible(true);
        l_gesamtzahl2.setVisible(true);
        l_endnummer2.setVisible(true);
        l_gesamtpreis.setVisible(true);
        b_pdf.setVisible(true);
        
        panel3.setVisible(true);        
    }
}
