public class Dog implements OurComparable<Dog> {
	private String name;
	public int size;

	public Dog(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void bark() {
		System.out.println(name + " is barking!");
	}

	@Override
	public int compareTo(Dog dog) {
		return size - dog.size;
	}
}