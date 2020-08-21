public class ArrayTree{
    public static void main(String[] args) {
        ArrayImpl tree = new ArrayImpl();
        tree.Root("A");
        tree.setleftChild("B",0);
        tree.setrightChild("C",0);
        tree.setleftChild("D",1);
        tree.setleftChild("E",2);
        tree.printTree();
    }

}

class ArrayImpl{
    static int root = 0;
    static String[] str = new String[10];

    public void Root(String key){
        str[0] = key;
    }

    public void setleftChild(String key, int root){
        int childP = (2*root)+1;
        if(str[root]!=null){
            str[childP]= key;
        }else{
            System.out.println("Parent position is empty");
        }
    }

    public void setrightChild(String key, int root){
        int childP = (2*root)+2;
        if(str[root]!=null){
            str[childP]= key;
        }else{
            System.out.println("Parent position is empty");
        }
    }  
    
    public void printTree(){
        for(int i=0;i<10;i++){
            if(str[i]!= null){
                System.out.print(str[i]);
            }
            else{
                System.out.print("-");
            }
        }
    }
}