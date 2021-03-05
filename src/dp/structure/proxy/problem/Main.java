package dp.structure.proxy.problem;

public class Main {

		public static void main(String[] args) {
			Library library = new Library();
			library.add(new Ebook("a"));
			library.add(new Ebook("b"));
			library.add(new Ebook("c"));
			
			library.openBook("b");
		}
}
