import javax.swing.*;

public class Board {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess Game"); //this create the frame of the chess game
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this makes the frame window to close when you click on the exit
		frame.setSize(500, 500);//sets the size of the frame
		frame.setVisible(true);
		UserInterface board = new UserInterface();
		frame.add(board);
		//BoardMouseListener listener = new BoardMouseListener();
		//board.addBoardMouseLister(listener);
		}

}
