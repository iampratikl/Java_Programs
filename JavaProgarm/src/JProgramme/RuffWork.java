package JProgramme;

public class RuffWork {
	public void area(float r){
		float areaofcircle=3.14f*r*r;
		System.out.println("area of circle is: "+areaofcircle);
		}
		public void area (int w,int l){
		int areaofreactangle=w*l;
		System.out.println("area of reactangle is: "+ areaofreactangle);
		}
		public void area(int b,int h){
		int areaoftriangle =1/2*b*h;
		System.out.println("area of triangle is: "+ areaoftriangle);
		}
	public static void main (String []args){
		poly po =new poly();
		po.area(3.f);
		po.area(5,3);
		po.area(10,12);
	}

}