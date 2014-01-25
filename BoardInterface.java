
public interface BoardInterface {
	/* Creates and resets board rather than a constructor */
	public void newBoard();
	
	/* returns the element at (x, y) */
	public String getElement(int x, int y);
	
	/* changes the element at (x, y) to the String ele */
	public int changeElement(int x, int y, String ele);
	
	/* prints the board to standard out (stdout) */
	public void print();
}
