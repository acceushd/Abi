public class Fakultät {
    int ursprünglicheZahl(int uZahl) {
        return rechner(uZahl);
    }

    private int rechner(int zahl) {
        if (zahl < 0) {
            return rechner(zahl * -1) * -1;
        }
        if (zahl == 0) {
            return 0;
        }
        if (zahl == 1) {
            return 1;
        }
        return zahl * rechner(zahl - 1);
    }
}
