import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class BoardMouseListener implements MouseListener, MouseMotionListener {
static int x,y;
	public void mouseDragged(MouseEvent arg0) {

		
	}

	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("object will move");
		//repaint();
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
		System.out.println("Something was clicked");
		//repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
