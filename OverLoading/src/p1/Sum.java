package p1;

public class Sum {
	public int Sum(int x,int y) {
		return(x+y);
	}
	public int Sum(int x,int y,int z) {
		return(x+y+z);
	}
	public double Sum(double x,double y,double z) {
		return(x+y+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sum s=new Sum();
    System.out.println(s.Sum(56, 45));
    System.out.println(s.Sum(56, 98, 45));
    System.out.println(s.Sum(3.5, 67.2, 45.9));
	}

}
