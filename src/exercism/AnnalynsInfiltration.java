package exercism;

public class AnnalynsInfiltration {
    public boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
                                          boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake ) || (!petDogIsPresent && prisonerIsAwake && !archerIsAwake
                && !knightIsAwake);
    }

    public static void main(String[] args) {
        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();

        System.out.println(annalynsInfiltration.canFastAttack(true));
        System.out.println(annalynsInfiltration.canSpy(false, true, false));
        System.out.println(annalynsInfiltration.canSignalPrisoner(false, true));
        System.out.println(annalynsInfiltration.canFreePrisoner(false, false,
                true, true));
    }

}
