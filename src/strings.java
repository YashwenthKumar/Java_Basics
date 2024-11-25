public class strings {
    public static void main(String[] args) {
        String mystring = "yashwenth is 18";
        int strlen = mystring.length();
        System.out.println(mystring.replace('e','a'));
        String inlow = mystring.toLowerCase();
        String inhigh = mystring.toUpperCase();
        String vk = mystring.strip();
        System.out.println(mystring);
        System.out.println(strlen);
        System.out.println(inlow);
        System.out.println(inhigh);
        System.out.println(vk);
        System.out.println(mystring.indexOf('i'));

    }
}
