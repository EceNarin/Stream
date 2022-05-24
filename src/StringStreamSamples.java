 import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringStreamSamples {

	public static void main(String[] args) {
		 List <String> l=new ArrayList<>();
		   l.add("Bakunin");
		   l.add("Leyla Xhalid");
		   l.add("Michael");
		   l.add("Rosa Luxemburg");
		   l.add("Ghassan Kanafani");
		   l.add("Lenin");
		   l.add("Gramsci");
		   l.add("Karl Marx");
		   l.add("Malatesta");
		   l.add("Ghaddafi");
		 /*  System.out.println("\nprint list elements with Upper case");
		   printupperCase(l);
		   System.out.println("\nLength sorder order prints elements of list\n");
		   printLengthOrder(l);
		   System.out.println("\nLength sorder order prints elements of list\n");*/
		   printLengthReverseOrder(l);
		   System.out.println("\nPrint sorted with last character alphabetical order\n ");
		  // printSortLastCharacterOrder(l);
		  // System.out.println("Remove elements whereas lnegth");
		   //printRemoveelementsIfLengthLessThanSeven(l);
			}
	 public static void printupperCase(List<String> l) {
	    	l.stream().map(String::toUpperCase).forEach(UtilCustom::printWithoutln);
	    }
	 public static void printLengthOrder(List<String>l) {
		              // we can handle our sorted type out of natural or insertion order            
		    l.stream().sorted(Comparator.comparing(String::length)).forEach(UtilCustom::printWithoutln);
	 }
	 public static void printLengthReverseOrder(List<String> l) {
		 l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilCustom::printWithoutln);
	 }
	 public static void printSortLastCharacterOrder(List<String>l) {
   //first sorted length then checks thereafter sorted elements of last character
		 l.stream().distinct().sorted(Comparator.comparing(String::length).thenComparing(UtilCustom::getlastChar)).forEach(UtilCustom::printWithoutln);
	 }
	// public static void printRemoveelementsIfLengthLessThanSeven(List<String>l) {
		 //this methods immutable and changed us oiriginal list so why we will make  deactive after check
		// l.removeIf(t->t.length()<7);
		 //System.out.println(l);
//	 }
	 

}
