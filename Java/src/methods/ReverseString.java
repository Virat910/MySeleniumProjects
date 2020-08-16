package methods;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method:1
		String str = "Manohar";
		int len = str.length();
		String rev = " ";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		// method:2
		String str2 = "Virat kohliiii";
		StringBuffer sb = new StringBuffer(str2);
		System.out.println(sb.reverse());

		// method:3
		String str3 = "Dsp";
		StringBuilder sbu = new StringBuilder(str3);
		System.out.println(sbu.reverse());

	}
}
