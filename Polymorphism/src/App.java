public class App {
	public static void main (String[] args) {
		Plant plant1 =  new Plant();
		Tree tree = new Tree();
		tree.grow();

		Plant plant2 = tree;
		//plant2.Shieldleaves(); //polymorphism phyit tl
		tree.Shieldleaves();
		
		plant1.grow();
		plant2.grow();	
		doGrow(plant1);
	}
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
