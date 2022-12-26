class Solution {
    public boolean isRobotBounded(String ins) {
        int x = 0, y = 0;
        String d = "NORTH";
        for (int i = 0; i < ins.length(); i++) {
            char ch = ins.charAt(i);
            if (ch == 'G') {
                switch(d) {
                    case("NORTH"):
                        y++;
                        break;
                    case("EAST"):
                        x++;
                        break;
                    case("SOUTH"):
                        y--;
                        break;
                    case("WEST"):
                        x--;
                        break;
                }
            } else if (ch == 'L') {
                switch(d) {
                    case("NORTH"):
                        d = "WEST";
                        break;
                    case("EAST"):
                        d = "NORTH";
                        break;
                    case("SOUTH"):
                        d = "EAST";
                        break;
                    case("WEST"):
                        d = "SOUTH";
                        break;
                }
            } else {
                switch(d) {
                    case("NORTH"):
                        d = "EAST";
                        break;
                    case("EAST"):
                        d = "SOUTH";
                        break;
                    case("SOUTH"):
                        d = "WEST";
                        break;
                    case("WEST"):
                        d = "NORTH";
                        break;
                }
            }
        }
        return ((x == 0) && (y == 0)) || (d != "NORTH");
    }
}
