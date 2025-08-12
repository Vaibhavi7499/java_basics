public class StringBufferEx {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("navin");
        sb.append(" reddy");
        System.out.println(sb);
    }
}



// StringBuffer()	Creates empty buffer (default capacity = 16)	new StringBuffer()
// StringBuffer(int capacity)	Creates buffer with given capacity	new StringBuffer(50)
// StringBuffer(String str)	Creates buffer initialized with given string	new StringBuffer("Hello")
// StringBuffer(CharSequence seq)	Creates buffer from any CharSequence	new StringBuffer(new StringBuilder("Hi"))
// length()	Returns number of characters	sb.length()
// capacity()	Returns current capacity	sb.capacity()
// ensureCapacity(int minimumCapacity)	Ensures buffer can hold given chars without reallocating	sb.ensureCapacity(50)
// setLength(int newLength)	Sets new length (truncates or pads with \u0000)	sb.setLength(5)
// charAt(int index)	Returns char at position	sb.charAt(2)
// setCharAt(int index, char ch)	Sets char at position	sb.setCharAt(0, 'J')
// codePointAt(int index)	Returns Unicode code point at index	sb.codePointAt(0)
// codePointBefore(int index)	Returns Unicode code point before index	sb.codePointBefore(1)
// codePointCount(int beginIndex, int endIndex)	Counts code points in range	sb.codePointCount(0, 4)
// append(String str)	Appends string	sb.append("Java")
// append(char c)	Appends char	sb.append('A')
// append(int i)	Appends int	sb.append(123)
// append(boolean b)	Appends boolean	sb.append(true)
// append(float f)	Appends float	sb.append(1.23f)
// append(double d)	Appends double	sb.append(12.34)
// append(Object obj)	Appends obj.toString()	sb.append(new Date())
// append(CharSequence s)	Appends character sequence	sb.append("Hello")
// append(CharSequence s, int start, int end)	Appends subsequence	sb.append("World", 0, 3)
// insert(int offset, String str)	Inserts at position	sb.insert(5, "Java")
// insert(int offset, char c)	Inserts char	sb.insert(0, 'A')
// insert(int offset, int i)	Inserts int	sb.insert(3, 100)
// (also overloaded for other data types)		
// delete(int start, int end)	Deletes chars in range	sb.delete(0, 5)
// deleteCharAt(int index)	Deletes single char	sb.deleteCharAt(3)
// replace(int start, int end, String str)	Replaces range with new string	sb.replace(0, 5, "Hi")
// substring(int start)	Returns substring from start	sb.substring(3)
// substring(int start, int end)	Returns substring range	sb.substring(3, 6)
// reverse()	Reverses the sequence	sb.reverse()
// toString()	Converts buffer to String	sb.toString()
// trimToSize()	Reduces capacity to current length	sb.trimToSize()