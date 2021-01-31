
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonusBelowLimitRegistered = service.calculate(1000_60, true);
        System.out.println(bonusBelowLimitRegistered);

        long bonusOverLimitRegistered = service.calculate(1_000_000_60, true);
        System.out.println(bonusOverLimitRegistered);

        long bonusBelowLimitUnregistered = service.calculate(1000_60, false);
        System.out.println(bonusBelowLimitUnregistered);

        long bonusOverLimitUnregistered = service.calculate(1_000_000_60, false);
        System.out.println(bonusOverLimitUnregistered);

        long bonusZeroLimitUnregistered = service.calculate(0, false);
        System.out.println(bonusZeroLimitUnregistered);

        long bonusZeroLimitRegistered = service.calculate(0, true);
        System.out.println(bonusZeroLimitRegistered);

        long bonusNegativeLimitUnregistered = service.calculate(-1000_60, false);
        System.out.println(bonusNegativeLimitUnregistered);

        long bonusNegativeLimitRegistered = service.calculate(-1000_60, true);
        System.out.println(bonusNegativeLimitRegistered);

    }
}