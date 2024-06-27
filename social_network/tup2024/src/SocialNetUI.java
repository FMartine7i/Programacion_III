import javax.swing.*;
import java.awt.*;

public class SocialNetUI extends JFrame {
    private SocialNetwork socialNetwork;
    private JPanel mainPanel;
    private JList<Usuario> usersList;
    private JLabel profilePic;
    private JList<Usuario> friendsList;
    private JTextField searchField;
    private RoundedBtn sendBtn;

    public SocialNetUI() {
        createUIComponents();
    }

    public void createUIComponents() {
        setTitle("Vibe");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                graphics.setColor(Color.decode("#252426"));
                graphics.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        mainPanel.setLayout(new BorderLayout());
        setContentPane(mainPanel);

        JPanel navPanel = new JPanel();
        navPanel.setPreferredSize(new Dimension(getWidth() / 4, getHeight()));
        navPanel.setBackground(Color.decode("#0f0d12"));
        navPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

        String[] options = {"Home", "Explore", "Notifications", "Messages"};
        for (String option : options) {
            JLabel optionLabel = new JLabel(option);
            optionLabel.setForeground(Color.WHITE);
            optionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            navPanel.add(optionLabel);
        }
        mainPanel.add(navPanel, BorderLayout.WEST);

        JPanel header = new JPanel();
        header.setPreferredSize(new Dimension(getWidth(), getHeight() / 8));
        header.setBackground(Color.decode("#8d0aff"));
        mainPanel.add(header, BorderLayout.NORTH);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchPanel.setOpaque(false);
        mainPanel.add(searchPanel, BorderLayout.CENTER);

        usersList = new JList<>();
        profilePic = new JLabel();
        friendsList = new JList<>();
        searchField = new JTextField();

        sendBtn = new RoundedBtn("Enviar");
        searchPanel.add(sendBtn);

        setVisible(true);
    }
}
