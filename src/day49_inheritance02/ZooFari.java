package day49_inheritance02;

public class ZooFari {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Leopard leo = new Leopard();
		System.out.println("=======================");
		Leopard barsik = new Leopard("Barsik");
		System.out.println("=======================");
		System.out.println(barsik.getType());
	}

}
