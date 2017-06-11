package chapter05;

/**
 * Created by Juv on 2017-06-11.
 */
public class PartyMemberSelectorTest {
    public static void main(String[] args) {
        System.out.println(check(new String[]{"fishing", "gardening", "swimming", "fishing"}
                , new String[]{"hunting", "fishing", "fishing", "biting"}, 4));

        System.out.println(check(new String[]{"variety", "diversity", "loquacity", "courtesy"}
                , new String[]{"talking", "speaking", "discussion", "meeting"}, 1));
    }

    private static boolean check(String[] first, String[] second, int expected) {
        return expected == PartyMemberSelector.select(first, second);
    }
}
