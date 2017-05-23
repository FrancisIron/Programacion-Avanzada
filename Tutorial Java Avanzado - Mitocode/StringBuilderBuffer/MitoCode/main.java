package StringBuilderBuffer;

public class main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //sb.append("Henry").append(" Giaccomo");
        
        //System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.setLength(0);
        System.out.println(sb.toString());
    }
    
}
