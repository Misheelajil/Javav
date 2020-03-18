package application;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AWT {
	public static class Example01 extends Frame implements KeyListener {
		public static boolean leftDirection = false;
		public static boolean rightDirection = true;
		public static boolean upDirection = false;
		public static boolean downDirection = false;
		private int x = 150;
		private int y = 150;

		public static void main(String args[]) {
			new Example01();
		}

		public Example01() {
			// Title our frame.
			super("Java 2D Example01");
			// Set the size for the frame.
			setSize(400, 300);
			// We need to turn on the visibility of our frame
			// by setting the Visible parameter to true.
			setVisible(true);

		}

		/**
		 * The paint method provides the real magic. Here we cast the Graphics object to
		 * Graphics2D to illustrate that we may use the same old graphics capabilities
		 * with Graphics2D that we are used to using with Graphics.
		 **/
		public void paint(Graphics g) {

			try {
				Graphics2D g2d = (Graphics2D) g;
				// sambar

				g2d.setPaint(new Color(150, 150, 150));
				g2d.fillRect(25, 25, 350, 250);
				// durs
				g2d.setPaint(Color.BLACK);
				g2d.fillRect(150, 150, 100, 25);
				Label area = new Label();
				area.setBounds(250, 80, 100, 100);
				area.addKeyListener(this);
				add(area);
				
				int i = 0;
				while (i < 5) {

					g2d.setPaint(new Color(150, 150, 150));
					g2d.fillRect(25, 25, 350, 250);
					g2d.setPaint(Color.BLACK);
					g2d.fillRect(x, y, 50, 50);
					tick(g2d, i, area);
					Thread.sleep(2000);
					i++;
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		void tick(Graphics2D g2d, int i, Label area) {

			if (leftDirection) {
				x = x - (i * 5);
				area.resize(150 - (i * 5), 150 - (i * 5));
			} else if (rightDirection) {
				x = x + (i * 5);
				area.resize(150 + (i * 5), 150 + (i * 5));
			} else if (upDirection) {
				y = y - (i * 5);
			} else if (downDirection) {
				y = y + (i * 5);
			} else {
				System.out.println("Not Working");
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_LEFT) {
				leftDirection = true;
				rightDirection = false;
				upDirection = false;
				downDirection = false;
				System.out.println("LEEEEEEEEEEEFT");
			} else if (key == KeyEvent.VK_RIGHT) {
				leftDirection = false;
				rightDirection = true;
				upDirection = false;
				downDirection = false;
				System.out.println("RIIIIIIIIIIIIIIGHT");
			} else if (key == KeyEvent.VK_DOWN) {
				leftDirection = false;
				rightDirection = false;
				upDirection = false;
				downDirection = true;
				System.out.println("DOOOOOOOOOOOOOWN");
			} else if (key == KeyEvent.VK_UP) {
				leftDirection = false;
				rightDirection = false;
				upDirection = true;
				downDirection = false;
				System.out.println("UUUUUUUUUUP");
			} else {
				System.out.println("NOT A RIGHT KEYEVENT!");
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

}