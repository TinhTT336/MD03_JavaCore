package ra.lession.sortingteam;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        FootballTeam[] team = new FootballTeam[5];
        team[0] = new FootballTeam("A", 20, 30);
        team[1] = new FootballTeam("B", 20, 35);
        team[2] = new FootballTeam("C", 20, 29);
        team[3] = new FootballTeam("D", 20, 40);
        team[4] = new FootballTeam("E", 20, 30);

        System.out.println("Danh sach doi bong: "+ Arrays.toString(team));
        System.out.println("Danh sach doi bong sau khi sap xep bubbleSort: "+ Arrays.toString(sortBubble(team)));
        System.out.println("Danh sach doi bong sau khi sap xep selectionSort: "+ Arrays.toString(sortSelection(team)));
        System.out.println("Danh sach doi bong sau khi sap xep insertionSort: "+ Arrays.toString(sortInsertion(team)));
    }

    public static FootballTeam[]sortBubble(FootballTeam[]team){
        for (int i = 0; i < team.length-1; i++) {
            for (int j = 0; j < team.length-1-i; j++) {
                if(team[j].getScore()<team[j+1].getScore()){
                    FootballTeam temp=team[j];
                    team[j]=team[j+1];
                    team[j+1]=temp;
                }
            }
        }
        return team;
    }

    public static FootballTeam[]sortSelection(FootballTeam[]team){
        int max;
        for (int i = 0; i < team.length-1; i++) {
            max=i;
            for (int j = i+1; j < team.length ; j++) {
                if(team[j].getScore()>team[max].getScore()){
                    max=j;
                }
                if(max!=i){
                    FootballTeam temp=team[max];
                    team[max]=team[j];
                    team[j]=temp;
                }
            }
        }
        return team;
    }

    public static FootballTeam[]sortInsertion(FootballTeam[]team){
        int position;
        FootballTeam value;
        for (int i = 0; i < team.length; i++) {
            position=i;
            value=team[position];
            while(position>0&&value.getScore()>team[position-1].getScore()){
                team[position]=team[position-1];
                position--;
            }
        }
        return team;
    }

}
