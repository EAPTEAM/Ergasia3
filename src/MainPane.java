import javax.swing.*;

public class MainPane extends JFrame{
    private JPanel mainPanel;
    private JLabel topBanner;
    private JPanel centerUI;
    private JLabel countrySelectorLabel;
    private JComboBox countrySelector;
    private JButton fetchDataButton;
    private JLabel gdpDataLabel;
    private JTextField gdpDataCountry;
    private JLabel oilDataLabel;
    private JTextField textField1;
    private JLabel oilAvailableTimespanLabel;
    private JLabel gdpAvailableTimespanLabel;
    private JPanel bottomButtons;
    private JButton saveButton;
    private JButton plotButton;
    private JButton deleteButton;
    private JCheckBox checkBox;
    private JTable oilTable;
    private JTable gdpTable;
    private JLabel oilRange;
    private JLabel topImage;

    public MainPane(String appName) {
        super(appName); //ονομα που θα εμφανίζεται στην μπάρα του παραθυρου
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //οταν πατας Χ να κλείνει
        this.setVisible(true); // αν δεν το βαλεις δεν το βλεπεις, τρομερο?
        this.setContentPane(mainPanel); // ποιο πάνελ να δείξει, βαζεις το κεντρικό και μετά οτι ειναι μέσα του το δείχνει
        this.pack();
        this.setSize(600,600);// αρχικό μέγεθος παραθύρου

        ImageIcon banner = new ImageIcon("banner.jpg");
        topBanner.setIcon(banner);
    }
    public static void main(String[] args) {
        JFrame entryFrame = new MainPane("3η Εργασία ΠΛΗ 24 ΕΑΠ");
    }


}

