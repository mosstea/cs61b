public class Dog implements OurComparable {
	private String name;
	public int size;

	public Dog(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public void bark() {
		System.out.println(name + " is barking");
	}

	@Override
	public int compareTo(Object o) {
		Dog dog = (Dog) o;
		return size - dog.size;
	}
}