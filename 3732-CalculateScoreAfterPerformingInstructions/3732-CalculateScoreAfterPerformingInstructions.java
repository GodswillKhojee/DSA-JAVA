// Last updated: 11/08/2026, 20:10:56
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int i = 0;
        boolean [] visited = new boolean[instructions.length];
        long score = 0;
        while (i >= 0 && i < instructions.length && !visited[i])
        {
            visited[i] = true;
            if(instructions[i].equals("add")) score += values[i++];
            else i += values[i];
        }
        return score;
    }
}