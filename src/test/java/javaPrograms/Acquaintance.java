package javaPrograms;

class Acquaintance {
	
	public String name;
	
	public Acquaintance(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println(name+ " is my friend");
	}

}

class Friend1 extends Acquaintance {

	public String town;
	
	public Friend1(String name, String town) {
		super(name);
		this.town=town;
	}

	public void getTown() {
		System.out.println(name+ " is my friend and he stays in "+town);
	}
}

class BestFriend1 extends Friend1{

	public String song;
	public static int value=4;
	
	public BestFriend1(String name, String town, String song) {
		super(name, town);
		this.song=song;
	}

	
	public void getSong() {
		System.out.println(name+ " is my friend and he stays in "+town+ " is song "+song);
	}
	
	public static void main(String[] args) {
		BestFriend1 friend = new BestFriend1("Jacob", "Hyd", "Hurdles");
		System.out.println(value);
		friend.getName();
		friend.getTown();
		friend.getSong();
	}
}
