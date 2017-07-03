public interface minPQ<Type> {
	int size;
	public void add(Type x);
	public Type getSmallest();
	public Type removeSmallest();
	public int size();
}