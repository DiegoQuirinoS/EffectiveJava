package main;

public class NutritionsFacts{
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Build implements Builder<NutritionsFacts>{
		private final int servingSize;
		private final int servings;

		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Build(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Build calories(int val){
			calories = val;
			return this;
		}

		public Build fat(int val){
			fat = val;
			return this;
		}
		public Build carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		public Build sodium(int val){
			sodium = val;
			return this;
		}

		public NutritionsFacts  build(){
			return new NutritionsFacts(this);
		}
	}

	private NutritionsFacts(Build builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + carbohydrate;
		result = prime * result + fat;
		result = prime * result + servingSize;
		result = prime * result + servings;
		result = prime * result + sodium;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NutritionsFacts other = (NutritionsFacts) obj;
		if (calories != other.calories)
			return false;
		if (carbohydrate != other.carbohydrate)
			return false;
		if (fat != other.fat)
			return false;
		if (servingSize != other.servingSize)
			return false;
		if (servings != other.servings)
			return false;
		if (sodium != other.sodium)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "NutritionsFacts [servingSize=" + servingSize + ", servings="
				+ servings + ", calories=" + calories + ", fat=" + fat
				+ ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}
}
