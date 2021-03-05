package dp.structure.proxy.solution;

public class Main {

		public static void main(String[] args) {
			Library library = new Library();
			library.add(new EbookProxy("a"));
			library.add(new EbookProxy("b"));
			library.add(new EbookProxy("c"));
			
			library.openBook("b");
			library.openBook("a");
			library.openBook("b");
		}
}
