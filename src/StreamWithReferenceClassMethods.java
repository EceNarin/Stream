import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithReferenceClassMethods {

	public static void main(String[] args) {
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
		   List <String> l=new ArrayList<>();
		   l.add("Bakunin");
		   l.add("Leyla Xhalid");
		   l.add("Michael");
		   l.add("Rosa Luxemburg");
		   l.add("Gassan Kanafani");
		   l.add("Anna");
		   l.add("Gramsci");
		   l.add("Kalr Marx");
		   l.add("Malatesta");
		   l.add("Ghaddafi");
		System.out.println("\nPrint custom method via stream ");
		printThesameLinewithClassReferenceMethod(list);
        System.out.println("\nPrint even nums with method refrence");
        printEvenNums(list);
        System.out.println("\nPrint odd nums with method refrence");
        printOddNums(list);
        System.out.println("\nPrint unique even nums squarewith method refrence");
        printSquareOfEvenNums(list);
        System.out.println("\nPrint unique odd nums of cube with method refrence");
        printCubeOfOddNums(list);
        System.out.println("\nPint sum of unique cubes even element ");
        printsumOfCubesevenElements(list);
        System.out.println("\nPint product of unique square even element ");
        printProductOfSquareOddelements(list);
        System.out.println("Half elements. sort from min to max and make vice versa sorted(Comprator.reverseOrder()) method ");
        printGetHalf(list);

	}
	public static void printGetHalf(List<Integer> list) {
		List<Double> half=list.stream().distinct().map(UtilCustom::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Half of by one by elements" + " \n"+ half );
	}
	public static void printThesameLinewithClassReferenceMethod(List<Integer>list) {
		list.stream().forEach(UtilCustom::printWithoutln);
	}
	public static void  printEvenNums(List<Integer>list) {
		list.stream().filter(UtilCustom::evenNums).forEach(UtilCustom::printWithoutln);
	}
	public static void printOddNums(List<Integer> list) {
		list.stream().filter(UtilCustom::oddNums).forEach(UtilCustom::printWithoutln);
	}
	public static void printSquareOfEvenNums(List<Integer> list) {
		list.stream().distinct().filter(UtilCustom::evenNums).map(UtilCustom::getsquare).forEach(UtilCustom::printWithoutln);
	}
	public static void printCubeOfOddNums(List<Integer> list) {
		list.stream().distinct().filter(UtilCustom::oddNums).map(UtilCustom::getCube).forEach(UtilCustom::printWithoutln);
	}
	public static void printsumOfCubesevenElements(List<Integer >list) {
		//in reduce function (0,Integer::sum) method calls works like addexact 
		int total=list.stream().distinct().filter(UtilCustom::evenNums).map(UtilCustom::getCube).reduce(0,Math::addExact);
		System.out.println("Sum of cubes of even elements: " + total);
	}
	public static void printProductOfSquareOddelements(List<Integer> list) {
		int product=list.stream().distinct().filter(UtilCustom::oddNums).reduce(1,Math::multiplyExact);
		System.out.println("product of, all odd nums square: " + product);
	}
	

}
