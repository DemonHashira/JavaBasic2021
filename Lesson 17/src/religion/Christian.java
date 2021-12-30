package religion;

public class Christian {
    static God god = new God();

    void christianWorship() {
        System.out.println("Christian worships: " + god.name);
    }

    void christianAttacks() {
        System.out.println("Christian attacks sinners in the name of: " + god.name);
    }

    void christianDefends() {
        System.out.println("Christian defends his holy ground in the name of: " + god.name);
    }

    void christianReads() {
        System.out.println("Christian reads the holy Bible in the name of: " + god.name);
    }

}
