package day47_blocks;

public class AllBlocks {
	
	int nonStaticInt = 10;
	static int staticInt = 10;
	
	static {
		System.out.println("STATIC BLOCK - I run first and only once");
		//nonStaticInt--; non-static can't call static, to access I have to create an AllBlocks object
		staticInt-= 4;
	}
	{
		System.out.println("INIT BLOCK - I run each time when object is created. Before Constructor");
		nonStaticInt += 5;
		staticInt += 5;
	}
	 
	public AllBlocks() {
		System.out.println("CONSTRUCTOR - I run each time when object is created. After init blok");
		nonStaticInt += 3;
		staticInt += 3;
	}

}
