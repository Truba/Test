
public class ZaKlon implements Cloneable{
	
	public ZaKlon sljed;
	public int test;
	
	public ZaKlon(int t){
		this.test = t;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ZaKlon novi = new ZaKlon(test);
		if (sljed != null){
			novi.sljed = (ZaKlon) sljed.clone();
		}
		return novi;
	}

}
