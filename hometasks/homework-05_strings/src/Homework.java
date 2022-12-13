public class Homework {
    public static void processString(String string){

        System.out.println(string.charAt(string.length()-1));
        System.out.println(string.contains("Java"));
        System.out.println(string.replace("a", "o"));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(7, 11));

    }

    public static void bakeCake(){
        String cake = "корж %s корж";
        String cream = "крем";

        System.out.println(String.format(cake, cream));
    }
}
