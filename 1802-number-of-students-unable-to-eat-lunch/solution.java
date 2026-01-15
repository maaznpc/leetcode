class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> std = new LinkedList<>();
        for (int s : students) {
            std.add(s);
        }
        int i=0;
        int rotations=0;
        while(rotations < std.size()){
            if(std.peek()==sandwiches[i]){
                std.poll();
                i++;
                rotations=0;
            }else{
                std.add(std.poll());
                rotations++;
            }
        }
        return std.size();
    }
}
