package com.csulb.ooad.assignmnet;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.text.BadLocationException;

//import com.csulb.ooad.assignmnet.CellPhone.InnerListener;

public class TestMain extends JFrame implements Runnable {
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");
	private JButton astrButton = new JButton("*");
	private JButton button0 = new JButton("0");
	private JButton boundButton = new JButton("#");
	private JButton buttonErase = new JButton("Erase");
	private JButton buttonCall = new JButton("Call");
	private JButton buttonBackSpace = new JButton("<=");
	private static String displayTextField = "";
	private JTextArea textPane = new JTextArea();
	private boolean flagForCallInAction = false;

	public TestMain() {
	}

	private class InnerListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			boolean flagToAppend = true;
			try {
				if (!(e.getSource() == buttonBackSpace || e.getSource() == buttonErase))
					getSound();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (e.getSource() == button1) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "1";
					textPane.setText(displayTextField);
				}

			} else if (e.getSource() == button2) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "2";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button3) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "3";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button4) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "4";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button5) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "5";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button6) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "6";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button7) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "7";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button8) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "8";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button9) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}
				if (flagToAppend) {
					displayTextField = displayTextField + "9";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == button0) {
				if (displayTextField.length() == 3)
					displayTextField += "-";
				else if (displayTextField.length() == 8)
					displayTextField = displayTextField.substring(0, 7) + "-"
							+ displayTextField.substring(7, displayTextField.length());
				else if (displayTextField.length() >= 12 && displayTextField.contains("-")) {
					flagToAppend = false;
				}

				if (flagToAppend) {
					displayTextField = displayTextField + "0";
					textPane.setText(displayTextField);
				}
			} else if (e.getSource() == astrButton) {
				displayTextField = displayTextField + "*";
				textPane.setText(displayTextField);
			} else if (e.getSource() == boundButton) {
				displayTextField = displayTextField + "#";
				textPane.setText(displayTextField);
			} else if (e.getSource() == buttonErase) {
				displayTextField = "";
				textPane.setText(displayTextField);
			} else if (e.getSource() == buttonBackSpace) {
				if (displayTextField.length() == 11 && !displayTextField.contains("-")) {
					displayTextField = displayTextField.substring(0, 3) + "-" + displayTextField.substring(3, 6) + "-"
							+ displayTextField.substring(6);
				}
				if (displayTextField.length() == 10)
					displayTextField = displayTextField.substring(0, displayTextField.lastIndexOf("-"))
							+ displayTextField.substring(displayTextField.lastIndexOf("-") + 1);
				else if (displayTextField.length() == 5)
					displayTextField = displayTextField.substring(0, displayTextField.lastIndexOf("-"))
							+ displayTextField.substring(displayTextField.lastIndexOf("-") + 1);
				displayTextField = displayTextField.substring(0, displayTextField.length() - 1);
				textPane.setText(displayTextField);
			} else if (e.getSource() == buttonCall) {
				disableButton();
				if (!flagForCallInAction) {
					displayTextField = displayTextField + "\n" + "Calling " + displayTextField;
					flagForCallInAction = true;
					textPane.setText(displayTextField);
				} else {
					try {

						flagForCallInAction = false;
						// textPane.getDocument().insertString(displayTextField.length()-1,"
						// \n" + "Hanging Up",null );
						displayTextField = displayTextField + " \n" + "Hanging Up";
						textPane.setText(displayTextField);
						textPane.update(textPane.getGraphics());
						startThread();
						enableButton();

					} catch (Exception exception) {

					}
				}
			}

		}

	}

	public void disableButton() {
		button0.setEnabled(false);
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button8.setEnabled(false);
		button9.setEnabled(false);
		button9.setEnabled(false);
		astrButton.setEnabled(false);
		boundButton.setEnabled(false);
		buttonBackSpace.setEnabled(false);
		buttonErase.setEnabled(false);

	}

	public void enableButton() {

		button0.setEnabled(true);
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button7.setEnabled(true);
		button8.setEnabled(true);
		button9.setEnabled(true);
		button9.setEnabled(true);
		astrButton.setEnabled(true);
		boundButton.setEnabled(true);
		buttonBackSpace.setEnabled(true);
		buttonErase.setEnabled(true);
		// textPane.

	}

	public void getSound() throws LineUnavailableException, Exception {
		String soundName = "sms-alert-1-daniel_simon.wav";
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();

	}

	public static void main(String[] args) throws LineUnavailableException, Exception {
		TestMain t = new TestMain();
		Thread tread = new Thread(t);
		tread.start();

	}

	public void startThread() throws BadLocationException {

		Thread t = Thread.currentThread();
		try {
			// System.out.println("InThread");
			t.sleep(5000);
			System.out.println("after Thread");
			textPane.setText("");
			textPane.update(textPane.getGraphics());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// textPane.getDocument().remove(0, displayTextField.length());
		}
	}

	@Override
	public void run() {
		setMinimumSize(new Dimension(250, 400));
		setMaximumSize(new Dimension(250, 400));
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 232, 105);
		getContentPane().add(panel);
		panel.setLayout(null);

		textPane.setEditable(false);
		textPane.setBounds(0, 0, 232, 105);
		panel.add(textPane);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 104, 232, 249);
		getContentPane().add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(5, 3));

		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(astrButton);
		buttonPanel.add(button0);
		buttonPanel.add(boundButton);
		buttonPanel.add(buttonErase);
		buttonPanel.add(buttonCall);
		buttonPanel.add(buttonBackSpace);
		InnerListener listener = new InnerListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		button0.addActionListener(listener);
		astrButton.addActionListener(listener);
		boundButton.addActionListener(listener);
		buttonErase.addActionListener(listener);
		buttonBackSpace.addActionListener(listener);
		buttonCall.addActionListener(listener);
		setVisible(true);

	}
}