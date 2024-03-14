package com.lucasxf;

import com.lucasxf.hacker_rank.arrays.HourglassSum;
import com.lucasxf.hacker_rank.arrays.NewYearChaos;
import com.lucasxf.hacker_rank.warmup.JumpingOnTheClouds;
import com.lucasxf.hacker_rank.warmup.RepeatedString;
import com.lucasxf.leetcode.arrays_strings.*;
import com.lucasxf.leetcode.arrays_strings.bonus.prefix_sum.FindHighestAltitude;
import com.lucasxf.leetcode.arrays_strings.bonus.sliding_window.MinSizeSubarraySum;
import com.lucasxf.leetcode.arrays_strings.bonus.two_pointers.ReverseWordsString3;
import com.lucasxf.leetcode.binary_search.LongestSubsequenceWithLimitedSum;
import com.lucasxf.leetcode.binary_search.Search2DMatrix;
import com.lucasxf.leetcode.binary_search.SearchInsertPosition;
import com.lucasxf.leetcode.hashing.LongestSubstrWoutRepeatChars;
import com.lucasxf.leetcode.hashing.checking_for_existence.CheckSentencePangram;
import com.lucasxf.leetcode.hashing.checking_for_existence.CountingElements;
import com.lucasxf.leetcode.hashing.checking_for_existence.MissingNumber;
import com.lucasxf.leetcode.hashing.counting.FindPlayersWithZeroOrOneLosses;
import com.lucasxf.leetcode.hashing.counting.LargestUniqueNumber;
import com.lucasxf.leetcode.hashing.counting.MaxNumberOfBalloons;
import com.lucasxf.leetcode.linked_lists.fast_and_slow_pointers.DeleteDuplicatesFromSortedList;
import com.lucasxf.leetcode.linked_lists.ListNode;
import com.lucasxf.leetcode.linked_lists.fast_and_slow_pointers.MiddleOfLinkedList;
import com.lucasxf.leetcode.linked_lists.reverse_linked_lists.ReverseLinkedList2;
import com.lucasxf.leetcode.stacks_and_queues.queues.MovingAverage;
import com.lucasxf.leetcode.stacks_and_queues.stacks.BackspaceStringCompare;
import com.lucasxf.leetcode.stacks_and_queues.stacks.MakeTheStringGood;
import com.lucasxf.leetcode.stacks_and_queues.stacks.SimplifyPath;
import com.lucasxf.leetcode.trees_and_graphs.trees.TreeNode;
import com.lucasxf.leetcode.trees_and_graphs.trees.bfs.*;
import com.lucasxf.leetcode.trees_and_graphs.trees.bst.ValidateBinarySearchTree;
import com.lucasxf.leetcode.trees_and_graphs.trees.dfs.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final Main main = new Main();
        /**
         * LeetCode
         */
        //main.testReverseString();
        //main.testSquaresSortedArray();
        //main.testMaxAverageSubarray1();
        //main.testMaxConsecutiveOnes3();
        //main.testRunningSum1dArray();
        //main.testMinValToGetPosStepByStepSum();
        //main.testK_RadiusSubarrayAverages();
        //main.testReverseWordsString3();
        //main.testMinSizeSubarraySum();
        //main.testFindHighestAltitude();
        //main.testCheckSentencePangram();
        //main.testMissingNumber();
        //main.testCountingElements();
        //main.testFindPlayersWithZeroOrOneLosses();
        //main.testLargestUniqueNumber();
        //main.testMaxNumberOfBalloons();
        //main.testLongestSubstrWoutRepeatChars();
        //main.testMiddleOfLinkedList();
        //main.testDeleteDuplicatesFromSortedList();
        //main.testReverseLinkedList2();
        //main.testBackspaceStringCompare();
        //main.testSimplifyPath(); fail
        //main.testMakeTheStringGood(); fail
        //main.testMovingAverage();
        //main.testMaxDepthBinaryTree();
        //main.testPathSum(); fail
        // main.testCountGoodNodes(); SUCCESS
        //main.testSameTree(); success
        //main.testMinDepthBinaryTree(); success
        //main.testMaxDifferenceBetweenNodeAndAncestor(); success
        //main.testDiameterOfBinaryTree(); fail
        //main.testPrintNodes(); // n/a
        //main.testRightSideView(); // success
        //main.testLargestValueInEachTreeRow(); // success
        //main.testDeepestLeavesSum(); // success
        // main.testZigzagLevelOrderTraversal(); fail
        //main.testValidateBinarySearchTree(); fail - MEDIUM
        // main.testSearch2DMatrix(); // success
        // main.testSearchInsertPosition(); // success
        //main.testLongestSubsequenceWithLimitedSum();
        //main.testLongestPalindromicSubstring();

        /**
         * HackerRank
         */
        //main.testJumpingOnTheClouds(); // FAIL
