
import java.util.Scanner;
public class BellmanFord {
private int D[];
private int num_ver;
public static final int MAX_VALUE=999;
public BellmanFord(int num_ver){
this.num_ver=num_ver;
D = new int[num_ver+1];
}
public void BellmanFordEvaluation(int source,int a[][]){
for(int node=1 ;node <= num_ver ;node++){
D[node]=MAX_VALUE;
}
D[source]=0;
for(int node=1 ;node <= num_ver; node++){
for(int sn=1; sn <= num_ver; sn++){
for(int dn=1; dn <= num_ver; dn++){
if(a[sn][dn] < 0)
D[dn]=0;
else{
if(a[sn][dn] != MAX_VALUE){
if(D[dn] > D[sn]+a[sn][dn])
D[dn] = D[sn]+a[sn][dn];
}
}
}
}
}
for(int sn=1; sn <= num_ver; sn++){
for(int dn=1; dn <= num_ver; dn++){}
}
}
for(int vertex=1; vertex <= num_ver; vertex++){
System.out.println("distance of source "+ source + " to "+ vertex +" is
"+D[vertex]);
}
}
public static void main(String args[]){
int num_ver=0,source;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of vertex");
num_ver=s.nextInt();
int a[][]=new int[num_ver+1][num_ver+1];
System.out.println("enter the adjacency matrix");
for(int sn=1; sn <= num_ver; sn++){
for(int dn=1; dn <=num_ver; dn++){
a[sn][dn]=s.nextInt();
if(sn==dn){
a[sn][dn]=0;
continue;
}
if(a[sn][dn]==0){
a[sn][dn]=MAX_VALUE;
}
}
}
System.out.println("enter the source vertex");
source=s.nextInt();
BellmanFord b = new BellmanFord(num_ver);
b.BellmanFordEvaluation(source, a);
s.close();
}
}
if(a[sn][dn] != MAX_VALUE){
if(D[dn] > D[sn]+a[sn][dn]){
System.out.println("the graph contains negative edge
cycle");
}
}
}
}
for(int vertex=1; vertex <= num_ver; vertex++){
System.out.println("distance of source "+ source + " to "+ vertex +" is
"+D[vertex]);
}
}
public static void main(String args[]){
int num_ver=0,source;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of vertex");
num_ver=s.nextInt();
int a[][]=new int[num_ver+1][num_ver+1];
System.out.println("enter the adjacency matrix");
for(int sn=1; sn <= num_ver; sn++){
for(int dn=1; dn <=num_ver; dn++){
a[sn][dn]=s.nextInt();
if(sn==dn){
a[sn][dn]=0;
continue;
}
if(a[sn][dn]==0){
a[sn][dn]=MAX_VALUE;
}
}
}
System.out.println("enter the source vertex");
source=s.nextInt();
BellmanFord b = new BellmanFord(num_ver);
b.BellmanFordEvaluation(source, a);
s.close();
}
}
