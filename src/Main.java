
import DataStructures.SymbolTable;


public class Main {
    public static void main(String[] args)
    {
        SymbolTable<Integer, String> st = new SymbolTable<Integer, String>();

        st.set(5, new String("E"));
        st.set(4, new String("D"));
        st.set(6, new String("F"));
        st.set(3, new String("C"));
        st.set(7, new String("G"));
        st.set(2, new String("B"));

        System.out.println(st.get(2));
        System.out.println(st.get(3));
        System.out.println(st.get(4));
        System.out.println(st.get(5));
        System.out.println(st.get(6));
        System.out.println(st.get(7));
        System.out.println("-------------------");
        System.out.println(st.min());
        System.out.println(st.max());
    }
}