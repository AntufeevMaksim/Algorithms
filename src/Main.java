
import DataStructures.SymbolTable;


public class Main {
    public static void main(String[] args)
    {
        SymbolTable<Integer, String> st = new SymbolTable<Integer, String>();

        st.set(5, new String("E"));
        st.set(4, new String("D"));
        st.set(6, new String("F"));
        st.set(3, new String("C"));

        System.out.println(st.get(3));
        System.out.println(st.get(4));
        System.out.println(st.get(5));
        System.out.println(st.get(6));
    }
}