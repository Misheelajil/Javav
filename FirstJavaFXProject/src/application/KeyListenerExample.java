package application;
import java.awt.*;  
import java.awt.event.*;  
public class KeyListenerExample extends Frame implements KeyListener{  
    Label l;  
    TextArea area;
    public static int x = 20;
    public static int y = 80;
    KeyListenerExample(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(x,y,300, 300);  
        area.addKeyListener(this);  
        
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
    	int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
        l.setText("VK_LEFT Key Pressed");  
        x-=50;
		}
		else if (key == KeyEvent.VK_RIGHT) {
	        l.setText("VK_RIGHT Key Pressed");  
	        x+=50;
	        }
		else if (key == KeyEvent.VK_UP) {
	        l.setText("VK_UP Key Pressed");  
	        y-=50;
	        }
		else if (key == KeyEvent.VK_DOWN) {
	        l.setText("VK_DOWN Key Pressed");  
	        y+=50;
	        }
		else {
			l.setText("KEY PRESSED DIFFERENT");
		
		}
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released"); 
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new KeyListenerExample();  
    }  
}  