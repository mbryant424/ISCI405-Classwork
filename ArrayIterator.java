package Classwork;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) {
		String[] s = new String[] {"1","2","3"};
		java.util.Iterator<String> i = new MyIterator(s); //require you to choose a type parameter (STRING)
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
		
	static class MyIterator implements Iterator<String> {
		String[] s;
		int i = 0;
		public MyIterator(String[] s) {
			this.s = s;
		}
			
		@Override
		public boolean hasNext() {
			return (i > s.length);
		}
			
		@Override
		public String next() {
			String r = s[i];
			i++;
			return r;
		}
	};

};
