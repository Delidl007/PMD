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
          Dennis:   controller
 */

public class OBERFLAECHE extends JFrame implements ActionListener

{
    int[] passwort;
    
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    
    private JLabel l_logo;
    private JLabel l_logo2;
    private JLabel l_logo3;
   
    
    /**JPanel1 zur Anmeldung am Anfang*/
    private JButton b_start;
    private JLabel l_anmeldung;
    private JLabel l_benutzername;
    private JLabel l_passwort;
    private JTextField tf_benutzername;
    private JTextField tf_passwort;
    private JButton b_17;
    private JButton b_18;
    private JButton b_beenden;
    private JButton b_anmelden;
    
    private JButton b_bneingabe;
    private JButton b_pweingabe;
    
    
    /**JPanel2 zur Bestellungsauswahl für BEIDE Altersgruppen; es wird beim Ausführen mit setVisible bearbeitet*/
    private JLabel l_bestellung;
    private JLabel l_anzahl;
    private JLabel l_konzertnummer;
    private JComboBox cb_anzahl;
    private JComboBox cb_anzahl2;
    private JComboBox cb_konzertnummer;
    private JComboBox cb_konzertnummer2;
    private JButton b_zurück1;
    private JButton b_auswahlbestätigen;
    
    private JLabel tabelle_17;
    private JLabel tabelle_18;
    
    /**JPanel3 für Rechnung am Ende*/
    private JLabel l_rechnung;
    private JLabel l_gesamtpreis;
    private JLabel l_gesamtpreis2;
    private JLabel l_gesamtzahl;
    private JLabel l_endnummer;
    private JLabel l_gesamtzahl2;
    private JLabel l_endnummer2;
    private JButton b_zurück2;
    private JButton b_zurück3;
    private JButton b_pdf;
    
    private JLabel ticket1;
    private JLabel ticket2;
    private JLabel ticket3;
    private JLabel ticket4;
    private JLabel ticket5;
    private JLabel ticket6;
            
