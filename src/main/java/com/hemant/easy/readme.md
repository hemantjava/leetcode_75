## $_345 Approach

Identify Vowels: Vowels include 'a', 'e', 'i', 'o', 'u' (both uppercase and lowercase).
Two-Pointer Technique:

* Use two pointers: one starting from the beginning (left) and the other from the end (right).
* Move the left pointer forward until it points to a vowel.
* Move the right pointer backward until it points to a vowel.
* Swap the vowels at left and right and move the pointers closer.
* Stop Condition: Stop when the left pointer is greater than or equal to the right pointer.
* Time Complexity and Space Complexity:𝑂(𝑛) & O(n)
 
