package code;

public class User {

    private int[] ranks = new int[] {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};

    public int rank;

    public int progress;

    public int getRank() {
        return rank;
    }
    public User() {
        rank = -8;
        progress = 0;
    }

    public void incProgress (int task) {
        if (task < -8 || task > 8 || task == 0) {
            throw new IllegalArgumentException();
        }
        int [] rangs = new int[]{-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8};

        int i = -8;

        if (rank == 8) {
            return;
        }
        if (rank == task - 1) {
            progress = progress + 10;
            if (progress >=100) {
                rank=i++;
                progress = progress % 100;
                return;

            }

        }
        int counter = 0;

        if (task > rank) {
            for (int k = rank; k < rangs.length;k++) {
                counter++;
                if (rank== task)
                break;
            }
            if (rank > task -2) {
                return;
            }
            progress = 10 * counter * counter;
            if (progress >=100) {
                if (rank < 0) {
                    rank = rank + (progress / 100);
                    progress = progress % 100;
                }

            }

        }
        if (task == rank) {
            progress = progress + 3;
            if (progress >=100) {
                if (rank == 0) {
                    rank = rank + 3;
                    progress = progress % 100;
                }else {
                    rank++;
                    progress = progress % 100;
                }


            }
            if (rank == task - 1) {
                progress = progress + 1;
                if (progress >=100) {
                    if (rank == -1) {
                        rank=rank+2;
                        progress = progress % 100;
                    }else {
                        rank++;
                        progress = progress % 100;

                    }
                }
            }
        }
    }

    public void incProgress2(int task) {
        if (task < -8 || task > 8 || task == 0) {
            throw new IllegalArgumentException();
        }
        int dif, rankIndex = 0, taskIndex = 0, additionalRanks = 0;
        for (int i = 0; i < ranks.length; i++) {
            if (rank == ranks[i]) {
                rankIndex = i;
            }
            if (task == ranks[i]) {
                taskIndex = i;
            }
        }
        dif = taskIndex - rankIndex;

        if (dif == -1) {
            progress += 1;
        } else if (dif == 0) {
            progress += 3;
        } else {
            progress += dif * dif * 10;
        }

        additionalRanks = progress / 100;
        rank = ranks[rankIndex + additionalRanks];
        progress = progress % 100;
        if (rank == 8) {
            progress = 0;
        }
    }

}
