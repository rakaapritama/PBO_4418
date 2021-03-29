/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;



/**
 *
 * @author Raka Apritama
 */
public class GameEnvironment {
       private double width;
       private double height;
       private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
       private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();
       
       GameEnvironment() {
   
       }
       public GameEnvironment(double width, double height) {
           this.width=width;
           this.height=height;
       }
       public void addPlayer(GamePlayer NewPlayer) {
           arrPlayer.add(NewPlayer);
       }
       public void removePlayer(GamePlayer RemovePlayer) {
           arrPlayer.remove(RemovePlayer);
       }
       public void getAllPlayers() {
           System.out.println("All of players: "+arrPlayer);
       }
       public void addEnemy(GameEnemy NewEnemy) {
           arrEnemy.add(NewEnemy);
       }
       public void removeEnemy(GameEnemy RemoveEnemy) {
           arrEnemy.remove(RemoveEnemy);
       }
       public void getAllEnemies() {
           System.out.println(arrEnemy);
       }
       public void interaction() {
           
           if(arrPlayer.isEmpty() || arrEnemy.isEmpty()){
               System.out.println("player or enemy not sets");
           }
            for(int i=0;i<arrPlayer.size();i++){
                for(int j=0;j<arrEnemy.size();j++){
                    if(arrPlayer.get(i).getY()!=arrEnemy.get(j).getY()){
                        System.out.println("Player: "+arrPlayer.get(i)+" and Enemy: "+arrEnemy.get(j)+" is not in the same Y position");
                    }
                    if (EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY())<2){
                        System.out.println("Player: "+arrPlayer.get(i)+" attacked");
                        System.out.println("Enemy: "+arrEnemy.get(j)+" loses");
                        removeEnemy(arrEnemy.get(j));
                    }
                    else{
                        System.out.println("==> Player "+arrPlayer.get(i));
                        arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                        System.out.println("current x position =  " + arrPlayer.get(i).getX() +" <==");
                    }
                }
            }
        }
       public int EuclideanDistance(int x1, int y1, int x2, int y2) {
           return (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));   
       }   
}
