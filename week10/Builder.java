public class Builder {
    private String name;

    public Builder(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public String makeRow (int n, String s, String e) {
        String row = "";
        for (int i = 1; i <= n; i++) {
            row += e;
        }
        for (int j = 1; j <= n; j++) {
            row += s;
        }
        for (int i = 1; i <= n; i++) {
            row += e;
        }
        return row;
    }

    public void makePyramid(int n, String s) {
        int midWidth = -1;
        int sideWidth = -1;
        String side = " ";
        String result = "";
        for (int i = 1; i <= n; i = i + 2) {
            midWidth = i;
            sideWidth = (n - midWidth) / 2;
            result += makeRow(sideWidth, side, "") + makeRow(midWidth, s, "")  + makeRow(sideWidth, side, "") + "\n";
        }
        System.out.println(result);
    }
}