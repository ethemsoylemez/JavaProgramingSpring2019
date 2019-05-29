package day47_blocks;

public class InitBlockTest {
	

	public static void main(String[] args) {
		
		//whenever we crate an object than both init block and constructor will run
		// firstly init than constructor
		InitBlock in = new InitBlock();
		InitBlock in2 = new InitBlock();
	}
}
