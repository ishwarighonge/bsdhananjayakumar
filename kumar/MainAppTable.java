package kumar;

class PrintMultiplicationTable{
synchronized void printTable(int num) {
for(int i=1;i<=10;i++) {
System.out.println(num+"x"+i+"="+num*i);

}
}
}


class Table1 extends Thread{
PrintMultiplicationTable pob;

public Table1(PrintMultiplicationTable pob) {
this.pob = pob;
}

public void run() {
pob.printTable(5);
}
}


class Table2 extends Thread{
PrintMultiplicationTable pob;

public Table2(PrintMultiplicationTable pob) {
this.pob = pob;
}

public void run() {
pob.printTable(2);
}
}


public class MainAppTable {


public static void main(String[] args) throws InterruptedException {
PrintMultiplicationTable pmt = new PrintMultiplicationTable();
Table1 t1 = new Table1(pmt);
Table2 t2 = new Table2(pmt);
t1.start();
//t1.join();
t2.start();


}


}
