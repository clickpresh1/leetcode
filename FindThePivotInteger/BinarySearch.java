class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        
        int a = ((n * (n + 1)) / 2);

        int x = 1, y = a / 2;

        while (x <= y) {
            int root = x + ((y - x) / 2);

            if (root * root == a) return root;
            else if (root * root < a) x = root + 1;
            else y = root - 1;
        } 

        return -1;
    }
} 

// a = (x * (x + 1)) / 2
// b = (n * (n + 1)) / 2
// c = ((x - 1) * x) / 2

// b - c = a

// (((n * (n + 1))) / 2) - (((x - 1) * x) / 2) = (x * (x + 1)) / 2

// (((n * (n + 1))) / 2) = ((x * (x + 1)) / 2) + (((x - 1) * x) / 2)

// (((n * (n + 1))) / 2) = (x * ((x + 1) + (x - 1))) / 2

// (((n * (n + 1))) / 2) = (x * (2 * x)) / 2

// (((n * (n + 1))) / 2) = x * x






