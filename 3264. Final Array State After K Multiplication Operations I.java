class Solution {
    class Pair {
        int first, second;

        public Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> (a.first != b.first)
                        ? Integer.compare(a.first, b.first)
                        : Integer.compare(a.second, b.second));

        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair(nums[i], i));
        }
        while (k-- != 0) {
            Pair curr = pq.poll();
            int val = curr.first;
            int idx = curr.second;
            pq.add(new Pair(val * multiplier, idx));
        }
        int i = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int val = curr.first;
            int idx = curr.second;
            nums[idx] = val;
        }
        return nums;
    }
}
