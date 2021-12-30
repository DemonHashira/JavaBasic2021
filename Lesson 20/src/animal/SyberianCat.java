package animal;

public class SyberianCat extends Cat{

    SyberianCat(boolean isMammal) {
        super(isMammal);
    }

    public SyberianCat() {

    }

    @Override
    void makeSomeNoice() {
        System.out.println("meow meow");
    }
}
