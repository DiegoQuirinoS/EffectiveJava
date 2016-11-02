package main;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionsFacts facts = new NutritionsFacts.Build(10,5).calories(15).carbohydrate(200).build();
		System.out.println(facts);

		Elvis instance = Elvis.INSTANCE;
		Elvis instance2 = Elvis.INSTANCE;

		instance.setName("dlrow olleH");

		instance2.setName("Hello world");

		instance.getName();

		System.out.println(instance.equals(instance2));

	}

}
