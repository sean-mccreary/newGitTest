
public class Trunk {
	
	public String tree;
	
	public Trunk(String aTree) {
		this.tree = aTree;
	}
	public int numInForest(String treeName) {
		if (treeName.compareTo(this.tree) == 0) {
			return 0;
		}
		return 1;
	}

}
