public class Print {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMin());
        System.out.println(lasagna.remainMin(30));
        System.out.println(lasagna.prepTime(3));
        System.out.println(lasagna.totalTime(30, 4));        
    }

    
}
