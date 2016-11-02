package main;

public enum Elvis {
	INSTANCE;

	private String name;

	public void setName(String name){
		this.name = name;
	}
	public void getName(){
		System.out.println(name);
	}
}
