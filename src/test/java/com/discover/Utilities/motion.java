package com.discover.Utilities;

public class motion {

    public void isOpened(String vote) {

        int countYes = 0;
        int countNo = 0;


        for (int i = 1; i <= 10; i++) {

            if (vote.equalsIgnoreCase("yes")) {
                countYes++;
            } else if (vote.equalsIgnoreCase("no")) {
                countNo++;
            } else {
                System.out.println("Invalid input");
            }
        }

        if (countYes > countNo) {
            System.out.println("Voting passed");
        } else if (countYes < countNo) {
            System.out.println("Voting failed");
        } else if (countYes == countNo) {
            System.out.println("Voting is tie, Chairman must vote!");

        }

    }

    public void isClosed() {


    }

    public void tie(String chairmanVote) {

        if (chairmanVote.equalsIgnoreCase("yes")) {
            System.out.println("Voting passed");;
        } else if (chairmanVote.equalsIgnoreCase("no")) {
            System.out.println("Voting failed");
        } else {
            System.out.println("Invalid input");
        }


}


}
