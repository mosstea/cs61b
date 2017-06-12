import java.util.Comparator;

public class Dog implements	Comparable<Dog> {
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
	public int compareTo(Dog dog) {
		return size - dog.size;
	}

	//private static class NameComparator implements Comparator<Dog> {
		public static int compare(Dog d1, Dog d2) {
			return d1.name.compareTo(d2.name);
		}
	//}

	//public static Comparator<Dog> getNameComparator() {
	//	return new NameComparator();
	//}
}