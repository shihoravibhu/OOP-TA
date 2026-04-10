// OOPJ Extra Programs:
// 1) Implement all the String, StringBuffer & StringBuilder Methods.

class p1 {
    public static void main(String[] args) {
       
        String s1 = "Darshan";
        String s2 = " Java ";

        System.out.println("Length: " + s1.length());
        System.out.println("charAt(2): " + s1.charAt(2));
        System.out.println("Substring(1,4): " + s1.substring(1,4));
        System.out.println("Concat: " + s1.concat(" Patel"));
        System.out.println("Equals: " + s1.equals("Darshan"));
        System.out.println("EqualsIgnoreCase: " + s1.equalsIgnoreCase("darshan"));
        System.out.println("CompareTo: " + s1.compareTo("Darshan"));
        System.out.println("Contains: " + s1.contains("sha"));
        System.out.println("IndexOf: " + s1.indexOf('a'));
        System.out.println("LastIndexOf: " + s1.lastIndexOf('a'));
        System.out.println("StartsWith: " + s1.startsWith("Dar"));
        System.out.println("EndsWith: " + s1.endsWith("han"));
        System.out.println("ToUpperCase: " + s1.toUpperCase());
        System.out.println("ToLowerCase: " + s1.toLowerCase());
        System.out.println("Trim: " + s2.trim());
        System.out.println("Replace: " + s1.replace('a','A'));

       
        System.out.println();
        System.out.println();

        // StringBuffer Methods 
        
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World");
        System.out.println("Append: " + sb);
        
        sb.insert(5," Java");
        System.out.println("Insert: " + sb);
        
        sb.replace(0,5,"Hi");
        System.out.println("Replace: " + sb);
        
        sb.delete(0,3);
        System.out.println("Delete: " + sb);

        sb.deleteCharAt(2);
        System.out.println("DeleteCharAt: " + sb);
        
        sb.reverse();
        System.out.println("Reverse: " + sb);

        sb.setCharAt(0,'A');
        System.out.println("SetCharAt: " + sb);

        System.out.println("charAt(2): " + sb.charAt(2));
        
        System.out.println();
        System.out.println();


        // StringBuilder Methods 

        StringBuilder sb2 = new StringBuilder("Programming");

        sb2.append(" Language");
        System.out.println("Append: " + sb2);

        sb2.insert(0,"Java ");
        System.out.println("Insert: " + sb2);

        sb2.delete(5,10);
        System.out.println("Delete: " + sb2);

        sb2.deleteCharAt(2);
        System.out.println("DeleteCharAt: " + sb2);

        sb2.setCharAt(0,'A');
        System.out.println("SetCharAt: " + sb2);

        System.out.println("charAt(2): " + sb2.charAt(2));

        sb2.reverse();
        System.out.println("Reverse: " + sb2);
    }
}