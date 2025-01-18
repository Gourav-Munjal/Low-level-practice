package collections;


import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        PriorityQueue<Integer> g = new PriorityQueue<>();
        PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());
        int[] input = {9};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        var sol = plusOne(input);
        System.out.println(sol.length);
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n - 1, carry = 1;

        while (i >= 0) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
            i--;
        }
        if (carry != 0) {
            int[] res = new int[n + 1];
            res[0] = carry;
            for (i = 0; i < n; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }

    public static String addBinary(String a, String b) {
        int sum = getDecimal(a) + getDecimal(b);
        StringBuilder str = new StringBuilder();
        while (sum > 0) {
            if (sum % 2 == 0) str.append('0');
            else str.append('1');
            sum = sum / 2;
        }
        return str.reverse().toString();
    }

    public static int getDecimal(String x) {
        int res = 0;
        for (int i = 0; i < x.length(); i++) {
            res += x.charAt(i) == '1' ? (int) Math.pow(2, x.length() - i - 1) : 0;
        }
        return res;
    }

    public static int searchInsert(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static void solveQueen(int c, int n, boolean[][] grid) {
        if (c == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(i, c, grid, n)) {
                grid[i][c] = true;
                solveQueen(c + 1, n, grid);
                grid[i][c] = false;
            }
        }
    }

    public static boolean isSafe(int r, int c, boolean[][] grid, int n) {
        int i, j;
        for (i = 0; i < c; i++) {
            if (grid[r][i]) return false;
        }

        for (i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j]) return false;
        }

        for (i = r, j = c; i < n && j >= 0; i++, j--) {
            if (grid[i][j]) return false;
        }
        return true;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq.add(num);
        }
        while (k != 1) {
            k--;
            pq.poll();
        }
        return pq.peek();
    }

    public double myPow(double x, int n) {
        double res = findPow(x, Math.abs(n));
        if (n < 0) return 1.00 / res;
        return res;
    }

    public double findPow(double x, long n) {
        if (n == 0) return 1;
        double temp = findPow(x, n / 2);
        temp = temp * temp;
        if ((n & 1) == 0) return temp;
        else return temp * x;
    }

    public int totalNQueens(int n) {
        boolean[][] grid = new boolean[n][n];
        solveQueen(0, n, grid);
        return count;
    }


//    public int sumNumbers(TreeNode root) {
//        if (root == null) return 0;
//        StringBuilder str = new StringBuilder();
//        count(root, str);
//        int ans = 0;
//        for (String s : res) {
//            ans += Integer.parseInt(s);
//        }
//        return ans;
//    }
//
//    private void count(TreeNode root, StringBuilder temp) {
//        if (root.left == null && root.right == null) {
//            res.add(temp.toString());
//            return;
//        }
//        temp.append(root.val);
//        if (root.left != null) count(root.left, temp);
//        if (root.right != null) count(root.right, temp);
//    }
//
//    public int countNodes(TreeNode root) {
//        if (root == null) return 0;
//        int lh = 0;
//        TreeNode curr = root;
//        while (curr.left != null) {
//            lh++;
//            curr = curr.left;
//        }
//        int rh = 0;
//        curr = root;
//        while (curr.right != null) {
//            rh++;
//            curr = curr.right;
//        }
//        if (lh == rh) return (int) Math.pow(2, lh) - 1;
//        return 1 + countNodes(root.left) + countNodes(root.right);
//
//    }

//    public static String simplifyPath(String path) {
//        Deque<String> stack = new ArrayDeque<>();
//        String[] directories = path.split("/");
//        for (String dir : directories) {
//            if (dir.equals(".") || dir.isEmpty()) {
//                continue;
//            } else if (dir.equals("..")) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else {
//                stack.push(dir);
//            }
//        }
//        String ans = "/";
//        while (!stack.isEmpty()) {
//            ans = ans.concat(stack.getLast());
//            if (stack.size() != 1) ans += "/";
//            stack.removeLast();
//        }
//        return ans;
//    }
//
//    public static int calculate(int a, int b, String operator) {
//        return switch (operator) {
//            case "+" -> a + b;
//            case "-" -> a - b;
//            case "*" -> a * b;
//            case "/" -> a / b;
//            default -> 0;
//        };
//    }
//
//    public static int evalRPN(String[] tokens) {
//        Deque<Integer> dq = new ArrayDeque<>();
//        for (String s : tokens) {
//            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
//                int b = dq.pop();
//                int a = dq.pop();
//                int res = calculate(a, b, s);
//                dq.push(res);
//            } else {
//                dq.push(Integer.parseInt(s));
//            }
//        }
//        return dq.pop();
//    }
//
//    public Node connect(Node root) {
//        if (root == null) return root;
//        Queue<Node> q = new ArrayDeque<>();
//        q.offer(root);
//        q.offer(null);
//        while (q.size() > 1) {
//            Node curr = q.poll();
//            if (curr == null) {
//                q.offer(null);
//                continue;
//            }
//            curr.next = q.peek();
//            if (curr.left != null) q.offer(curr.left);
//            if (curr.right != null) q.offer(curr.right);
//        }
//        return root;
//    }
//
//
//    // [[1,3],[2,6],[8,10],[15,18]]
//    public int[][] merge(int[][] intervals) {
//        List<int[]> res = new ArrayList<>();
//        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//        for (int[] interval : intervals) {
//            if (res.isEmpty() || res.getLast()[1] < interval[0]) {
//                res.add(interval);
//            } else {
//                res.getLast()[1] = Math.max(interval[1], res.getLast()[1]);
//            }
//        }
//
//        return res.toArray(new int[res.size()][]);
//    }
//
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        List<int[]> res = new ArrayList<>();
//        int i = 0;
//        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
//            res.add(intervals[i]);
//            i++;
//        }
//
//        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
//            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
//            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
//            i++;
//        }
//        res.add(newInterval);
//        while (i < intervals.length) {
//            res.add(intervals[i]);
//            i++;
//        }
//        return res.toArray(new int[res.size()][]);
//    }
//
//    boolean isMatching(char x, char y) {
//        return (x == '}' && y == '{') || (x == ']' && y == '[') || x == ')' && y == '(';
//    }
//
//    public boolean isValid(String s) {
//        Deque<Character> dq = new ArrayDeque<>();
//        for (char x : s.toCharArray()) {
//            if (x == '{' || x == '[' || x == '(') dq.push(x);
//            else {
//                if (dq.isEmpty()) return false;
//                if (!isMatching(x, dq.pop())) {
//                    return false;
//                }
//            }
//        }
//        return dq.isEmpty();
//    }
}

