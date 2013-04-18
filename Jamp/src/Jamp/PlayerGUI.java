package Jamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PlayerGUI extends JFrame{
	private static final long serialVersionUID = 3987374733901113836L;
	
	protected JMenuBar menubar = new JMenuBar();
	public PlayerGUI(){
		setTitle("Jamp - winamp like mp3 player");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	public void init(){
		addMenu();
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		addQuitButton(panel);
	}
	public void addMenu(){
		addMenu_file();
		addMenu_play();
		addMenu_help();
		setJMenuBar(menubar);
	}
	public void addMenu_file(){
		// make file menu
		JMenu file = new JMenu("file");
		file.setMnemonic(KeyEvent.VK_F);
		
		// make open item
		JMenuItem openMenuItem = new JMenuItem("open..");
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.setToolTipText("Open a file or folder");
		openMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_file/openMenuItem/");
			}
		});
		// make close item
		JMenuItem closeMenuItem = new JMenuItem("close");
		closeMenuItem.setMnemonic(KeyEvent.VK_O);
		closeMenuItem.setToolTipText("close current file");
		closeMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_file/closeMenuItem/");
			}
		});
		// make quit item
		JMenuItem quitMenuItem = new JMenuItem("quit");
		quitMenuItem.setMnemonic(KeyEvent.VK_E);
		quitMenuItem.setToolTipText("Quit Jamp");
		quitMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		

		file.add(openMenuItem);
		file.add(closeMenuItem);
		file.addSeparator();
		file.add(quitMenuItem);
		
		menubar.add(file);
	}
	public void addMenu_play(){
		// make play menu
		JMenu play = new JMenu("play");
		play.setMnemonic(KeyEvent.VK_P);

		// make play item
		JMenuItem playMenuItem = new JMenuItem("play");
		playMenuItem.setMnemonic(KeyEvent.VK_O);
		playMenuItem.setToolTipText("play current file");
		playMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/playMenuItem/");
			}
		});
		// make pause item
		JMenuItem pauseMenuItem = new JMenuItem("pause");
		pauseMenuItem.setMnemonic(KeyEvent.VK_O);
		pauseMenuItem.setToolTipText("puase current file");
		pauseMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/puaseMenuItem/");
			}
		});
		// make stop item
		JMenuItem stopMenuItem = new JMenuItem("stop");
		stopMenuItem.setMnemonic(KeyEvent.VK_O);
		stopMenuItem.setToolTipText("stop current file");
		stopMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/stopMenuItem/");
			}
		});
		// make fast forward item
		JMenuItem ffMenuItem = new JMenuItem("fast forward");
		ffMenuItem.setMnemonic(KeyEvent.VK_O);
		ffMenuItem.setToolTipText("fast forward current file");
		ffMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/ffMenuItem/");
			}
		});
		// make rewind item
		JMenuItem rwMenuItem = new JMenuItem("rewind");
		rwMenuItem.setMnemonic(KeyEvent.VK_O);
		rwMenuItem.setToolTipText("rewind current file");
		rwMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/rwMenuItem/");
			}
		});
		// make next item
		JMenuItem nextMenuItem = new JMenuItem("next");
		nextMenuItem.setMnemonic(KeyEvent.VK_O);
		nextMenuItem.setToolTipText("jump to next song");
		nextMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/nextMenuItem/");
			}
		});
		// make prev item
		JMenuItem prevMenuItem = new JMenuItem("prev");
		prevMenuItem.setMnemonic(KeyEvent.VK_O);
		prevMenuItem.setToolTipText("jump to previous song");
		prevMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_play/prevMenuItem/");
			}
		});
		
		play.add(playMenuItem);
		play.add(pauseMenuItem);
		play.add(stopMenuItem);
		play.addSeparator();
		play.add(ffMenuItem);
		play.add(rwMenuItem);
		play.addSeparator();
		play.add(nextMenuItem);
		play.add(prevMenuItem);
		
		menubar.add(play);
	}
	public void addMenu_help(){
		// make file menu
		JMenu help = new JMenu("help");
		help.setMnemonic(KeyEvent.VK_H);
		
		// make help item
		JMenuItem helpMenuItem = new JMenuItem("help..");
		helpMenuItem.setMnemonic(KeyEvent.VK_F1);
		helpMenuItem.setToolTipText("Some Help");
		helpMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_help/helpMenuItem/");
			}
		});
		// make bug report item
		JMenuItem reportMenuItem = new JMenuItem("report..");
		reportMenuItem.setToolTipText("let us know the bug");
		reportMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_help/reportMenuItem/");
			}
		});
		// make close item
		JMenuItem aboutMenuItem = new JMenuItem("about..");
		aboutMenuItem.setMnemonic(KeyEvent.VK_O);
		aboutMenuItem.setToolTipText("about Jamp");
		aboutMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("ToDo:PlayerGUI/addMenu_help/aboutMenuItem/");
			}
		});
		

		help.add(helpMenuItem);
		help.add(reportMenuItem);
		help.addSeparator();
		help.add(aboutMenuItem);
		
		menubar.add(help);
	}
	public void addQuitButton(JPanel panel){
		JButton quitButton = new JButton("quit");
		quitButton.setBounds(220, 80, 80, 30);
		quitButton.setToolTipText("click this to quit");
		quitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		
		panel.add(quitButton);
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				PlayerGUI player = new PlayerGUI();
				player.setVisible(true);
			}
		});
	}
}