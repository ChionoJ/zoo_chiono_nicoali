
package animal;

public class Animal {
		
	private String name;
	private boolean sex;
	private float weight;
	private float height;
	private int age;
	private boolean hungry;
	private boolean sleep;
	private boolean health;

	public Animal() {}

	public Animal(String name, boolean sex, float weight, float height, int age, boolean hungry, boolean sleep, boolean health) {
		super();
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.hungry = hungry;
		this.sleep = sleep;
		this.health = health;
	}
	
	
	
	// methodes

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isSex() {
		return sex;
	}


	public void setSex(boolean sex) {
		this.sex = sex;
	}


	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}
	
	public static void eat(Animal animal){
		if (animal.isSleep() == false)
		{
			animal.setHungry(false);
			System.out.println("Mange");
		}
		else System.out.println("Ne peut pas manger");

	}
	

	
	


	


}