//        main.testRepeatedString(); // Success
        //main.testHourglassSum(); // success
        main.testNewYearChaos();
    }

    private void testNewYearChaos() {
        NewYearChaos nyc = new NewYearChaos();
        nyc.minimumBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
    }

    private void testHourglassSum() {
        HourglassSum hourglassSum = new HourglassSum();
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0),
                Arrays.asList(0, 0, 2, 4, 4, 0),
                Arrays.asList(0, 0, 0, 2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0));
        int sum = hourglassSum.hourglassSum(input);
        System.out.printf("Sum: " + sum);
    }

    private void testRepeatedString() {
        RepeatedString rs = new RepeatedString();
        long countA = rs.repeatedString("udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps", 872514961806L);
        System.out.println("As: " + countA);
    }

    private void testJumpingOnTheClouds() {
        JumpingOnTheClouds jotc = new JumpingOnTheClouds();
        int steps = jotc.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
        System.out.println("Steps: " + steps);
        System.out.println();
        int s2 = jotc.jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        System.out.println("Steps: " + s2);
    }

    private void testLongestPalindromicSubstring() {
        LongestPalindromicSubstring lpsubstr = new LongestPalindromicSubstring();
        String ababac = lpsubstr.longestPalindrome("cxbababc");
        System.out.println(ababac);
    }

    private void testLongestSubsequenceWithLimitedSum() {
        LongestSubsequenceWithLimitedSum limitedSum = new LongestSubsequenceWithLimitedSum();
        int[] nums = {4, 5, 2, 1};
        int[] nums2 = {2, 3, 4, 5};
        int[] queries = {3, 10, 21};
        int[] q2 = {1};
        int[] answerQueries = limitedSum.answerQueries(nums2, q2);
        System.out.println("Result: " + Arrays.toString(answerQueries));
    }

    private void testSearchInsertPosition() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int t1 = 5;
        int t2 = 2;
        int t3 = 7;
        int result = sip.searchInsert(nums, t2);
        System.out.println("Result: " + result);
    }

    private void testSearch2DMatrix() {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean b = search2DMatrix.searchMatrix(input, 3);
        System.out.println("Result: " + b);
    }

    private void testValidateBinarySearchTree() {
        ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
        TreeNode l = new TreeNode(1);
        TreeNode r = new TreeNode(3);
        TreeNode root = new TreeNode(2, l, r);
        boolean validBST = vbst.isValidBST(root);
        System.out.println("Result:" + validBST);
    }

    private void testZigzagLevelOrderTraversal() {
        ZigzagLevelOrderTraversal zlot = new ZigzagLevelOrderTraversal();
        TreeNode ll = new TreeNode(4);
        TreeNode l = new TreeNode(2, ll, null);
        TreeNode rr = new TreeNode(5);
        TreeNode r = new TreeNode(3, null, rr);
        TreeNode root = new TreeNode(1, l, r);
        List<List<Integer>> zigzagged = zlot.zigzagLevelOrder(root);
        System.out.println("Result: " + zigzagged);
    }

    private void testDeepestLeavesSum() {
        DeepestLeavesSum dls = new DeepestLeavesSum();
        //[1,2,3,4,5,null,6,7,null,null,null,null,8]
        TreeNode lll = new TreeNode(7);
        TreeNode ll = new TreeNode(4, lll, null);
        TreeNode lr = new TreeNode(5);
        TreeNode l = new TreeNode(2, ll, lr);
        TreeNode rrr = new TreeNode(8);
        TreeNode rr = new TreeNode(6, null, rrr);
        TreeNode r = new TreeNode(3, null, rr);
        TreeNode root = new TreeNode(1, l, r);
        int deepestLeavesSum = dls.deepestLeavesSum(root);
        System.out.println("Result: " + deepestLeavesSum);
    }

    private void testLargestValueInEachTreeRow() {
        LargestValueInEachTreeRow lvr = new LargestValueInEachTreeRow();
        TreeNode ll = new TreeNode(5);
        TreeNode lr = new TreeNode(3);
        TreeNode l = new TreeNode(3, ll, lr);
        TreeNode rr = new TreeNode(9);
        TreeNode r = new TreeNode(2, null, rr);
        TreeNode root = new TreeNode(1, l, r);
        List<Integer> largestValues = lvr.largestValues(root);
        System.out.println("Result: " + largestValues);
    }

    private void testRightSideView() {
        RightSideView rightSideView = new RightSideView();
        TreeNode lr = new TreeNode(5);
        TreeNode l = new TreeNode(2, null, lr);
        TreeNode rr = new TreeNode(4);
        TreeNode r = new TreeNode(3, null, rr);
        TreeNode root = new TreeNode(1, l, r);
        List<Integer> sideView = rightSideView.rightSideView(root);
        System.out.println("Result:" + sideView);
    }

    private void testPrintNodes() {
        PrintNodes printNodes = new PrintNodes();
        TreeNode lll = new TreeNode(7);
        TreeNode llr = new TreeNode(2);
        TreeNode ll = new TreeNode(11, lll, llr);
        TreeNode l = new TreeNode(4, ll, null);
        TreeNode rrr = new TreeNode(1);
        TreeNode rr = new TreeNode(4, null, rrr);
        TreeNode rl = new TreeNode(13);
        TreeNode r = new TreeNode(8, rl, rr);
        TreeNode root = new TreeNode(5, l, r);
        printNodes.printAllNodes(root);
    }

    private void testDiameterOfBinaryTree() {
        DiameterOfBinaryTree dbt = new DiameterOfBinaryTree();
        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(5);
        TreeNode l = new TreeNode(2, ll, lr);
        TreeNode r = new TreeNode(3);
        TreeNode root = new TreeNode(1, l, r);
        int diameter = dbt.diameterOfBinaryTree(root);
        System.out.println("Result: " + diameter);
    }

    private void testMaxDifferenceBetweenNodeAndAncestor() {
        MaxDifferenceBetweenNodeAndAncestor mdbna = new MaxDifferenceBetweenNodeAndAncestor();
        TreeNode lrl = new TreeNode(4);
        TreeNode lrr = new TreeNode(7);
        TreeNode ll = new TreeNode(1);
        TreeNode lr = new TreeNode(6, lrl, lrr);
        TreeNode l = new TreeNode(3, ll, lr);
        TreeNode rrl = new TreeNode(13);
        TreeNode rr = new TreeNode(14, rrl, null);
        TreeNode r = new TreeNode(10, null, rr);
        TreeNode root = new TreeNode(8, l, r);
        int maxAncestorDiff = mdbna.maxAncestorDiff(root);
        System.out.println("Result: " + maxAncestorDiff);

    }

    private void testMinDepthBinaryTree() {
        MinDepthBinaryTree mdbt = new MinDepthBinaryTree();


        TreeNode r1l = new TreeNode(15);
        TreeNode r1r = new TreeNode(7);
        TreeNode r1 = new TreeNode(20, r1l, r1r);
        TreeNode l1 = new TreeNode(9);
        TreeNode root = new TreeNode(3, l1, r1);
        /**/
        // [2,null,3,null,4,null,5,null,6]

        /*
        TreeNode r4 = new TreeNode(6);
        TreeNode r3 = new TreeNode(5, null, r4);
        TreeNode r2 = new TreeNode(4, null, r3);
        TreeNode r1 = new TreeNode(3, null, r2);
        TreeNode root = new TreeNode(2, null, r1);
        /**/
        int minDepth = mdbt.minDepth(root);
        System.out.println("Result: " + minDepth);
    }

    private void testSameTree() {
        SameTree sameTree = new SameTree();
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        //TreeNode l2 = new TreeNode(1);
        //TreeNode r2 = new TreeNode(1);
        TreeNode rootP = new TreeNode(1, l1, r1);
        TreeNode rootQ = new TreeNode(1, l1, r1);
        boolean tree = sameTree.isSameTree(new TreeNode(), new TreeNode());
        System.out.println("Result: " + tree);
    }

    private void testCountGoodNodes() {
        CountGoodNodes cgd = new CountGoodNodes();
/*
        TreeNode r1r1 = new TreeNode(5);
        TreeNode r1l1 = new TreeNode(1);
        TreeNode r1 = new TreeNode(4, r1l1, r1r1);
        TreeNode l1l1 = new TreeNode(3);
        TreeNode l1 = new TreeNode(1, l1l1, null);
        TreeNode root = new TreeNode(3, l1, r1);
        */

        TreeNode r1r1 = new TreeNode(8, new TreeNode(4), null);
        TreeNode r1l1 = new TreeNode(10);
        TreeNode r1 = new TreeNode(4, r1l1, r1r1);
        TreeNode root = new TreeNode(2, null, r1);


        int goodNodes = cgd.goodNodes(root);
        System.out.println("Result: " + goodNodes);
    }

    private void testPathSum() {
        PathSum pathSum = new PathSum();
        // left nodes
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node11 = new TreeNode(11, node7, node2);
        TreeNode node4l = new TreeNode(4, node11, null);

        // right nodes
        TreeNode node1 = new TreeNode(1);
        TreeNode node4r = new TreeNode(4, null, node1);
        TreeNode node13 = new TreeNode(13);
        TreeNode node8 = new TreeNode(8, node13, node4r);

        TreeNode root = new TreeNode(5, node4l, node8);
        int targetSum = 22;
        System.out.println("Root: " + root);
        boolean hasPathSum = pathSum.hasPathSum(root, targetSum);
        System.out.println("Result: " + hasPathSum);
    }

    private void testMaxDepthBinaryTree() {
        MaxDepthBinaryTree mdbt = new MaxDepthBinaryTree();
        TreeNode r1l1 = new TreeNode(15);
        TreeNode r1r1 = new TreeNode(7);

        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20, r1l1, r1r1);
        TreeNode root = new TreeNode(3, l1, r1);
        //int maxDepth = mdbt.maxDepth(root);
        int maxDepth = mdbt.maxDepth(new TreeNode());
        System.out.println("Max depth: " + maxDepth);
    }

    private void testMovingAverage() {
        MovingAverage ma = new MovingAverage(3);
        double next = ma.next(1);
        System.out.println("Next: " + next);
        next = ma.next(10);
        System.out.println("Next: " + next);
        next = ma.next(3);
        System.out.println("Next: " + next);
        next = ma.next(5);
        System.out.println("Next: " + next);
    }

    private void testMakeTheStringGood() {
        MakeTheStringGood msg = new MakeTheStringGood();
        String result = msg.makeGood("abBAcC");
        System.out.println("Result: " + result);
    }

    private void testSimplifyPath() {
        SimplifyPath sp = new SimplifyPath();
        String input1 = "/home/";
        String input2 = "/../";
        String input3 = "/home//foo/";
        String input4 = "/a/./b/../../c/";
        String input5 = "/a/../../b/../c//.//";
        String s = sp.simplifyPath(input5);
        System.out.println("Result: " + s);
    }

    private void testBackspaceStringCompare() {
        BackspaceStringCompare bsc = new BackspaceStringCompare();
        String s = "y#fo##f";
        String t = "y#f#o##f";
        boolean result = bsc.backspaceCompare(s, t);
        System.out.println("Result: " + result);
    }

    private void testReverseLinkedList2() {
        ReverseLinkedList2 rll2 = new ReverseLinkedList2();
        ListNode linkedList = get5NodesLinkedList();
        System.out.println("Input: " + linkedList + "\n");
        ListNode listNode = rll2.reverseBetween(linkedList, 2, 4);
        System.out.println("\nOutput: " + listNode);
    }

    private ListNode get5NodesLinkedList() {
        final ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode.addNode(second, head);
        ListNode.addNode(third, second);
        ListNode.addNode(fourth, third);
        ListNode.addNode(fifth, fourth);
        return head;
    }

    private void testDeleteDuplicatesFromSortedList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);
        ListNode.addNode(second, head);
        ListNode.addNode(third, second);
        ListNode.addNode(fourth, third);
        ListNode.addNode(fifth, fourth);
        DeleteDuplicatesFromSortedList ddsll = new DeleteDuplicatesFromSortedList();
        System.out.println("Input: " + head + "\n");
        ListNode result = ddsll.deleteDuplicates(head);
        System.out.println("\nOutput: " + result);
    }

    private void testMiddleOfLinkedList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode.addNode(second, head);
        ListNode.addNode(third, second);
        ListNode.addNode(fourth, third);
        ListNode.addNode(fifth, fourth);
        MiddleOfLinkedList mll = new MiddleOfLinkedList();
        ListNode middleNode = mll.middleNode(head);
        System.out.println(middleNode);
    }

    private void testLongestSubstrWoutRepeatChars() {
        LongestSubstrWoutRepeatChars lswrc = new LongestSubstrWoutRepeatChars();
        int length = lswrc.lengthOfLongestSubstring("pwwkew");
        System.out.println("Result: " + length);
    }

    private void testMaxNumberOfBalloons() {
        MaxNumberOfBalloons mnb = new MaxNumberOfBalloons();
        String input = "leetcode";
        int result = mnb.maxNumberOfBalloons(input);
        System.out.println("Result: " + result);
    }

    private void testLargestUniqueNumber() {
        LargestUniqueNumber lun = new LargestUniqueNumber();
        int[] input = {8, 2, 8, 3, 8, 9, 9, 5, 7, 7, 5, 6};
        int result = lun.largestUniqueNumber(input);
        System.out.println("Result: " + result);
    }

    private void testFindPlayersWithZeroOrOneLosses() {
        FindPlayersWithZeroOrOneLosses zeroOrOneLosses = new FindPlayersWithZeroOrOneLosses();
        int[][] input = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        int[][] imput = {{1, 5}, {2, 5}, {2, 8}, {2, 9}, {3, 8}, {4, 7}, {4, 9}, {5, 7}, {6, 8}};
        List<List<Integer>> winners = zeroOrOneLosses.findWinnersSimplified(imput);
        System.out.println(winners);
    }

    private void testCountingElements() {
        CountingElements ce = new CountingElements();
        int[] input = {1, 1, 1, 2, 3, 4, 5, 5, 6};
        int result = ce.countElements(input);
        System.out.println(result);
    }

    private void testMissingNumber() {
        MissingNumber mn = new MissingNumber();
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int i = mn.missingNumber(input);
        System.out.println(i);
    }

    private void testCheckSentencePangram() {
        CheckSentencePangram csp = new CheckSentencePangram();
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(csp.checkIfPangramAlt(input));
    }

    private void testFindHighestAltitude() {
        FindHighestAltitude fha = new FindHighestAltitude();
        int[] input = {-4, -3, -2, -1, 4, 3, 2};
        int largestAltitude = fha.largestAltitude(input);
        System.out.println("Result: " + largestAltitude);
    }

    private void testMinSizeSubarraySum() {
        MinSizeSubarraySum msss = new MinSizeSubarraySum();
        int[] input = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = msss.minSubArrayLen(target, input);
        System.out.println("Result: " + result);
    }

    private void testReverseWordsString3() {
        ReverseWordsString3 rws3 = new ReverseWordsString3();
        String input = "Let's take LeetCode contest";
        System.out.println(rws3.reverseWords(input));
    }

    private void testK_RadiusSubarrayAverages() {
        K_RadiusSubarrayAverages kRadiusAverages = new K_RadiusSubarrayAverages();
        int[] input = //{7, 4, 3, 9, 1, 8, 5, 2, 6};
                {40527, 53696, 10730, 66491, 62141, 83909, 78635, 18560};

        //{18334, 25764, 19780, 92480, 69842, 73255, 89893};

        int k = 2;
        int[] averages = kRadiusAverages.getAverages(input, k);
        System.out.println("Result: " + Arrays.toString(averages));
    }

    private void testMinValToGetPosStepByStepSum() {
        MinValToGetPosStepByStepSum min = new MinValToGetPosStepByStepSum();
        int[] input = {1, 2};//;{1, -2, -3};// {-3, 2, -3, 4, 2};
        int i = min.minStartValue(input);
        System.out.println("Min " + i);
    }

    private void testReverseString() {
        char[] input = new char[]{'L', 'u', 'c', 'a', 's'};
        ReverseString rs = new ReverseString();
        char[] output = rs.reversedString(input);
        String s = new String(output);
        System.out.println("S: " + s);
        System.out.println("output:" + Arrays.toString(output));
    }

    private void testSquaresSortedArray() {
        SquaresSortedArray ssa = new SquaresSortedArray();
        int[] input = {-7, -3, 2, 3, 11};//{-4, -1, 0, 3, 10};
        //;// {-4, -1, 0, 3, 10};
        int[] result = ssa.sortedSquares(input);
        System.out.println(Arrays.toString(result));
    }

    private void testMaxAverageSubarray1() {
        MaxAverageSubarray1 masa = new MaxAverageSubarray1();
        int[] input = //{-1};// {1, 12, -5, -6, 50, 3};
                {8860, -853, 6534, 4477, -4589, 8646, -6155, -5577, -1656, -5779, -2619, -8604, -1358, -8009, 4983, 7063, 3104, -1560, 4080,
                        2763, 5616, -2375, 2848, 1394, -7173, -5225, -8244, -809, 8025, -4072, -4391, -9579, 1407, 6700, 2421, -6685, 5481,
                        -1732, -8892, -6645, 3077, 3287, -4149, 8701, -4393, -9070, -1777, 2237, -3253, -506, -4931, -7366, -8132, 5406,
                        -6300, -275, -1908, 67, 3569, 1433, -7262, -437, 8303, 4498, -379, 3054, -6285, 4203, 6908, 4433, 3077, 2288, 9733,
                        -8067, 3007, 9725, 9669, 1362, -2561, -4225, 5442, -9006, -429, 160, -9234, -4444, 3586, -5711, -9506, -79, -4418, -4348, -5891};
        int k = 93;//4;
        double result = masa.findMaxAverage(input, k);
        System.out.println("Result: " + result);
    }

    private void testMaxConsecutiveOnes3() {
        MaxConsecutiveOnes3 mc1s = new MaxConsecutiveOnes3();
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int result = mc1s.longestOnes(input, k);
        System.out.println("Result: " + result);
    }

    private void testRunningSum1dArray() {
        RunningSum1dArray rsa = new RunningSum1dArray();
        int[] input = {3, 1, 2, 10, 1};
        int[] result = rsa.runningSum(input);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
