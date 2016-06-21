/**
 * 
 */
package zoo;

import animal.Animal;

/**
 * @author Jordan
 *
 */
public class Zoo {

	/**
	 * 
	 */
	public Zoo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal("Tinson", true, 84.5, 180, 21, true, false, true);
		
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
		
		animal.setAge(53);
		animal.setName("Mr Tinson la folle");
		
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
	}

}
