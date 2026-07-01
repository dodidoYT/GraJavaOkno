import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;

public class GraJavaOknoExe {
    public static void main(String[] args) {
        JFrame okno = new JFrame("GraJava.exe");
        
        ImageIcon ikona = new ImageIcon(GraJavaOknoExe.class.getResource("/logo.jpg"));
        okno.setIconImage(ikona.getImage());
        okno.setSize(400, 200);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setLayout(new FlowLayout());

        
        JLabel imieLabel = new JLabel("Elo mordo jak ci na imie?");
        JTextField poleImie = new JTextField(15);
        JButton przyciskZatierdzImie = new JButton("Zapisz imie");
        String zalogowanyGoogle = "false";

        JLabel wiekLabel = new JLabel("A ile masz lat?");
        JTextField poleWiek = new JTextField(5);
        JButton przyciskZatierdzWiek = new JButton("Zapisz wiek");

        JLabel hasloLabel = new JLabel("No dobra... ale napisz hasło! (Haslo1234)");
        JTextField poleHaslo = new JTextField(15);
        JButton przyciskZatierdzHaslo= new JButton("Zatwierdź hasło");

        JLabel pulpitLabel = new JLabel("Witaj na pulpicie! Kliknij WEB aby przejść do przeglądraki.");
        JLabel pulpitLabel2 = new JLabel("kliknij GRY aby przjść do gier.");
        JButton opcja1Przycisk = new JButton("WEB");
        JButton opcja2Przycisk = new JButton("GRY");
        
        JLabel przegladarkaAdresLabel = new JLabel("Wpisz adres...");
        JTextField przegladarkaAdresPole = new JTextField(15);
        JButton przegladarkaWyszukaj = new JButton("Wyszukaj");

        JLabel wyszukajGoogleLabel = new JLabel("Wyszukaj w google...");
        JTextField wyszukajGooglePole = new JTextField(15);
        JButton wyszukajGoogleButton = new JButton("Wyszukaj google...");

        JLabel youtubeNieZalogowanyLabel = new JLabel("Nie jesteś zalogowany! Kliknij zaloguj aby zalogować.");
        JButton youtubeNieZalogowanyButton = new JButton("Zaloguj");

        wiekLabel.setVisible(false);
        poleWiek.setVisible(false);
        przyciskZatierdzWiek.setVisible(false);

        hasloLabel.setVisible(false);
        poleHaslo.setVisible(false);
        przyciskZatierdzHaslo.setVisible(false);

        pulpitLabel.setVisible(false);
        pulpitLabel2.setVisible(false);
        opcja1Przycisk.setVisible(false);
        opcja2Przycisk.setVisible(false);
        
        przegladarkaAdresLabel.setVisible(false);
        przegladarkaAdresPole.setVisible(false);
        przegladarkaWyszukaj.setVisible(false);

        wyszukajGooglePole.setVisible(false);
        wyszukajGoogleLabel.setVisible(false);
        wyszukajGoogleButton.setVisible(false);

        youtubeNieZalogowanyLabel.setVisible(false);
        youtubeNieZalogowanyButton.setVisible(false);
        
        // Wrzucamy je do okna
        okno.add(imieLabel);
        okno.add(poleImie);
        okno.add(przyciskZatierdzImie);
        okno.add(wiekLabel);
        okno.add(poleWiek);
        okno.add(przyciskZatierdzWiek);
        okno.add(hasloLabel);
        okno.add(poleHaslo);
        okno.add(przyciskZatierdzHaslo);
        okno.add(pulpitLabel);
        okno.add(pulpitLabel2);
        okno.add(opcja1Przycisk);
        okno.add(opcja2Przycisk);
        okno.add(przegladarkaAdresLabel);
        okno.add(przegladarkaAdresPole);
        okno.add(przegladarkaWyszukaj);
        okno.add(wyszukajGoogleLabel);
        okno.add(wyszukajGooglePole);
        okno.add(wyszukajGoogleButton);
        okno.add(youtubeNieZalogowanyLabel);
        okno.add(youtubeNieZalogowanyButton);
        okno.setVisible(true);
        
        
        przyciskZatierdzImie.addActionListener(e -> {
            
            imieLabel.setVisible(false);
            poleImie.setVisible(false);
            przyciskZatierdzImie.setVisible(false);
            String imie = poleImie.getText();

            
            wiekLabel.setVisible(true);
            poleWiek.setVisible(true);
            przyciskZatierdzWiek.setVisible(true);
            System.out.println("Zapisano imie: " + imie + ".");
        });
        
        przyciskZatierdzWiek.addActionListener(e -> {
            wiekLabel.setVisible(false);
            poleWiek.setVisible(false);
            przyciskZatierdzWiek.setVisible(false);
            String wiek = poleWiek.getText();

            hasloLabel.setVisible(true);
            poleHaslo.setVisible(true);
            przyciskZatierdzHaslo.setVisible(true);
            System.out.println("Zapisano wiek: " + wiek + ".");
            
        });
            przyciskZatierdzHaslo.addActionListener(e -> {
            hasloLabel.setVisible(false);
            poleHaslo.setVisible(false);
            przyciskZatierdzHaslo.setVisible(false);

            pulpitLabel.setVisible(true);
            pulpitLabel2.setVisible(true);
            opcja1Przycisk.setVisible(true);
            opcja2Przycisk.setVisible(true);
            System.out.println("Otwarto pulpit.");
            
        });
            opcja1Przycisk.addActionListener(e -> {
            pulpitLabel.setVisible(false);
            pulpitLabel2.setVisible(false);
            opcja1Przycisk.setVisible(false);
            opcja2Przycisk.setVisible(false);
            
            przegladarkaAdresLabel.setVisible(true);
            przegladarkaAdresPole.setVisible(true);
            przegladarkaWyszukaj.setVisible(true);
            
            System.out.println("Wybrano opcję 1 (przeglądrarka).");

            
        });
        przegladarkaWyszukaj.addActionListener(e -> {
            przegladarkaWyszukaj.setVisible(false);
            przegladarkaAdresPole.setVisible(false);
            przegladarkaAdresLabel.setVisible(false);
            String adres = przegladarkaAdresPole.getText();
            
            
            if (adres.equals("https://google.com")) {
                wyszukajGooglePole.setVisible(true);
                wyszukajGoogleLabel.setVisible(true);
                wyszukajGoogleButton.setVisible(true);
                String googleWyszukaj = wyszukajGoogleLabel.getText();  
            
                if (googleWyszukaj.equals("Youtube")) {
                    if (zalogowanyGoogle.equals("false")) {
                        System.out.println("Otwarto youtube w bez zalogowanego konta google");
                        
                    } else {
                        
                    }
                }
                }
            
            System.out.println("Otwarto stronę: " + adres);

            
        });

    }   
}
