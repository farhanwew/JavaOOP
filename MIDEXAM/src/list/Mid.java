package list;

public class Mid extends List {

    // 8
    static List negateAll(List a) {
        // if the list is empty, return an empty list
        if (a.empty()) {
            return List.nil();
        } 
        else {
            // Recursively negate the head and continue with the tail
            return cons(-a.head(), negateAll(a.tail()));
        }
    }

    // 9
    static int find(int x, List a) {
        // if the list is empty, return -1 == not found
        if (a.empty()) {
            return -1;
        }
        // if the head matches the value, return the index 0
        if (a.head() == x) {
            return 0;
        }
        // Recursively search in the tail
        int idx = find(x, a.tail());
        
        // if not found in the tail, return -1; otherwise return the found index incremented by 1
        if (idx == -1) {
            return -1;

        } 
        else {
            return idx + 1;
        }
    }

    // 10
    static boolean allPositive(List a) {
        // if the list is empty, return true (base case)
        if (a.empty()) {
            return true;
        }
        
        // if the head is not positive, return false
        if (a.head() <= 0) {
            return false;
        } 
        else {
            // Recursively check the tail
            return allPositive(a.tail());
        }
    }

    // 11
    static List positives(List a) {
        
        // if the list is empty, return an empty list
        if (a.empty()) {
            return List.nil();
        }

        // if the head is positive, include it in the new list
        if (a.head() > 0) {
            return cons(a.head(), positives(a.tail()));
        } 
        
        else {
            // skip the head and continue with the tail
            return positives(a.tail()); 
        }
    }

    // 12
    static boolean sorted(List a) {
        // if the list is empty or has only one element, it is sorted
        if (a.empty() || a.tail().empty()) {
            return true;
        }
        // if the head is greater than the next element, the list is not sorted
        if (a.head() > a.tail().head()) {
            return false;
        } 
        else {
            // Recursively check the tail
            return sorted(a.tail());
        }
    }
    
    // 13
    static List merge(List a, List b) {
        // if list 'a' is empty, return list 'b'
        if (a.empty()) {
            return b;
        }

        // if the head of 'a' is less than or equal to the head of 'b', include it in the merged list
        if (a.head() <= b.head()) {
            return cons(a.head(), merge(a.tail(), b));
        } 
        else {
            // include the head of 'b' in the merged list
            return cons(b.head(), merge(b.tail(), a));
        }
    }

    // 14
    static List removeDuplicate(List a) {
        // if the list is empty, return an empty list
        if (a.empty()) {
            return List.nil();
        } 
        else {
            // Include the head and recursively remove duplicates from the tail after skipping duplicates
            return cons(a.head(), removeDuplicate(skip(a.head(), a.tail())));
        }
    }
    
    // 15
    static List skip(int x, List a) {
        // if the list is empty, return an empty list
        if (a.empty()) {
            return List.nil();
        }

        // if the head matches the value to skip, skip it and continue with the tail
        if (a.head() == x) { 
            return skip(x, a.tail());
        } 
        else {
            // Include the head and continue skipping in the tail
            return cons(a.head(), skip(x, a.tail()));
        }
    }
}
