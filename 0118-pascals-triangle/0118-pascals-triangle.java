class Solution {
    public List<List<Integer>> generate(int row) {
        int n = 3;

        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1));

        if(row == 1) return list;

        list.add(Arrays.asList(1,1));

        if (row == 2) return list;

        for (int i = 0; i < row - 2; i++) {
            List<Integer> listIn = new ArrayList<>();
            listIn.add(1);
            Integer[] arr = list.get(list.size() - 1).toArray(new Integer[0]);
            for (int j = 0; j < arr.length - 1; j++) {
                listIn.add(arr[j] + arr[j + 1]);
            }
            listIn.add(1);
            list.add(listIn);
        }

        return list;
    }
}