package com.csulb.ooad.assignmnet;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class MainframeTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		JFrame jFrame=new JFrame("Swapnil");
		JPanel textPanel=new JPanel();
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 3));
		textPanel.setLayout(new BorderLayout());
		textPanel.add(new JTextArea(30,30),BorderLayout.PAGE_START);
		jFrame.setSize(250, 400);
		JTextArea jTextArea=new JTextArea(20, 400);
		JButton jbutton1=new JButton("1");
		jbutton1.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton1, BorderLayout.LINE_START);
//		System.out.println(jFrame.getContentPane().);
		JButton jbutton2=new JButton("2");
		jbutton2.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton2, BorderLayout.CENTER);
		JButton jbutton3=new JButton("3");
		jbutton3.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton3, BorderLayout.LINE_END);
		JButton jbutton4=new JButton("4");
		jbutton4.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton4, BorderLayout.LINE_START);
		JButton jbutton5=new JButton("5");
		jbutton5.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton5, BorderLayout.CENTER);
		JButton jbutton6=new JButton("6");
		jbutton6.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton6, BorderLayout.LINE_END);
		JButton jbutton7=new JButton("7");
		jbutton7.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton7, BorderLayout.LINE_START);
		JButton jbutton8=new JButton("8");
		jbutton8.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton8, BorderLayout.CENTER);
		JButton jbutton9=new JButton("9");
		JButton jbutton0=new JButton("0");
		JButton strButton=new JButton("*");
		JButton boundButton=new JButton("#");
		jbutton9.setPreferredSize(new Dimension(83, 100));
		jFrame.getContentPane().add(jbutton9, BorderLayout.LINE_END);
		buttonPanel.setLayout(new GridLayout(4,3));
		buttonPanel.add(jbutton1);
		buttonPanel.add(jbutton2);
                buttonPanel.add(jbutton3);
                buttonPanel.add(jbutton4);
                buttonPanel.add(jbutton5);
                buttonPanel.add(jbutton6);
                buttonPanel.add(jbutton7);
                buttonPanel.add(jbutton8);
                buttonPanel.add(jbutton9);
                buttonPanel.add(strButton);
                buttonPanel.add(jbutton0);
                buttonPanel.add(boundButton);
//		JPanel jPanel=new JPanel();
        jFrame.getContentPane().setLayout(new BorderLayout());
		jFrame.getContentPane().add(textPanel,BorderLayout.NORTH);
		jFrame.getContentPane().add(buttonPanel,BorderLayout.CENTER);
		jFrame.setVisible(true);
	}
}
