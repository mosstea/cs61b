public interface OurComparable<Type> {
	/* Return negative if this object is smaller
	 * Return 0 if equals
	 * Return positive if this object is larger
	 */
	int compareTo(Type o);
}