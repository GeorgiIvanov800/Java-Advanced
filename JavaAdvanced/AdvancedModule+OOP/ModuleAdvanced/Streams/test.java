package ModuleAdvanced.Streams;

public class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        
        if (sb.equals(s)) {
            System.out.println("M1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("M2");
        } else {
            System.out.println("NO");
        }
    }
}
