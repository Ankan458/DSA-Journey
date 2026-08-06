class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        String winner = "";

        for(int i = 0; i < messages.length; i++) {
            int word = 1;

            for(char ch : messages[i].toCharArray()) {
                if(ch == ' ') word++;
            }

            int freq = map.getOrDefault(senders[i], 0) + word;

            map.put(senders[i], freq);

            if(freq > max) {
                max = freq;
                winner = senders[i];
            }
            else if(freq == max && winner.compareTo(senders[i]) < 0) {
                winner = senders[i];
            }
        }

        return winner;
    }
}