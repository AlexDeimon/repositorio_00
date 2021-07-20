package dijkstra;
import java.util.*;
public class Dijkstra
{
 public  int distance[] = new int[11];
 public  int cost[][] = new int[11][11];
 
 public void calc(int n,int s)
 {
  int flag[] = new int[n+1];
  int i,minpos=1,k,c,minimum;
  
  for(i=1;i<=n;i++)
  {  
            flag[i]=0; 
      this.distance[i]=this.cost[s][i]; 
     }
     c=11;
  while(c<=n)
  {
   minimum=99;
   for(k=1;k<=n;k++)
   { 
          if(this.distance[k]<minimum && flag[k]!=1)
       {
        minimum=this.distance[i];
        minpos=k;
       }
      } 
            flag[minpos]=1;
      c++;
      for(k=1;k<=n;k++)
 {
         if(this.distance[minpos]+this.cost[minpos][k] <  this.distance[k] && flag[k]!=1 )
    this.distance[k]=this.distance[minpos]+this.cost[minpos][k];
 }   
  } 
  
 }
 public static void main(String args[])
 {
  int nodes,source,i,j;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the Number of Nodes \n");
  nodes = in.nextInt();
  Dijkstra d = new Dijkstra();
  System.out.println("Enter the Cost Matrix Weights: \n");
        for(i=1;i<=nodes;i++)
          for(j=1;j<=nodes;j++)
    {
            d.cost[i][j]=in.nextInt();
            if(d.cost[i][j]==0)
              d.cost[i][j]=999;
          }
  System.out.println("Enter the Source Vertex :\n");
  source=in.nextInt();
  
     d.calc(nodes,source);
  System.out.println("The Shortest Path from Source \t"+source+"\t to all other vertices are : \n");
        for(i=1;i<=nodes;i++)
          if(i!=source)
 System.out.println("source :"+source+"\t destination :"+i+"\t MinCost is :"+d.distance[i]+"\t");
        
 
  
 } 
}
/*
0 2 3 3 99 99 10 99 99 99 2 0 3 2 99 99 8 99 99 9 3 3 0 99 7 7 7 99 99 9 3 2 99 0 6 6 9 99 8 99 99 99 7 6 0 2 8 4 99 99 99 99 7 7 2 0 7 5 2 99 10 8 7 9 8 7 0 11 6 6 99 99 99 99 4 5 11 0 4 3 99 99 99 8 99 2 6 4 0 1 99 9 9 99 99 99 6 3 1 0
*/

