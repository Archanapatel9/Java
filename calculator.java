class calculator12{
    public int add(int n1 , int n2){
        return n1+n2;
    }
    
}
public class calculator{
    public static void main(String[]args){
        calculator12 obj = new calculator12();
        int r1=obj.add(18,9);
        System.out.println(r1);
    }
}

