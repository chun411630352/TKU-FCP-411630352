public class hm_11 {
    public static void main(String[] args) {
        int []a={23,45,12,87,45,35,47,79,49,63};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }        
        System.out.println("Max is "+max);
                }
}
