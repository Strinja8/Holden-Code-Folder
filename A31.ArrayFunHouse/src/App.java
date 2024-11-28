public class App {
    public static void main(String[] args) throws Exception {
    arrayFHRunner fh = new arrayFHRunner();
    int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
    int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
    fh.getsum(one, 3, 6);
    fh.getsum(one, 2, 9);
    fh.count(one, 4);
    fh.count(one, 9);
    fh.count(one, 7);
    
        

    }
}