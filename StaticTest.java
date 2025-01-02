public class StaticTest {
    private static int counter=0;
    static {
        counter+=1;
    }

    public StaticTest(){
        System.out.println(counter);
    }
}
