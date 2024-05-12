package code852024;


public class MathUtil {
	public static int timSoNguyen(double x) {
		return (int) Math.floor(x);
	}
	public static int tinhLuyThua(int a,int b) {

        return (int) Math.pow(a, b);
    }
    public static void main(String[] args) {
		System.out.println(timSoNguyen(6.9));
		System.out.println(tinhLuyThua(2,5));
	}
}
