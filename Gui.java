package diceRoller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollerPanel extends JPanel {
	private JLabel title, input, type;
	private JRadioButton four, six, eight, ten, twelve, twenty;
	private JTextField times;
	private int timesRolled = 0;

	public RollerPanel () {
		title = new JLabel("Welcome to the Foushee Dice Roller!");
		title.setFont(new Font("Helvetica", Font.PLAIN, 36));
		input = new JLabel("How many times would you like to roll this die?");
		input.setFont(new Font("Helvetica", Font.PLAIN, 24));
		type = new JLabel("What kind of die would you like to roll?");
		type.setFont(new Font("Helvetica", Font.PLAIN, 24));

		times = new JTextField(5);
		times.setBackground(Color.RED);
		times.addActionListener(new TempListener());

		four = new JRadioButton("Four-Sided Die");
		six = new JRadioButton("Six-Sided Die");
		eight = new JRadioButton("Eight-Sided Die");
		ten = new JRadioButton("Ten-Sided Die");
		twelve = new JRadioButton("Twelve-Sided Die");
		twenty = new JRadioButton("Twenty-Sided Die");

		ButtonGroup group = new ButtonGroup();
		group.add(four);
		group.add(six);
		group.add(eight);
		group.add(ten);
		group.add(twelve);
		group.add(twenty);


	}
	public class TempListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String text = times.getText();
			timesRolled = Integer.parseInt(text);

		}

	}

	class RadioButtonActionListener implements ActionListener {
	    @Override
	    public void actionPerformed(ActionEvent event) {
	        JRadioButton button = (JRadioButton) event.getSource();
	        int counter = 0;
	        int out4 = 0, out6 = 0, out8 = 0, out10 = 0, out12 = 0, out20 = 0;

	        if (button == four) {
	        	for (counter = 0; counter <= timesRolled; counter++) {
	        		FourSided fourside = new FourSided();
	        		out4 += fourside.roll();
	        	}
	        } else if (button == six) {
	        	for (counter = 0; counter <= timesRolled; counter++) {
	        		SixSided sixside = new SixSided();
	        		out6 += sixside.roll();
	        	}

	        } else if (button == eight) {
	        	for (counter = 0; counter <=timesRolled; counter++) {
	        		EightSided eightside = new EightSided();
	        		out8 += eightside.roll();

	        	}

	        } else if (button == ten) {
	        	for(counter = 0; counter <= timesRolled; counter++) {
	        		TenSided tenside = new TenSided();
	        		out10 += tenside.roll();
	        	}

	        } else if (button == twelve) {
	        	for(counter = 0; counter <= timesRolled; counter++) {
	        		TwelveSided twelveside = new TwelveSided();
	        		out12 += twelveside.roll();
	        	}

	        } else if (button == twenty) {
	        	for(counter = 0; counter <= timesRolled; counter++) {
	        		TwentySided twentyside = new TwentySided();
	        		out20 += twentyside.roll();
	        	}

	        }
	    }
	}

}
