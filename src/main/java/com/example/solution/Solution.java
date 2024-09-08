package com.example.solution;

public class Solution {
    private static final char OCEAN = '#';
    private static final char CASTAWAY = '*';
    private static final char MAPPED = ' ';

    public int solution(String[] map) {
        int c = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length(); j++) {
                // This grid location validity
                if (map[i].charAt(j) == MAPPED || map[i].charAt(j) == OCEAN) {
                    continue;
                }
                // Increment counter if island has at least 1 castaway
                if (markIslandMapped(i, j, map)) {
                    c++;
                }
            }
        }
        return c;
    }

    private boolean markIslandMapped(int r, int c, String[] map) {
        boolean hasCastaway = false;
        // Bounds-checking
        if ((r < 0) || (c < 0) || (r >= map.length) || (c >= map[0].length())) {
            return hasCastaway;
        }
        // This grid location validity
        if ((map[r].charAt(c) == MAPPED) || (map[r].charAt(c) == OCEAN)) {
            return hasCastaway;
        }
        if (map[r].charAt(c) == CASTAWAY) {
            hasCastaway = true;
        }
        
        // Mark this grid location as mapped
        map[r] = map[r].substring(0, c) + MAPPED + map[r].substring(c + 1);

        // Visit east / west / north / south grid locations from this grid point also
        hasCastaway |= markIslandMapped(r, c + 1, map);
        hasCastaway |= markIslandMapped(r, c - 1, map);
        hasCastaway |= markIslandMapped(r - 1, c, map);
        hasCastaway |= markIslandMapped(r + 1, c, map);

        // If this island has a castaway, bubble that data up to caller
        return hasCastaway;
    }
}
