
public class Pokretac {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		ZaKlon pr = new ZaKlon(1);
		pr.sljed = new ZaKlon(2);
		
		ZaKlon dr = (ZaKlon) pr.clone();
		pr.sljed.test = 4;
		pr.test = 3;
		System.out.println(dr.test+" "+dr.sljed.test);
		
	}

}