    public OBERFLAECHE()
    {
        
        panel1 = new JPanel ();
        panel1.setLocation(40, 40);
        panel1.setSize (876,942);
        panel1.setVisible(true);
        panel1.setLayout(null);
        panel1.setBorder(new EtchedBorder());
        panel1.setBackground(new Color(255,255,255));
        
        panel2 = new JPanel ();
        panel2.setLocation(40, 40);
        panel2.setSize (876,942);
        panel2.setVisible(true);
        panel2.setLayout(null);
        panel2.setBorder(new EtchedBorder());
        panel2.setBackground(new Color(255,255,255));
        
        panel3 = new JPanel ();
        panel3.setLocation(40, 40);
        panel3.setSize (876,942);
        panel3.setVisible(true);
        panel3.setLayout(null);
        panel3.setBorder(new EtchedBorder());
        panel3.setBackground(new Color(255,255,255));
        
        ImageIcon pictureL = new ImageIcon(this.getClass().getResource("Logo-OG.jpg"));
        l_logo = new JLabel(pictureL);
        l_logo.setLocation(10,10);
        l_logo.setSize(200,100);
        l_logo.setVisible(true);
        
        ImageIcon pictureL2 = new ImageIcon(this.getClass().getResource("Logo-OG.jpg"));
        l_logo2 = new JLabel(pictureL2);
        l_logo2.setLocation(10,10);
        l_logo2.setSize(200,100);
        l_logo2.setVisible(true);
                
        ImageIcon pictureL3 = new ImageIcon(this.getClass().getResource("Logo-OG.jpg"));
        l_logo3 = new JLabel(pictureL3);
        l_logo3.setLocation(10,10);
        l_logo3.setSize(200,100);
        l_logo3.setVisible(true);
        
        
        
        /**Anmeldebild*/
        b_start = new JButton();
        b_start.setText("Start");
        b_start.setLocation(550,750);
        b_start.setSize(200,100);
        b_start.setEnabled(true);
        b_start.setFont(b_start.getFont().deriveFont(20f));
        b_start.setVisible(true);
        b_start.setBackground(new Color(191,191,191));
                
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
        
        b_bneingabe = new JButton();
        b_bneingabe.setText("Benutzername eingeben...");
        b_bneingabe.setLocation(500,250);
        b_bneingabe.setSize(300,100);
        b_bneingabe.setEnabled(true);
        b_bneingabe.setFont(b_bneingabe.getFont().deriveFont(20f));
        b_bneingabe.setVisible(false);
        b_bneingabe.setBackground(new Color(255,255,255));
                
        b_pweingabe = new JButton();
        b_pweingabe.setText("Passwort eingeben...");
        b_pweingabe.setLocation(500,400);
        b_pweingabe.setSize(300,100);
        b_pweingabe.setEnabled(true);
        b_pweingabe.setFont(b_pweingabe.getFont().deriveFont(20f));
        b_pweingabe.setVisible(false);
        b_pweingabe.setBackground(new Color(255,255,255));
        
        tf_benutzername = new JTextField();
        tf_benutzername.setText("");
        tf_benutzername.setLocation(500,250);
        tf_benutzername.setSize(300,100);
        tf_benutzername.setEnabled(true);
        tf_benutzername.setFont(tf_benutzername.getFont().deriveFont(20f));
        tf_benutzername.setVisible(false);
        tf_benutzername.setHorizontalAlignment(JTextField.CENTER);
        
        tf_passwort = new JTextField();
        tf_passwort.setText("");
        tf_passwort.setLocation(500,400);
        tf_passwort.setSize(300,100);
        tf_passwort.setEnabled(true);
        tf_passwort.setFont(tf_passwort.getFont().deriveFont(20f));
        tf_passwort.setVisible(false);
        tf_passwort.setHorizontalAlignment(JTextField.CENTER);
        
        b_17 = new JButton();
        b_17.setText("17-");
        b_17.setLocation(150,550);
        b_17.setSize(150,100);
        b_17.setEnabled(true);
        b_17.setFont(b_17.getFont().deriveFont(20f));
        b_17.setVisible(true);
        b_17.setBackground(new Color(191,191,191));
        
        b_18 = new JButton();
        b_18.setText("18+");
        b_18.setLocation(550,550);
        b_18.setSize(150,100);
        b_18.setEnabled(true);
        b_18.setFont(b_18.getFont().deriveFont(20f));
        b_18.setVisible(true);
        b_18.setBackground(new Color(191,191,191));
        
        b_beenden = new JButton();
        b_beenden.setText("Beenden");
        b_beenden.setLocation(100,750);
        b_beenden.setSize(200,100);
        b_beenden.setEnabled(true);
        b_beenden.setFont(b_beenden.getFont().deriveFont(20f));
        b_beenden.setVisible(true);
        b_beenden.setBackground(new Color(191,191,191));
        
        b_anmelden = new JButton();
        b_anmelden.setText("Anmelden");
        b_anmelden.setLocation(550,750);
        b_anmelden.setSize(200,100);
        b_anmelden.setEnabled(true);
        b_anmelden.setFont(b_anmelden.getFont().deriveFont(20f));
        b_anmelden.setVisible(true);
        b_anmelden.setBackground(new Color(191,191,191));
           
        
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
        
        cb_anzahl2 = new JComboBox();
        cb_anzahl2.setLocation(500,270);
        cb_anzahl2.setSize(300,50);
        cb_anzahl2.addItem("1 Karte");
        cb_anzahl2.addItem("2 Karten");
        cb_anzahl2.addItem("3 Karten");
        cb_anzahl2.addItem("4 Karten");
        cb_anzahl2.addItem("5 Karten");
                
        cb_konzertnummer = new JComboBox();
        cb_konzertnummer.setLocation(500,430);
        cb_konzertnummer.setSize(300,50);
        cb_konzertnummer.addItem("1 - Andreas Gabalier");
        cb_konzertnummer.addItem("2 - Donikkl");
        cb_konzertnummer.addItem("4 - Die Toten Hosen");
        
        cb_konzertnummer2 = new JComboBox();
        cb_konzertnummer2.setLocation(500,430);
        cb_konzertnummer2.setSize(300,50);
        cb_konzertnummer2.addItem("1 - Andreas Gabalier");
        cb_konzertnummer2.addItem("2 - Donikkl");
        cb_konzertnummer2.addItem("3 - Exil des Schattens");
        cb_konzertnummer2.addItem("4 - Die Toten Hosen");
        cb_konzertnummer2.addItem("5 - Trailerpark");
        cb_konzertnummer2.addItem("6 - Rammstein");
        
        b_zurück1 = new JButton();
        b_zurück1.setText("Zurück");
        b_zurück1.setLocation(100,750);
        b_zurück1.setSize(200,100);
        b_zurück1.setEnabled(true);
        b_zurück1.setFont(b_zurück1.getFont().deriveFont(20f));
        b_zurück1.setVisible(true);
        b_zurück1.setBackground(new Color(191,191,191));
        
        b_auswahlbestätigen = new JButton();
        b_auswahlbestätigen.setText("Auswahl bestätigen");
        b_auswahlbestätigen.setLocation(550,750);
        b_auswahlbestätigen.setSize(250,100);
        b_auswahlbestätigen.setEnabled(true);
        b_auswahlbestätigen.setFont(b_auswahlbestätigen.getFont().deriveFont(20f));
        b_auswahlbestätigen.setVisible(true);
        b_auswahlbestätigen.setBackground(new Color(191,191,191));
        
        ImageIcon pictureT17 = new ImageIcon(this.getClass().getResource("Tabelle_17.jpg"));
        tabelle_17 = new JLabel(pictureT17);
        tabelle_17.setLocation(35,310);
        tabelle_17.setSize(800,600);
        tabelle_17.setVisible(false);
        
        ImageIcon pictureT18 = new ImageIcon(this.getClass().getResource("Tabelle_18.jpg"));
        tabelle_18 = new JLabel(pictureT18);
        tabelle_18.setLocation(35,310);
        tabelle_18.setSize(800,600);
        tabelle_18.setVisible(false);
        
        
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
        b_zurück2.setBackground(new Color(191,191,191));
        
        b_zurück3 = new JButton();
        b_zurück3.setText("Zurück");
        b_zurück3.setLocation(100,750);
        b_zurück3.setSize(200,100);
        b_zurück3.setEnabled(true);
        b_zurück3.setFont(b_zurück1.getFont().deriveFont(20f));
        b_zurück3.setVisible(false);
        b_zurück3.setBackground(new Color(191,191,191));
        
        l_gesamtzahl = new JLabel();
        l_gesamtzahl.setText("Anzahl der Karten");
        l_gesamtzahl.setLocation(100,250);
        l_gesamtzahl.setSize(300,100);
        l_gesamtzahl.setFont(l_gesamtzahl.getFont().deriveFont(24f));
        
        l_endnummer = new JLabel();
        l_endnummer.setText("Konzertnummer");
        l_endnummer.setLocation(100,400);
        l_endnummer.setSize(250,100);
        l_endnummer.setFont(l_endnummer.getFont().deriveFont(24f));
        
        l_gesamtzahl2 = new JLabel();
        l_gesamtzahl2.setText("Anzahl der Karten");
        l_gesamtzahl2.setLocation(500,250);
        l_gesamtzahl2.setSize(300,100);
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
        
        l_gesamtpreis2 = new JLabel();
        l_gesamtpreis2.setText("");
        l_gesamtpreis2.setLocation(500,550);
        l_gesamtpreis2.setSize(250,100);
        l_gesamtpreis2.setFont(l_gesamtpreis2.getFont().deriveFont(24f));
        
        b_pdf = new JButton();
        b_pdf.setText("pdf drucken");
        b_pdf.setLocation(550,750);
        b_pdf.setSize(200,100);
        b_pdf.setEnabled(true);
        b_pdf.setFont(b_pdf.getFont().deriveFont(20f));
        b_pdf.setVisible(true);
        b_pdf.setBackground(new Color(191,191,191));

        ImageIcon picture = new ImageIcon(this.getClass().getResource("AndreasGabalier-Konzertkarte (1).jpg"));
        ticket1 = new JLabel(picture);
        ticket1.setLocation(50,200);
        ticket1.setSize(800,600);
        ticket1.setVisible(false);
        
        ImageIcon picture2 = new ImageIcon(this.getClass().getResource("Donikkl-Konzertkarte.jpg"));
        ticket2 = new JLabel(picture2);
        ticket2.setLocation(50,200);
        ticket2.setSize(800,600);
        ticket2.setVisible(false);
               
        ImageIcon picture3 = new ImageIcon(this.getClass().getResource("Exil des Schattens-Konzertkarte.jpg"));
        ticket3 = new JLabel(picture3);
        ticket3.setLocation(50,200);
        ticket3.setSize(800,600);
        ticket3.setVisible(false);
        
        ImageIcon picture4 = new ImageIcon(this.getClass().getResource("Die Toten Hosen-Konzertkarte.jpg"));
        ticket4 = new JLabel(picture4);
        ticket4.setLocation(50,200);
        ticket4.setSize(800,600);
        ticket4.setVisible(false);
        
        ImageIcon picture5 = new ImageIcon(this.getClass().getResource("Trailerpark-Konzertkarte.jpg"));
        ticket5 = new JLabel(picture5);
        ticket5.setLocation(50,200);
        ticket5.setSize(800,600);
        ticket5.setVisible(false);
        
        ImageIcon picture6 = new ImageIcon(this.getClass().getResource("Rammstein-Konzertkarte.jpg"));
        ticket6 = new JLabel(picture6);
        ticket6.setLocation(50,200);
        ticket6.setSize(800,600);
        ticket6.setVisible(false);
        
                
        /**Zusatz*/
        FensterAufbauenV1();    
        
        
        //Für Anmeldebild
        panel1.add (b_start);
        panel1.add(l_anmeldung);
        panel1.add(l_benutzername);
        panel1.add(l_passwort);
        panel1.add(tf_benutzername);
        panel1.add(tf_passwort);
        panel1.add(b_17);
        panel1.add(b_18);
        panel1.add(b_beenden);
        panel1.add(b_anmelden);
        panel1.add(l_logo);
        panel1.add(b_bneingabe);
        panel1.add(b_pweingabe);
        
        
        b_start.addActionListener(this);
        b_17.addActionListener(this);
        b_18.addActionListener(this);
        b_beenden.addActionListener(this);
        b_anmelden.addActionListener(this);
        b_bneingabe.addActionListener(this);
        b_pweingabe.addActionListener(this);
        
        
        //Für Bestellbild
        panel2.add(l_bestellung);
        panel2.add(l_anzahl);
        panel2.add(l_konzertnummer);
        panel2.add(b_zurück1);
        panel2.add(b_auswahlbestätigen);
        panel2.add(cb_konzertnummer);
        panel2.add(cb_konzertnummer2);
        panel2.add(cb_anzahl);
        panel2.add(cb_anzahl2);
        panel2.add(l_logo2);
        panel2.add(tabelle_17);
        panel2.add(tabelle_18);
        
        
        
        b_zurück1.addActionListener(this);
        b_auswahlbestätigen.addActionListener(this);
        cb_anzahl.addActionListener(this);
        cb_anzahl2.addActionListener(this);
        cb_konzertnummer.addActionListener(this);
        cb_konzertnummer2.addActionListener(this);
        
        
        //Für Rechnungsbild
        panel3.add(l_rechnung);
        panel3.add(b_zurück2);
        panel3.add(b_zurück3);
        panel3.add(l_gesamtzahl);
        panel3.add(l_endnummer);
        panel3.add(l_gesamtzahl2);
        panel3.add(l_endnummer2);
        panel3.add(l_gesamtpreis);
        panel3.add(l_gesamtpreis2);
        panel3.add(b_pdf);
        panel3.add(ticket1);
        panel3.add(ticket2);
        panel3.add(ticket3);
        panel3.add(ticket4);
        panel3.add(ticket5);
        panel3.add(ticket6);
        panel3.add(l_logo3);
        
        
        
        b_zurück2.addActionListener(this);
        b_zurück3.addActionListener(this);
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
        
        if(ae.getSource()==this.b_start){
            b_start.setVisible(false);
            l_anmeldung.setVisible(true);
            l_benutzername.setVisible(true);
            l_passwort.setVisible(true);
            tf_benutzername.setVisible(false);
            tf_passwort.setVisible(false);
            b_17.setVisible(true);
            b_18.setVisible(true);
            b_beenden.setVisible(true);
            b_anmelden.setVisible(true);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            b_bneingabe.setVisible(true);
            b_pweingabe.setVisible(true);
            panel1.repaint();
            
        }
        
        if(ae.getSource()==this.b_anmelden){
            panel1.setVisible(false);
            panel2.setVisible(true);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            panel1.repaint();
            panel2.repaint();
            panel3.repaint();
        }
        
        if(ae.getSource()==this.b_beenden){
            panel1.setVisible(true);
            panel2.setVisible(false);
            panel3.setVisible(false);
            l_anmeldung.setVisible(false);
            l_benutzername.setVisible(false);
            l_passwort.setVisible(false);
            tf_benutzername.setVisible(false);
            tf_passwort.setVisible(false);
            b_17.setVisible(false);
            b_18.setVisible(false);
            b_beenden.setVisible(false);
            b_anmelden.setVisible(false);
            b_start.setVisible(true);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            b_bneingabe.setVisible(false);
            b_pweingabe.setVisible(false);
            panel1.repaint();
            panel2.repaint();
            panel3.repaint();
        }
        
        if(ae.getSource()==this.b_17){
            b_17.setBackground(new Color(8,224,28));
            b_18.setBackground(new Color(191,191,191));
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            b_pweingabe.setVisible(true);
            b_bneingabe.setVisible(true);
            tf_benutzername.setVisible(false);
            tf_passwort.setVisible(false);
            tabelle_17.setVisible(true);
            tabelle_18.setVisible(false);
            cb_konzertnummer.setVisible(true);
            cb_konzertnummer2.setVisible(false);
            cb_anzahl.setVisible(true);
            cb_anzahl2.setVisible(false);
            
            
        
        
            int selection4 = cb_konzertnummer.getSelectedIndex();
            int selection5 = cb_anzahl.getSelectedIndex();
            switch (selection4){
                case 0: switch (selection5){
                            case 0: l_gesamtpreis2.setText("47,90 €"); break;
                            case 1: l_gesamtpreis2.setText("95,80 €"); break;
                            case 2: l_gesamtpreis2.setText("143,70 €"); break;
                            case 3: l_gesamtpreis2.setText("191,60 €"); break;
                            case 4: l_gesamtpreis2.setText("239,50 €"); break;
                        }; break;
                case 1: switch (selection5){
                            case 0: l_gesamtpreis2.setText("13,90 €"); break;
                            case 1: l_gesamtpreis2.setText("27,80 €"); break;
                            case 2: l_gesamtpreis2.setText("41,70 €"); break;
                            case 3: l_gesamtpreis2.setText("55,60 €"); break;
                            case 4: l_gesamtpreis2.setText("69,50 €"); break;
                        }; break;
                case 3: switch (selection5){
                            case 0: l_gesamtpreis2.setText("71,50 €"); break;
                            case 1: l_gesamtpreis2.setText("143,00 €"); break;
                            case 2: l_gesamtpreis2.setText("214,50 €"); break;
                            case 3: l_gesamtpreis2.setText("286,00 €"); break;
                            case 4: l_gesamtpreis2.setText("357,50 €"); break;
                        }; break;
            }
        }
            if(ae.getSource()==this.b_18){
                b_18.setBackground(new Color(8,224,28));
                b_17.setBackground(new Color(191,191,191));
                l_logo.setVisible(true);
                l_logo2.setVisible(true);
                l_logo3.setVisible(true);
                b_pweingabe.setVisible(true);
                b_bneingabe.setVisible(true);
                tf_benutzername.setVisible(false);
                tf_passwort.setVisible(false);
                tabelle_17.setVisible(false);
                tabelle_18.setVisible(true);
                cb_konzertnummer.setVisible(false);
                cb_konzertnummer2.setVisible(true);
                cb_anzahl.setVisible(false);
                cb_anzahl2.setVisible(true);
                
                
                
            
            
                int selection6 = cb_konzertnummer2.getSelectedIndex();
                int selection7 = cb_anzahl2.getSelectedIndex();
                switch (selection6){
                    case 0: switch (selection7){
                                case 0: l_gesamtpreis2.setText("47,90 €"); break;
                                case 1: l_gesamtpreis2.setText("95,80 €"); break;
                                case 2: l_gesamtpreis2.setText("143,70 €"); break;
                                case 3: l_gesamtpreis2.setText("191,60 €"); break;
                                case 4: l_gesamtpreis2.setText("239,50 €"); break;
                            }; break;
                    case 1: switch (selection7){
                                case 0: l_gesamtpreis2.setText("13,90 €"); break;
                                case 1: l_gesamtpreis2.setText("27,80 €"); break;
                                case 2: l_gesamtpreis2.setText("41,70 €"); break;
                                case 3: l_gesamtpreis2.setText("55,60 €"); break;
                                case 4: l_gesamtpreis2.setText("69,50 €"); break;
                            }; break;
                    case 2: switch (selection7){
                                case 0: l_gesamtpreis2.setText("24,00 €"); break;
                                case 1: l_gesamtpreis2.setText("48,00 €"); break;
                                case 2: l_gesamtpreis2.setText("72,00 €"); break;
                                case 3: l_gesamtpreis2.setText("96,00 €"); break;
                                case 4: l_gesamtpreis2.setText("120,00 €"); break;
                            }; break;
                    case 3: switch (selection7){
                                case 0: l_gesamtpreis2.setText("71,50 €"); break;
                                case 1: l_gesamtpreis2.setText("143,00 €"); break;
                                case 2: l_gesamtpreis2.setText("214,50 €"); break;
                                case 3: l_gesamtpreis2.setText("286,00 €"); break;
                                case 4: l_gesamtpreis2.setText("357,50 €"); break;
                            }; break;
                    case 4: switch (selection7){
                                case 0: l_gesamtpreis2.setText("49,95 €"); break;
                                case 1: l_gesamtpreis2.setText("99,90 €"); break;
                                case 2: l_gesamtpreis2.setText("149,85 €"); break;
                                case 3: l_gesamtpreis2.setText("199,80 €"); break;
                                case 4: l_gesamtpreis2.setText("249,75 €"); break;
                            }; break;
                    case 5: switch (selection7){
                                case 0: l_gesamtpreis2.setText("72,00 €"); break;
                                case 1: l_gesamtpreis2.setText("144,00 €"); break;
                                case 2: l_gesamtpreis2.setText("216,00 €"); break;
                                case 3: l_gesamtpreis2.setText("288,00 €"); break;
                                case 4: l_gesamtpreis2.setText("360,00 €"); break;
                            }; break;
                }
            }
        
        
        if(ae.getSource()==this.b_bneingabe){
            b_bneingabe.setVisible(false);
            b_pweingabe.setVisible(true);
            tf_passwort.setVisible(false);
            tf_benutzername.setVisible(true);
            
        }
        
        if(ae.getSource()==this.b_pweingabe){
            b_pweingabe.setVisible(false);
            b_bneingabe.setVisible(true);
            tf_benutzername.setVisible(false);
            tf_passwort.setVisible(true);
           
        }
        
        
        /**Bestellfenster*/
        if(ae.getSource()==this.b_zurück1){
            panel1.setVisible(true);
            panel2.setVisible(false);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            b_pweingabe.setVisible(true);
            b_bneingabe.setVisible(true);
            tf_benutzername.setVisible(false);
            tf_passwort.setVisible(false);
          
        }
        
    
            
        if(ae.getSource()==this.b_auswahlbestätigen){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            
        }
        
        int selection8 = cb_anzahl2.getSelectedIndex();
        switch (selection8){
            case 0:  l_gesamtzahl2.setText("1 Karte"); break;
            case 1:  l_gesamtzahl2.setText("2 Karten"); break;
            case 2:  l_gesamtzahl2.setText("3 Karten"); break;
            case 3:  l_gesamtzahl2.setText("4 Karten"); break;
            case 4:  l_gesamtzahl2.setText("5 Karten"); break;
            }
            
        int selection9 = cb_konzertnummer2.getSelectedIndex();
        switch (selection9){
            case 0:  l_endnummer2.setText("1 - Andreas Gabailer"); break;
            case 1:  l_endnummer2.setText("2 - Donikkl"); break;
            case 2:  l_endnummer2.setText("3 - Exil des Schattens"); break;
            case 3:  l_endnummer2.setText("4 - Die Toten Hosen"); break;
            case 4:  l_endnummer2.setText("5 - Trailerpark"); break;
            case 5:  l_endnummer2.setText("6 - Rammstein"); break;
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
            case 0:  l_endnummer2.setText("1 - Andreas Gabailer"); break;
            case 1:  l_endnummer2.setText("2 - Donikkl"); break;
            case 2:  l_endnummer2.setText("4 - Die Toten Hosen"); break;
        }
        
        
                
        /**Rechnungsfenster*/
        if(ae.getSource()==this.b_zurück2){
            panel2.setVisible(true);
            panel3.setVisible(false);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            panel1.repaint();
            panel2.repaint();
            panel3.repaint();
        }
        
        
        if(ae.getSource()==this.b_zurück3){
            
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            l_rechnung.setVisible(true);
            b_zurück2.setVisible(true);
            l_gesamtzahl.setVisible(true);
            l_endnummer.setVisible(true);
            
            l_gesamtzahl2.setVisible(true);
            l_gesamtzahl2.setLocation(500,250);
            l_gesamtzahl2.setFont(l_gesamtzahl2.getFont().deriveFont(24f));
            
            l_endnummer2.setVisible(true);
            l_gesamtpreis.setVisible(true);
            l_gesamtpreis2.setVisible(true);
            b_pdf.setVisible(true);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            b_zurück3.setVisible(false);
            

            ticket1.setVisible(false);
            ticket2.setVisible(false);
            ticket3.setVisible(false);
            ticket4.setVisible(false);
            ticket5.setVisible(false);
            ticket6.setVisible(false);
            panel1.repaint();
            panel2.repaint();
            panel3.repaint();
        }
        
        
        
        if(ae.getSource()==this.b_pdf){
            int selection3 = cb_konzertnummer.getSelectedIndex();
             switch (selection3){
                case 0:  ticket1.setVisible(true); break;
                case 1:  ticket2.setVisible(true); break;
                case 2:  ticket3.setVisible(true); break;
                case 3:  ticket4.setVisible(true); break;
                case 4:  ticket5.setVisible(true); break;
                case 5:  ticket6.setVisible(true); break;
            }
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            l_rechnung.setVisible(false);
            b_zurück2.setVisible(false);
            l_gesamtzahl.setVisible(false);
            l_endnummer.setVisible(false);
            
            l_gesamtzahl2.setVisible(true);
            l_gesamtzahl2.setLocation(100,250);
            l_gesamtzahl2.setFont(l_gesamtzahl2.getFont().deriveFont(30f));
            
            l_endnummer2.setVisible(false);
            l_gesamtpreis.setVisible(false);
            l_gesamtpreis2.setVisible(false);
            b_pdf.setVisible(false);
            l_logo.setVisible(true);
            l_logo2.setVisible(true);
            l_logo3.setVisible(true);
            b_zurück3.setVisible(true);
            panel1.repaint();
            panel2.repaint();
            panel3.repaint();
        }
    }
    
