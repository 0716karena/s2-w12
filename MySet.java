public class MySet{
    private int[] myElements;
    private int myElementCount;

    public MySet(int count){
        myElements = new int[count];
        myElementCount = count;
        for(int x = 0; x < count; x++){
            myElements[x] = x * 10;
        }
        System.out.println(this);
        boolean isIn = contains(10);
        System.out.println(isIn);
        isIn = contains(132);
        System.out.println(isIn);
    }

    public boolean contains(int x){
        return containsHelper(x,0);
    }

    public boolean containsHelper(int value, int index){
        if(index==myElementCount){
            return false;
        }else if(value==myElements[index]){
            return true;
        }return containsHelper(value,index+1);
    }
    public boolean remove(int x){
        return removeHelper(x,0, false);
    }
    public boolean removeHelper(int value, int index, boolean isRemoved){
        if(index==myElementCount){
            return isRemoved;
        }else if(value==myElements[index]){
            for(int d = index;d<myElementCount-1;d++){
                myElements[d]=myElements[d+1];
                myElementCount--;
            }
            isRemoved = true;
        }return removeHelper(value,index+1, isRemoved);   
     }
    
    public String toString(){
        String m="";
        for(int d:myElements){
            m+=d+"";
            return m;
        }
        return myElements.toString();
    }

    public static void main(String[] args) {
        new MySet(10);
    }
}