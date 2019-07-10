package day59_polymorphism01;

public class Store {
	
	public static void main(String[] args) {
		
		HairSpray hp = new HairSpray();
		hp.catcFire();
		
		Flammable hspray = new HairSpray();
		hspray.catcFire();
		
		//interface			  implementing class/sub class
		Flammable ptank = new PropaneTank();
		ptank.catcFire();
		
		Flammable item;
		item = new HairSpray();
		item.catcFire();
		item = new PropaneTank();
		item.catcFire();
		
		Flammable hs = new HairSpray();
		hs.catcFire();
		Flammable ss = new StylingSpray();
		ss.catcFire();
		HairSpray sts = new StylingSpray();
		sts.catcFire();
		
		
	}

}
