package religion;

public class Demo {

    public static void main(String[] args) {

        God god = new God();
        god.godForgives();
        god.godAttack();
        god.godEats();
        god.godSleeps();

        Christian follower1 = new Christian();
        Christian follower2 = new Christian();
        Christian follower3 = new Christian();

        Christian.god.name = "YHWH";

        follower1.christianReads();
        follower2.christianDefends();
        follower3.christianWorship();

        Christian.god.name = "Yahweh";

        follower1.christianReads();
        follower2.christianDefends();
        follower3.christianWorship();
    }
}
