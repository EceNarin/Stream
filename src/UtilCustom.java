
public class UtilCustom {
public static void printWithoutln(Object str) {
	//we use object class ass reference cause object class is father of all class, so we can put and print whatever we want 
	System.out.print(str +" ");
}
public static boolean evenNums(int x) {
	return x%2==0;
}
public static boolean oddNums(int x) {
	return x%2!=0;
	//return x%2==1;
}
public static int  getsquare(int x) {
	return x*x;
}
public static int  getCube(int x) {
	return x*x*x;
}
public static double getHalf(int x) {
	return x/2;
}
public static char getlastChar(String x) {
	return x.charAt(x.length()-1);
}
}
