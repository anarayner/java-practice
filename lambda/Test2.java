package lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abs(""));
    }
    public static void main(String[] args){
        def((String srt) -> {return srt.length();});
    }
}

interface I {
    int abs(String s);
}
