public class task_2 {
    public int max(int[] array){
        int maximum= -999999;
        for(int i=0;i<array.length;i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }
    public int min(int[] array){
        int minimum= 999999;
        for(int i=0;i<array.length;i++){
            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        return minimum;
    }
}
