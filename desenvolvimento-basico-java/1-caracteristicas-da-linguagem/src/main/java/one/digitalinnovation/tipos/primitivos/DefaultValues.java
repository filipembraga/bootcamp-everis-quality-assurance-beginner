package one.digitalinnovation.tipos.primitivos;

public class DefaultValues {
    public static void main(String[] args) {

        final Default d = new Default();

        //Printing default values - Java types
        System.out.println(d.getI());
        System.out.println(d.isActive());

    }
}

class Default {

    int i;
    boolean active;

    public int getI() {
        return i;
    }

    public boolean isActive() {
        return active;
    }
}