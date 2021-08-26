package com.projeto.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.projeto.model.model.Autor;
import com.projeto.model.service.AutorService;
import com.projeto.view.autor.AutorFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Projeto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -586100542729298412L;
	
	private JPanel contentPane;
	private JTextField nometextField;
	
	private AutorService autorService = new AutorService();
	
	private Autor autor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projeto frame = new Projeto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Projeto() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 377, 427);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		AutorFrame autorFrame = new AutorFrame();
		autorFrame.setVisible(true);
	}

}
