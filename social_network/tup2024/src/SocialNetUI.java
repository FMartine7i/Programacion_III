import javax.swing.*;
import java.awt.*;

public class SocialNetUI extends JFrame {
    private SocialNetwork socialNetwork;
    private JPanel mainPanel;
    private JList<Usuario> usersList;
    private JLabel profilePic;
    private JList<Usuario> friendsList;
    private JTextField searchField;
    private RoundedBtn send;

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

        usersList = new JList<>();
        profilePic = new JLabel();
        friendsList = new JList<>();
        searchField = new JTextField();
        send = new RoundedBtn("Enviar");

        setVisible(true);
    }
}
