package exercicio;

public class InnerClass {
	private int id;
	
	class Brain {
        public void think() {
            Util.textLn("Robot " + id + " is thinking.");
        }
    }
	
	static class Batery{
		public void charge() {
			Util.textLn("Batery Charging...");
		}
	}
	
	public InnerClass(int id) {
		this.id = id;
	}

}
