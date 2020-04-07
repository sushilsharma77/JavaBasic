package homePractice;

public class ComputerTest {

	public static void main(String[] args) {
		Computer obj=new Apple("Apple");
		Computer obj1=new Lenovo("Lenovo");
		Computer obj2=new HP("HP");
		
Computer [] comp= {obj,obj1, obj2};
for(Computer c:comp) {
	c.run();
	c.save();
	c.store();
	c.transfer();

}

	}

}
