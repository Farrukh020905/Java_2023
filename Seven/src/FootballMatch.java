import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FootballMatch extends JFrame implements ActionListener {
    private JButton milanButton, madridButton;
    private JLabel resultLabel, lastScorerLabel, winnerLabel;
    private int milanScore = 0, madridScore = 0;

    public FootballMatch() {
        setTitle("Milan vs Madrid");
        setSize(300, 250);
        setLayout(new GridLayout(4, 2));

        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(this);
        add(milanButton);

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(this);
        add(madridButton);

        resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        add(resultLabel);

        lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        add(lastScorerLabel);

        winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);
        add(winnerLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getSource() == madridButton) {
            madridScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}
