package homework.chapter5;

public class SwitchSample {
    public static void main(String[] args) {
        int i = 11;
        String season;
        switch (i) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "season is not supported";
                break;

        }
        System.out.println(season);
    }
}
