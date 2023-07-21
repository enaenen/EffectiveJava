package test.generic.typesafe;
class Gun {
	void shot(){
		System.out.println("쏴");
	}
}


class Sword {

}

class MyPocket{
	private Object weapon;
	public MyPocket(Object weapon) {
		this.weapon = weapon;
	}
	public Object getWeapon() {
		return weapon;
	}
}

class MyDoramonPocket<T>{
	private T weapon;
	public MyDoramonPocket(T weapon) {
		this.weapon = weapon;
	}
	public T getWeapon() {
		return weapon;
	}
}
public class TypeSafeTest  {

	public static void main(String[] args) {
		//MyPocket gunHolster = new MyPocket(new Gun());
		//MyPocket swordCase = new MyPocket(new Sword());

		//Gun gun = (Gun) gunHolster.getWeapon();
//		Sword sword = (Sword) gunHolster.getWeapon(); // 컴파일 에러



		MyDoramonPocket<Gun> gunHolster = new MyDoramonPocket<Gun>(new Gun());
		MyDoramonPocket<Sword> swordCase = new MyDoramonPocket<Sword>(new Sword());

		Gun gun = gunHolster.getWeapon();
//		Sword sword = gunHolster.getWeapon();
	}

}
