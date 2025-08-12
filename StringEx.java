public class StringEx {
   public static void main(String args[]){
    // String name = new String("Vaibhavi");
    String s1 = "vaibhavi";   
    String s2 ="bodke"; 
    String s3 = new String("vaibhavi");
    System.out.println(s1.compareTo(s1));
   
   } 
}
//String is class in java.lang package
 //there is an area inside a heap called string constant pool inside that s1& s2 
    //point to same memory but s3 stored in heap not scp.If you want to store in scp
    //you need to write s3=s3.intern(). 

// length()          	Returns number of characters	"Hello".length() → 5
// isEmpty()	        Checks if string is empty	"".isEmpty() → true
// isBlank() (Java 11)	   Checks if empty or only whitespace	" ".isBlank() → true
// charAt(int index)	      Returns char at index	"Java".charAt(1) → 'a'
// codePointAt(int index)	Unicode code of char at index	"A".codePointAt(0) → 65
// codePointBefore(int index)	Code of char before index	"AB".codePointBefore(1) → 65
// codePointCount(int start, int end)	Counts Unicode code points in range	"Hello".codePointCount(0,5) → 5
// equals(Object obj)	Checks value equality	"Java".equals("Java") → true
// equalsIgnoreCase(String)	Ignores case	"Java".equalsIgnoreCase("java") → true
// compareTo(String)	Lexicographical compare	"a".compareTo("b") → -1
// compareToIgnoreCase(String)	Case-insensitive compare	"a".compareToIgnoreCase("A") → 0
// contentEquals(CharSequence)	Compares with any CharSequence	"Java".contentEquals(new StringBuffer("Java")) → true
// contains(CharSequence)	Checks if substring exists	"Hello".contains("ell") → true
// startsWith(String)	Checks if string starts with given prefix	"Java".startsWith("Ja")
// endsWith(String)	Checks if string ends with given suffix	"Java".endsWith("va")
// indexOf(String)	First occurrence index	"Java".indexOf("a") → 1
// lastIndexOf(String)	Last occurrence index	"Java".lastIndexOf("a") → 3
// indexOf(String, fromIndex)	First occurrence after position	"Java".indexOf("a",2) → 3
// matches(String regex)	Checks regex match	"abc".matches("[a-z]+") → true
// concat(String)	Appends text	"Hello".concat(" World")
// replace(char, char)	Replaces chars	"Java".replace('a','o') → "Jovo"
// replace(CharSequence, CharSequence)	Replaces substring	"abcabc".replace("ab","xy") → "xycxyc"
// replaceAll(String regex, String replacement)	Regex replace	"abc123".replaceAll("[0-9]","") → "abc"
// replaceFirst(String regex, String replacement)	Replaces first match	"abc123abc".replaceFirst("[0-9]","X")
// toUpperCase()	Uppercase	"java".toUpperCase() → "JAVA"
// toLowerCase()	Lowercase	"JAVA".toLowerCase() → "java"
// trim()	Removes leading/trailing spaces	" hi ".trim() → "hi"
// strip() (Java 11)	Unicode space removal	" hi ".strip()
// stripLeading() (Java 11)	Removes leading spaces	" hi".stripLeading()
// stripTrailing() (Java 11)	Removes trailing spaces	"hi ".stripTrailing()
// repeat(int count) (Java 11)	Repeats string	"Hi".repeat(3) → "HiHiHi"
// substring(int begin)	From index to end	"Hello".substring(2) → "llo"
// substring(int begin, int end)	Range substring	"Hello".substring(1,4) → "ell"
// split(String regex)	Splits into array	"a,b,c".split(",") → ["a","b","c"]
// split(String regex, int limit)	Splits with limit	"a,b,c".split(",", 2) → ["a","b,c"]
// join(CharSequence delimiter, elements...) (Java 8)	Joins strings	String.join("-", "a", "b") → "a-b"
// toCharArray()	Converts to char array	"Java".toCharArray()
// getBytes()	Converts to byte array	"Java".getBytes()
// valueOf(int) (Static)	Converts primitive to string	String.valueOf(123) → "123"
// format(String format, Object... args) (Static)	Formatted string	String.format("Hi %s", "John")
// hashCode()	Returns hash code	"Java".hashCode()
// intern()	Puts string in String Pool	str.intern()
// lines() (Java 11)	Returns Stream of lines	"a\nb".lines()
// chars()	      IntStream of chars	"abc".chars()
// codePoints()    IntStream of Unicode code points	"abc".codePoints()

