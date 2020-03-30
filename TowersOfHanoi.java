/**
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *@assignment 4b
 *description: Towers of Hanoi implemented with a stack, serves
 *to test the StackADT and LStack objects prior to use in Ackermann
 */

 public class TowersOfHanoi{
  
    static Pole start = new Pole("A");
    static Pole aux = new Pole("B");
    static Pole finish = new Pole("C");
    public static void main(String[] args){
        //recurTower(3, 'A', 'C', 'B');
        TOH(3);
    }

    public static void TOH(int disk){
        AStack<Tuple> stack = new AStack<Tuple>(2*disk + 1);
        stack.push(new Tuple(disk, "TOH", start, finish, aux));
        while(stack.length() > 0){
            Tuple temp = stack.pop();
            if(temp.operation == "MOVE"){
                System.out.println(temp.disk + " moved from " + 
                temp.start.position + " to " + temp.finish.position);
            }else if(temp.disk > 0){
                stack.push(new Tuple(temp.disk - 1, "TOH", temp.aux,
                    temp.finish, temp.start));
                stack.push(new Tuple(temp.disk, "MOVE", temp.start,
                    temp.finish, temp.aux));
                stack.push(new Tuple(temp.disk - 1, "TOH", temp.start,
                    temp.aux, temp.finish));
            }
        }
    }

    /**
     * Rercursive implementation of Towers of Hanoi
     * @param disk number of disks
     * @param from_rod start rod
     * @param to_rod end rod
     * @param aux_rod middle rod
     */
    public static void recurTower(int disk, char from_rod, char to_rod, char aux_rod){
        if(disk == 1){
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        recurTower(disk-1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + disk + " from rod " +  from_rod + " to rod " + to_rod); 
        recurTower(disk-1, aux_rod, to_rod, from_rod); 
    }
 }