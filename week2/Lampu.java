public class Lampu {
    private boolean nyala;

    public void nyalakanLampu() {
        nyala = true;
    }

    public void matikanLampu() {
        nyala = false;
    }

    public boolean isNyala() {
        return nyala;
    }

    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        System.out.println("Apakah lampu menyala? " + lampu.isNyala());
        lampu.nyalakanLampu();
        System.out.println("Apakah lampu menyala? " + lampu.isNyala());
        lampu.matikanLampu();
        System.out.println("Apakah lampu menyala? " + lampu.isNyala());
    }
}

