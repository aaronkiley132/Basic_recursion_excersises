public class Search {

    public static int linearSearch(int[] data, int target){
        for (int i = 0; i < data.length; i++){
            if (data[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int recursiveBinary(int[] data, int target){
        int midpoint = (int) Math.floor((data.length - 1) /2);
        if (data[midpoint] == target){
            return midpoint;
        }else if((data[midpoint] != target) && (data.length <=1)){
            return -1;
        }else if (target > data[midpoint]){
            //return search rhs
            int[] newData = new int[data.length / 2];
            System.arraycopy(data, midpoint, newData, 0, newData.length);
            return recursiveBinary(newData, target);
        }else{
            //return search lhs
            int[] newData = new int[data.length / 2];
            System.arraycopy(data, 0, newData, 0, newData.length);
            return recursiveBinary(newData, target);
        }
    }

    public static int iterativeBinary(int[] data, int target){
        boolean found = false;
        int length = data.length;
        int midpoint = (int) Math.floor((data.length - 1) /2);
        while((found == false) && (length > 1)){
            if (data[midpoint] == target){
                found = true;
                return midpoint;
            }
        }
    }
}
