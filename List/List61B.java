public interface List61B<Type> {

	public void	addFirst(Type i);

	public void addLast(Type i);

	public Type getFirst();

	public Type getLast();

	//public Type removeLast();

	public Type get(int i);
	
	//public void insert(Type i, int position);

	public int size();

	default void print() {
		int i = 0;
		while (i < size()) {
			System.out.println(get(i) + " ");
			i++;
		}
	}
}