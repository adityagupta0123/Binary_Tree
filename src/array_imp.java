import java.sql.Array;

public class array_imp {
    static int root = 0;
    static String [] str = new String[10];
    public void Root( String key) {
        str[0] = key;
    }
    public void set_left(String key, int root ){
        int t = (root * 2) + 1;
        if ( str[root] == null) {
            System.out.println("can't set child at "+ t + " no p]arent found" );
        } else {
            str[t] = key;
        }
    }
    public void set_right( String key, int root) {
        int t = (root * 2) +2;
        if ( str[root] == null ) {
            System.out.println("can't set child at "+ t + " no p]arent found" );
        } else
            str[t] = key ;
    }
    public void print_tree() {
        for( int i=0; i < 10; i++){
            if ( str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("_");
        }
    }
}
class Tree {
    public static void main(String[] args) {
        array_imp obj = new array_imp();

        obj.Root("A");

        obj.set_right("c", 0);
        obj.set_left("d", 1);
        obj.set_right("e", 1);
        obj.set_left("f",2);
        obj.print_tree();

    }
}