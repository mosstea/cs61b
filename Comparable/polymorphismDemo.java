public class polymorphismDemo {
	public static OurComparable max(OurComparable[] items) {
		if (items == null || items.length == 0) {
			return null;
		}
		int maxIdx = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].compareTo(items[maxIdx]) > 0) {			
				maxIdx = i;
			}
		}
		return items[maxIdx];
	}

	public static void main(String[] args) {
		Dog[] dogs = {new Dog("Ashley", 10), new Dog("Mia", 5), new Dog("hillo", 20)};
		Dog maxDog = (Dog) max(dogs);
		maxDog.bark();
	}
}