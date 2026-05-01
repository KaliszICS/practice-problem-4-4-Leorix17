/*
* File: Lesson 4.4: Boolean functions with loops
* Author: Leo
* Date Created: April 24, 2026
* Date Last Modified: April 24, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {
        System.out.println(hasCapital("hello"));
	}
    
    public static Boolean hasCapital(String word) {
        boolean flag = false;
        
        for(int i = 0; i < word.length(); i++) {
    			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
    				flag = true;
    			}
    		}
    	return flag;
    }

    
    public static Boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
