public class Main {
    public static void main(String[] args) {
        SingleDimesionArray sd = new SingleDimesionArray(10);
        sd.insert(0, 4);
        sd.insert(0, 454);
        sd.insert(4, 5);
        sd.insert(43, 5);
        sd.traverseArray();

        sd.searchArray(5);
        sd.deleteValue(0);
        sd.traverseArray();

    }
}