    public void FensterAufbauenV1() {
        
        b_start.setVisible(true);
        l_anmeldung.setVisible(false);
        l_benutzername.setVisible(false);
        l_passwort.setVisible(false);
        tf_benutzername.setVisible(false);
        tf_passwort.setVisible(false);
        b_17.setVisible(false);
        b_18.setVisible(false);
        b_beenden.setVisible(false);
        b_anmelden.setVisible(false);
        l_logo.setVisible(true);
        l_logo2.setVisible(true);
        l_logo3.setVisible(true);
        b_bneingabe.setVisible(false);
        b_pweingabe.setVisible(false);
        
        panel1.setVisible(true);

    }
    
    public void FensterAufbauenV2() {
        
        l_bestellung.setVisible(true);
        l_anzahl.setVisible(true);
        b_zurück1.setVisible(true);
        l_konzertnummer.setVisible(true);
        b_auswahlbestätigen.setVisible(true);
        l_logo.setVisible(true);
        l_logo2.setVisible(true);
        l_logo3.setVisible(true);
        
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
        ticket1.setVisible(false);
        ticket2.setVisible(false);
        ticket3.setVisible(false);
        ticket4.setVisible(false);
        ticket5.setVisible(false);
        ticket6.setVisible(false);
        l_logo.setVisible(true);
        l_logo2.setVisible(true);
        l_logo3.setVisible(true);
               
        panel3.setVisible(true);
        
    }
    
    public void Einfuegen(){
        
    }
}
