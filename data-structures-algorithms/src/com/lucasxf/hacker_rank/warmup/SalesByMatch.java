package com.lucasxf.hacker_rank.warmup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Link: https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 *
 *
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 *
 * SUCCESS on 06/02/2024 11h12
 *
 */
public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        if (n == 0 || ar == null || ar.isEmpty()) {
            return 0;
        }
        final Map<Integer, Integer> socksPerColor = new HashMap<>();
        int pairs = 0;
        for (Integer sock : ar) {
            if (socksPerColor.get(sock) == null) {
                socksPerColor.put(sock, 1);
            } else {
                int number = socksPerColor.get(sock) + 1;
                socksPerColor.put(sock, number);
                if (number %2 == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

}
