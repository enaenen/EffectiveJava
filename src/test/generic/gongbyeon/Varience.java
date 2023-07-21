package test.generic.gongbyeon;

import java.util.ArrayList;
import java.util.List;
class Gun extends Weapon{
	void shot(){
		System.out.println("쏴");
	}
}
class HandGun extends Gun {
	void quickShot(){
		System.out.println("날 쏘고가라");
	}
}

class Rifle extends Gun {
	void longRangeShot() {
		System.out.println("멀리서 쏴");
	}
}

class Sword extends Weapon{

}
class Weapon {

}


public class Varience {

	//공변
	public static void onlyGun(List<? extends Gun> guns){
		for (Gun gun : guns) {
			gun.shot();
		}
	}

	//반공변
	public static void superGuns(List<? super Gun> guns){
		guns.add(new HandGun());
		guns.add(new Rifle());
		guns.add(new HandGun());

		for (Object gun : guns) {
			System.out.println(gun);
		}
	}

	// 자식 타입이 메모리가 더 크기때문에 맞는 만큼을 맞춰와야한다.
	//반공변
	public static void rifleList(List<? super Rifle> guns){
		guns.add(new Rifle());
//		guns.add(new HandGun());
//		guns.add(new Gun());
//		guns.add(new Weapon());

		for (Object gun : guns) {
			System.out.println(gun.toString());

		}
	}


	public static void main(String[] args) {
		Varience v = new Varience();

		ArrayList<Gun> onlyNormalGuns = new ArrayList<Gun>(List.of(new Gun(), new Gun(), new Gun()));
		ArrayList<Gun> onlyHandGuns = new ArrayList<Gun>(List.of(new HandGun(), new HandGun(), new HandGun()));
		ArrayList<Gun> onlyRifles = new ArrayList<Gun>(List.of(new Rifle(), new Rifle(), new Rifle()));
		ArrayList<Gun> allOfGuns = new ArrayList<Gun>(List.of(new Gun(), new HandGun(), new Rifle()));
		ArrayList<Weapon> allOfWeaPons = new ArrayList<Weapon>(List.of(new Gun(), new HandGun(), new Rifle()));
		allOfWeaPons.add(new Sword());

		List<? extends Gun> guns1 = new ArrayList<Gun>();
		List<? extends Gun> guns2 = new ArrayList<HandGun>();
		List<? extends Gun> guns3 = new ArrayList<Rifle>();

		onlyGun(onlyNormalGuns);
		System.out.println();
		onlyGun(onlyHandGuns);
		System.out.println();
		onlyGun(onlyRifles);
		System.out.println();
		onlyGun(allOfGuns);
		System.out.println();

		superGuns(allOfWeaPons);
		System.out.println();
		rifleList(allOfWeaPons);
	}

}
