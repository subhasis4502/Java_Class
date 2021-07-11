package P1;

public class Base {
    private void pri() { // This is not overridden in the child class because it is private
        System.out.println("Private: Base");
    }

    void def() { // This is not overridden in the child class because it is default
        System.out.println("Default: Base");
    }

    protected void pro() {
        System.out.println("Protected: Base");
    }

    public void pub() {
        System.out.println("Public: Base");
    }

    public final void fin() {
        System.out.println("Public Final: Base");
        pri();
        def();
        pro();
        pub();
    }
}

