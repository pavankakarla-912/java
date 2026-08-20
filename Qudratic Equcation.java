class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> result = new ArrayList<>();

        // Calculate the discriminant (b^2 - 4ac)
        double d = Math.pow(b, 2) - 4.0 * a * c;

        // If discriminant is less than 0, roots are imaginary
        if (d < 0) {
            result.add(-1);
            return result;
        }

        // Calculate the roots
        double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(d)) / (2.0 * a);

        // Get the floor values of the roots
        int r1 = (int) Math.floor(root1);
        int r2 = (int) Math.floor(root2);

        // Add roots in decreasing order (maximum first)
        result.add(Math.max(r1, r2));
        result.add(Math.min(r1, r2));

        return result;
    }
}
