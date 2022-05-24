import java.util.ArrayList;
import java.util.List;

public class StreamForIntegerSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> list=new ArrayList<>();
   list.add(4);
   list.add(51);
   list.add(12);
   list.add(1);
   list.add(7);
   list.add(4);
   list.add(10);
   list.add(12);
   list.add(9);
   System.out.println(list + "\nnormal print");
   printToSameLineElements(list);
   System.out.println("\neven nums");
   printEventnumsSameLine(list);
   System.out.println("\nOdd nums square");
   printSquareOfOddElements(list);
   System.out.println("\nOdd Unique elemtns matching of cube ");
   printDistinctOddAndCubeelements(list);
   System.out.println("\nOdd unique square elemts sum of");
   printsumOfTheSquareOddAndDistinctElements(list);
   System.out.println("\nEven unique square elements product of");
   printProductfCubeEvenDistinctElements(list);
   System.out.println("\nFind Max elements: ");
   printMaxValueInList(list);
   System.out.println("\nFind min value with stream sorted function");
   printMinvaldueOfEleemtns(list);
   System.out.println("\nFind min value with Math class method");
   printMinvaldueOfEleemtns1(list);
   System.out.println("\nFind min value which greater than 7 ");
   printMinValueGreaterSeven(list);
	}
	public static void printToSameLineElements(List<Integer> list) {
		list.stream().forEach(t->System.out.print(t+" "));//don't forget remove "ln"
	
	}
	public static void printEventnumsSameLine(List<Integer>list) {
		list.stream().filter(t->t%2==0).forEach(t->System.out.print(t +" "));
	}
	public static void printSquareOfOddElements(List<Integer>list) {
		list.stream().filter(t->t%2==1).map(t->t*t).forEach(t->System.out.print(t+" "));
	}
	public static void printDistinctOddAndCubeelements(List<Integer>list) {
		list.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t->System.out.print(t +" "));
	}
	public static void printsumOfTheSquareOddAndDistinctElements(List<Integer> list) {
		//reduce method seems like sum+=x;
		int sumOf=list.stream().distinct().filter(t->t%2==1).map(t->t*t).reduce(0,(t,u)->t+u);
		System.out.println("SumOf: " +sumOf);
	}
	public static void printProductfCubeEvenDistinctElements(List<Integer>list) {
		int productOf=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
		System.out.println("ProductOf: " + productOf);
	}
	public static void printMaxValueInList(List<Integer> list) {
		//we can call from mathclass method for find to max value as well 
		// and we can sorted before reduce and can take last value for max  as well
		int max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t<u?u:t);
		System.out.println("max value in list: " + max);
	}
	public static void printMinvaldueOfEleemtns(List<Integer> list) {
	  int min=list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t>u?u:t);
	  System.out.println("Min Value:"+ min);
	}
	public static void printMinvaldueOfEleemtns1(List<Integer> list) {
		//second way, whatever u want u can get and use. even u can create your specific method type as well
		//using sorted method u can use within Comprator.reverseOrder() it will make reverse sorting vice versa
		//after sorted method u can put (".") and call findFirst method and use properly first element 
		//list.stream().sorted().findFirst(); its optional and more readble
		  int min=list.stream().distinct().reduce(Integer.MAX_VALUE,Math::min);
		  System.out.println("Min Value:"+ min);
		}
	public static void printMinValueGreaterSeven(List<Integer> list) {
		int min=list.stream().distinct().filter(t->t>7).reduce(Integer.MAX_VALUE,Math::min);
		System.out.println("Min value which is greater than Seven: "+ min);
	}
}
