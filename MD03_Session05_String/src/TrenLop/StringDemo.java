package TrenLop;

public class StringDemo {
    public static void main(String[] args) {
        java.lang.String s1 = "Java";
        java.lang.String s2 = "JAVA";

        System.out.println("Ket qua so sanh s1 va s2: " + (s1.compareTo(s2)));
        System.out.println("Ket qua so sanh s1 va s2 khi phan biet hoa thuong: " + (s1.compareToIgnoreCase(s2)));

        System.out.println("Kiem tra s1 co ket thuc bang s2 khong: "+(s1.endsWith(s2)));
    }
}