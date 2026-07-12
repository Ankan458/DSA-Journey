class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        int startSecond = Integer.parseInt(start[0]) * 3600 +
                          Integer.parseInt(start[1]) * 60 +
                          Integer.parseInt(start[2]);

        int endSecond = Integer.parseInt(end[0]) * 3600 +
                          Integer.parseInt(end[1]) * 60 +
                          Integer.parseInt(end[2]);

        return endSecond - startSecond;
    }
}