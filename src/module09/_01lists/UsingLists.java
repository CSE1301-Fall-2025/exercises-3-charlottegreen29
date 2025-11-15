package module09._01lists;

import java.util.LinkedList;

public interface List<T> {
    public boolean add(T e);
    public T get(int i);
    public int indexOf(T e);
	public boolean remove(T e);
    public T remove(int i);
    public int size();
}

public class UsingLists {

	public static void main(String[] args) {
		List<String> eating = new LinkedList<String>(); //I'm really confused by what they're asking me to do; I'll fix it during the lecture

		eating.add("open mouth");
		eating.add("insert food");
		eating.add("chew");
		eating.add("chew");
		eating.add("swallow");
		
		
	}
}
