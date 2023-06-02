import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
* File: MainFrame.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023-06-02
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
public class MainFrame extends JFrame {
    JPanel buttonPanel;
    JButton prevButton;
    JButton nextButton;
    InputPanel namePanel;
    InputPanel cityPanel;
    InputPanel addressPanel;
    InputPanel birthPanel;
    InputPanel salaryPanel;
    public MainFrame() {
        this.initComponent();
        this.setComponent();
        this.setFrame();
    }
    private void initComponent() {
        this.buttonPanel = new JPanel();
        this.prevButton = new JButton("Előző:");
        this.nextButton = new JButton("Következő:");
        this.namePanel = new InputPanel("Név:");
        this.cityPanel = new InputPanel("Település:");
        this.addressPanel = new InputPanel("Cím:");
        this.birthPanel = new InputPanel("Született:");
        this.salaryPanel = new InputPanel("Fizetés:");
    }
    private void setComponent() {
        this.buttonPanel.add(this.prevButton);
        this.buttonPanel.add(this.nextButton);
    }
    private void setFrame() {
        this.setLayout(
                new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(this.buttonPanel);
        this.add(this.namePanel);
        this.add(this.cityPanel);
        this.add(this.addressPanel);
        this.add(this.birthPanel);
        this.add(this.salaryPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 450);
        this.setVisible(true);
    }
    public JPanel getButtonPanel() {
        return buttonPanel;
    }
    public JButton getPrevButton() {
        return prevButton;
    }
    public JButton getNextButton() {
        return nextButton;
    }

}