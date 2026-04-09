import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public abstract class BaseDashboard extends JFrame {
    protected final User currentUser;
    protected final JTabbedPane tabs;

    protected BaseDashboard(User currentUser, String roleTitle, int width, int height) {
        this.currentUser = currentUser;
        setTitle(roleTitle + " - " + currentUser.getSafeDisplayName());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JMenuBar bar = new JMenuBar();
        JMenu accountMenu = new JMenu("Account");
        JMenuItem logoutItem = new JMenuItem("Logout");
        logoutItem.addActionListener(e -> logout());
        accountMenu.add(logoutItem);
        bar.add(accountMenu);
        setJMenuBar(bar);

        tabs = new JTabbedPane();
        add(tabs, BorderLayout.CENTER);
    }

    protected void addTab(String title, java.awt.Component component) {
        tabs.addTab(title, component);
    }

    protected void installRefreshOnTabSwitch(Runnable refreshAction) {
        tabs.addChangeListener(e -> refreshAction.run());
    }

    protected void logout() {
        dispose();
        new LoginFrame();
    }
}
